package Domain;

public class Sale {
    private String category;
    private String product;
    private double unitsSold;
    private double unitPrice;

    public Sale(String category, String product, double unitsSold, double unitPrice) {
        this.category = category;
        this.product = product;
        this.unitsSold = unitsSold;
        this.unitPrice = unitPrice;
    }

    public String getCategory() {
        return category;
    }

    public String getProduct() {
        return product;
    }

    public double getUnitsSold() {
        return unitsSold;
    }

    public double getUnitPrice() {
        return unitPrice;
    }
}
