package Ex_03;

public class OvernightShippingStrategy implements ShippingStrategy {
    @Override
    public double calculateShippingCost(double packageWeight) {
        return packageWeight * 15;
    }
}
