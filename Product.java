//Super class
public class Product{
    String productName;
    String serialNumber;
    double price;
    String productType;

    public Product(
        String productName,
        String serialNumber,
        double price,
        String productType
    ) {
        this.productName = productName;
        this.serialNumber = serialNumber;
        this.price = price;
        this.productType = productType;
    }

    public String getProductName() {
        return this.productName;
    }

    public String getSerialNumber() {
        return this.serialNumber;
    }

    public double getPrice() {
        return this.price;
    }

    public String getProductType() {
        return this.productType;
    }
}
