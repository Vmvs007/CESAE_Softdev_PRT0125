package Ex_03;

public class MainSout {
    public static void main(String[] args) {

        Retangulo retangulo1 = new Retangulo(12, 95);
        Retangulo retangulo2 = new Retangulo(15, 85);

        if (retangulo1.area() > retangulo2.area()) {
            System.out.println("Maior Área: " + retangulo1);
        } else {
            System.out.println("Maior Área: " + retangulo2);
        }
    }
}
