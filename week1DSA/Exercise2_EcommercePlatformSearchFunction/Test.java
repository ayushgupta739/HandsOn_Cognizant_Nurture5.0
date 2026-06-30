package week1DSA.Exercise2_EcommercePlatformSearchFunction;

public class Test {

    public static void main(String[] args) {

        Product[] products = {
                new Product(105, "Laptop", "Electronics"),
                new Product(101, "Shoes", "Fashion"),
                new Product(103, "Mobile", "Electronics"),
                new Product(104, "Watch", "Accessories"),
                new Product(102, "Bag", "Fashion")
        };

        SearchOperations search = new SearchOperations();

        System.out.println("Linear Search:");

        Product result = search.linearSearch(products, 103);

        if (result != null)
            result.display();
        else
            System.out.println("Product not found");

        System.out.println();

        System.out.println("Binary Search:");

        result = search.binarySearch(products, 103);

        if (result != null)
            result.display();
        else
            System.out.println("Product not found");
    }
}