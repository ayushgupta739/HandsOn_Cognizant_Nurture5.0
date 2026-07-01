CREATE TABLE Customers (
    CustomerID NUMBER PRIMARY KEY,
    CustomerName VARCHAR2(50),
    Age NUMBER,
    Balance NUMBER(10,2),
    IsVIP VARCHAR2(5)
);

CREATE TABLE Loans (
    LoanID NUMBER PRIMARY KEY,
    CustomerID NUMBER,
    InterestRate NUMBER(5,2),
    DueDate DATE,
    CONSTRAINT fk_customer
        FOREIGN KEY (CustomerID)
        REFERENCES Customers(CustomerID)
);

INSERT INTO Customers VALUES
(1, 'Amit Sharma', 68, 15000, 'FALSE');

INSERT INTO Customers VALUES
(2, 'Priya Singh', 28, 7000, 'FALSE');

INSERT INTO Customers VALUES
(3, 'Raj Gupta', 64, 18000, 'FALSE');

INSERT INTO Customers VALUES
(4, 'Neha Verma', 31, 9500, 'FALSE');

INSERT INTO Customers VALUES
(5, 'Sunil Kumar', 72, 25000, 'FALSE');

INSERT INTO Loans VALUES
(101, 1, 9.5, SYSDATE + 15);

INSERT INTO Loans VALUES
(102, 2, 10.2, SYSDATE + 45);

INSERT INTO Loans VALUES
(103, 3, 8.8, SYSDATE + 20);

INSERT INTO Loans VALUES
(104, 4, 11.0, SYSDATE + 60);

INSERT INTO Loans VALUES
(105, 5, 9.0, SYSDATE + 10);

COMMIT;