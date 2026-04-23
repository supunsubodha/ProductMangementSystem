import javax.lang.model.element.NestingKind;

public class Product {
    int productId;
    String name;
    double price;
    int  stockQuantity;
    String category;

    public Product(){
        this.productId = 0;
        this.name = "Unknown";
        this.price = 0.0;
        this.stockQuantity = 0;
        this.category = "Uncategorized";
    }

    public Product(int productId, String name, double price, int stockQuantity, String category) {
        this.productId = productId;
        this.name = name;
        this.price = price;
        this.stockQuantity = stockQuantity;
        this.category = category;
    }

    public void displayProduct(){
        if (productId == 0){
            System.out.println("==== Default Product ===");
        }else{
            System.out.println("==== Parameterized Product ====");
        }
        System.out.println("Product ID: " + this.productId);
        System.out.println("Product Name: " + this.name);
        System.out.println("Product Price: $" + this.price);
        System.out.println("Product Stock Quantity: " + this.stockQuantity +"units");
        System.out.println("Product Category: " + this.category);
    }
}
