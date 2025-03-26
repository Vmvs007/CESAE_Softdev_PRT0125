package Ex_03;

public class ShippingCalculator {
    private ShippingStrategy selectedShippingStrategy;

    public ShippingCalculator(ShippingStrategy selectedShippingStrategy) {
        this.selectedShippingStrategy = selectedShippingStrategy;
    }

    public void setSelectedShippingStrategy(ShippingStrategy selectedShippingStrategy) {
        this.selectedShippingStrategy = selectedShippingStrategy;
    }

    public double calculateShipping(double packageWeight){
        return this.selectedShippingStrategy.calculateShippingCost(packageWeight);
    }
}
