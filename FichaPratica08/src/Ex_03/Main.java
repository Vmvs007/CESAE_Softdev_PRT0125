package Ex_03;

public class Main {
    public static void main(String[] args) {

        Retangulo retangulo1 = new Retangulo(10, 5);
        Retangulo retangulo2 = new Retangulo(20, 10);

        System.out.println("______ Informações do Retângulo 1 _____");
        System.out.println("Largura: " + retangulo1.getLargura());
        System.out.println("Altura: " + retangulo1.getAltura());
        System.out.println("Perimetro: " + retangulo1.perimetro());
        System.out.println("Area: " + retangulo1.area());


        retangulo1.setLargura(11);

        System.out.println("______ Informações do Retângulo 1 _____");
        System.out.println("Largura: " + retangulo1.getLargura());
        System.out.println("Altura: " + retangulo1.getAltura());
        System.out.println("Perimetro: " + retangulo1.perimetro());
        System.out.println("Area: " + retangulo1.area());


//        System.out.println("Perimetro: " + retangulo1.perimetro());
//        System.out.println("Area: " + retangulo2.area());
    }
}
