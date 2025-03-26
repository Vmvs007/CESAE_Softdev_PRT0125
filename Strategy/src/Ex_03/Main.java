package Ex_03;

public class Main {
    public static void main(String[] args) {

        ShippingCalculator sc = new ShippingCalculator(new StandardShippingStrategy());

        System.out.println(sc.calculateShipping(10));

        sc.setSelectedShippingStrategy(new OvernightShippingStrategy());

        System.out.println(sc.calculateShipping(10));
    }
}
