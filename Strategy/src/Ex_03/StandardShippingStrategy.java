package Ex_03;

public class StandardShippingStrategy implements ShippingStrategy{
    @Override
    public double calculateShippingCost(double packageWeight) {
        return packageWeight*5;
    }
}
