import java.util.Arrays;

public class EcommerceSearchTest {
    public static void main(String[] args) {
        Product[] products = {
            new Product(105, "Shoes", "Fashion"),
            new Product(101, "Laptop", "Electronics"),
            new Product(103, "Mobile", "Electronics"),
            new Product(102, "Watch", "Accessories"),
            new Product(104, "Bag", "Fashion")
        };

        // Sort products for binary search
        Arrays.sort(products);

        // Linear Search
        Product result1 = SearchUtility.linearSearch(products, 102);
        System.out.println("Linear Search Result: " + (result1 != null ? result1 : "Not Found"));

        // Binary Search
        Product result2 = SearchUtility.binarySearch(products, 102);
        System.out.println("Binary Search Result: " + (result2 != null ? result2 : "Not Found"));
    }
}
