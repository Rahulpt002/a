import java.util.Scanner;
class Product {
    String pcode;
    String pname;
    double price;
    public Product(String pcode, String pname, double price) {
        this.pcode = pcode;
        this.pname = pname;
        this.price = price;
    }
    public static Product findLowestPrice(Product[] products) {
        Product lowestPriceProduct = products[0];
        for (Product product : products) {
            if (product.price < lowestPriceProduct.price) {
                lowestPriceProduct = product;
            }
        }
        return lowestPriceProduct;
    }
    public void display() {
        System.out.println("Product Code: " + pcode);
        System.out.println("Product Name: " + pname);
        System.out.println("Price: " + price);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of products:");
        int n = scanner.nextInt();
        scanner.nextLine();
        Product[] products = new Product[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter details for product " + (i + 1) + ":");
            System.out.print("Product Code: ");
            String pcode = scanner.nextLine();
            System.out.print("Product Name: ");
            String pname = scanner.nextLine();
            System.out.print("Price: ");
            double price = scanner.nextDouble();
            scanner.nextLine();
            products[i] = new Product(pcode, pname, price);
        }
        Product lowestPriceProduct = findLowestPrice(products);
        System.out.println("\nProduct with the lowest price:");
        lowestPriceProduct.display();
        scanner.close();
    }
}