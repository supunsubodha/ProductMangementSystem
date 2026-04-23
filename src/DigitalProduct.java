public class DigitalProduct extends Product{
    private String downloadUrl;
    private double size;

    public DigitalProduct(int productId, String name, double price, int stockQuantity, String category, String url, double size){
        super(productId, name, price, stockQuantity, category);
        this.downloadUrl = url;
        this.size = size;
    }

    @Override
    public void displayProduct(){
        super.displayProduct();
        System.out.println("---Digital Details---");
        System.out.println("Download URL: " + downloadUrl);
        System.out.println("Size: " + size);
    }
}
