//Define a class Product (pid, pname, price, qty). Write a function to accept the product details, display it and calculate total amount. (use array of Objects)

import java.util.Scanner;

class Product {
    String pid;
    String pname;
    double price;
    int qty;

    public Product(String pid, String pname, double price, int qty) {
        this.pid = pid;
        this.pname = pname;
        this.price = price;
        this.qty = qty;
    }
}

public class slip17a {
    public static void main(String[] args) {
        Product[] products = inputProductDetails();
        displayProducts(products);
    }

    public static Product[] inputProductDetails() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of products: ");
        int numProducts = scanner.nextInt();
        scanner.nextLine(); // Consume the newline

        Product[] products = new Product[numProducts];

        for (int i = 0; i < numProducts; i++) {
            System.out.print("Enter Product ID: ");
            String pid = scanner.nextLine();

            System.out.print("Enter Product Name: ");
            String pname = scanner.nextLine();

            System.out.print("Enter Price: ");
            double price = scanner.nextDouble();

            System.out.print("Enter Quantity: ");
            int qty = scanner.nextInt();

            products[i] = new Product(pid, pname, price, qty);
            scanner.nextLine(); // Consume the newline
        }

        scanner.close();
        return products;
    }

    public static void displayProducts(Product[] products) {
        System.out.println("\nProduct Details:");
        System.out.println("================");

        double totalAmount = 0;

        for (Product product : products) {
            totalAmount = product.price * product.qty;

            System.out.println("Product ID: " + product.pid);
            System.out.println("Product Name: " + product.pname);
            System.out.println("Price: " + product.price);
            System.out.println("Quantity: " + product.qty);
            System.out.println("================");
        }

        System.out.println("Total Amount: " + totalAmount);
    }
}

