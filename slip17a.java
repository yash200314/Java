// Define a class Product (pid, pname, price, qty). Write a function to accept the product details,
// display it and calculate total amount. (use array of Objects)

import java.util.*;

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
public class slip17a{
    public static void main(String[] args) {
        Product[]products =inputProductDetail();
        displayProducts(products);

    }
    public static Product[] inputProductDetail()
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number of products :");
        int numProduct=sc.nextInt();
        sc.nextLine();

        Product[]products= new Product[numProduct];
        for(int i=0;i<numProduct;i++)
        {
            System.out.println("enter the product id :");
            String pid = sc.nextLine();

            System.out.println("enter product name :");
            String pname=sc.nextLine();

            System.out.println("enter the Price");
            double price = sc.nextDouble();
            
            System.out.println("enter quantity :");
            int qty= sc.nextInt();

            products[i] = new Product(pid, pname, price, qty);
            sc.nextLine();
        }
        sc.close();
        return products;
    }
    public static void displayProducts(Product[]products)
    {
       System.out.println("\n Product Details:");
       System.out.println("*********");
       double totalAmt=0;

       for(Product product :products)
       {
            totalAmt =product.price*product.qty;
            System.out.println("Product ID"+product.pid);
            System.out.println("Product name :"+product.pname);
            System.out.println("Price :"+product.price);
            System.out.println("Quantity :"+product.qty);

            System.out.println("********");

       }
       System.out.println("Total Amount"+totalAmt);
    }
}
