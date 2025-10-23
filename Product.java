//Super class
public class Product{
    String productType;
    String productName;
    String serialNumber;
    double price;

    public Product(
        String productType,
        String productName,
        String serialNumber,
        double price
    ) {
        this.productType = productType;
        this.productName = productName;
        this.serialNumber = serialNumber;
        this.price = price;
    }

    public String getProductType() {
        return this.productType;
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
}




