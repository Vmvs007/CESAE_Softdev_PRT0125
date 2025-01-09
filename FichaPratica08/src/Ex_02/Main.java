package Ex_02;

public class Main {
    public static void main(String[] args) {

        Cao cao1 = new Cao("Bobby", "Beagle");
        Cao cao2 = new Cao("Max", "Pastor Alemão");
        Cao cao3 = new Cao("Rex","Caniche");

        cao1.ladrar();
        cao2.ladrar();
        cao3.ladrar();

        System.out.println("________________________________________");

        cao3.setLatido("Woooff! Woooff!");

        cao1.ladrar();
        cao2.ladrar();
        cao3.ladrar();

        System.out.println("________________________________________");

        cao1.setLatido("AU AU AU AU!");
        cao2.setLatido("Rufff... Rufff...");

        cao1.ladrar();
        cao2.ladrar();
        cao3.ladrar();

        System.out.println("________________________________________");

        cao1.ladrar(5);
    }
}
