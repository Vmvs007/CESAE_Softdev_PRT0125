public class Main {
    public static void main(String[] args) {
        Animal fido = new Animal("Fido", "Cão", 10);
        Animal fido2 = new Animal("Fido", "Cão", 1);
        Animal spot = new Animal("Spot", "Cão", 5);


        if (fido.equals(fido2)) {
            System.out.println("Iguais");
        } else {
            System.out.println("Diferentes");
        }
    }
}
