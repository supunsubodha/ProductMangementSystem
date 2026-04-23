//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Product product1 = new Product();
        Product product2 = new Product(101, "Wireless Headphones", 49.9d, 150, "Electronics");

        product1.displayProduct();
        System.out.println();
        product2.displayProduct();
        System.out.println();

        Product product3 = new Product(999, "Keyboard", 100d, 80, "Electronics");

        product3.discount();
        product3.discount(15);
        product3.discount(20, 10);

        //🚫I created this small console software as a part of practical session of my university. According to requirements I added the same url provided by university, but I noticed that the webpage of url automatically redirecting somewhere else. So its better avoid clicking it, and I must say I don't responsible about the destination of the link, since this is created just only for education purpose.
        DigitalProduct digitalProduct = new DigitalProduct(301, "Java Programming eBook", 24.99, 9999, "Books", "https://shopeasy.com/downloads/java-ebook", 8.5);
        System.out.println();
        digitalProduct.displayProduct();
    }
}