package Ex_03;

public class ExpressShippingStrategy implements ShippingStrategy{
    @Override
    public double calculateShippingCost(double packageWeight) {
        return packageWeight*10;
    }
}
