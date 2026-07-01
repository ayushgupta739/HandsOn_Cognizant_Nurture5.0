SET SERVEROUTPUT ON;

BEGIN
    FOR loanRecord IN
    (
        SELECT c.CustomerName,
               l.LoanID,
               l.DueDate
        FROM Customers c
        JOIN Loans l
        ON c.CustomerID = l.CustomerID
        WHERE l.DueDate BETWEEN SYSDATE AND SYSDATE + 30
    )
    LOOP
        DBMS_OUTPUT.PUT_LINE(
            'Reminder: Dear '
            || loanRecord.CustomerName
            || ', your Loan ID '
            || loanRecord.LoanID
            || ' is due on '
            || TO_CHAR(loanRecord.DueDate, 'DD-MON-YYYY')
        );
    END LOOP;
END;
/