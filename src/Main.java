//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Product product1 = new Product();
        Product product2 = new Product(101, "Wireless Headphones", 49.9d, 150, "Electronics");

        product1.displayProduct();
        System.out.println();
        product2.displayProduct();
    }
}