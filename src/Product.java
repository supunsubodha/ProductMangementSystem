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


}
