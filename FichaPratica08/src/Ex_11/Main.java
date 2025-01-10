package Ex_11;

public class Main {
    public static void main(String[] args) {

        Conta conta1 = new Conta("12345", "Vitor Santos");
        Conta conta2 = new Conta("67890", "Joaquim A.");
        Conta conta3 = new Conta("99999", "Joana P.");

        // _____________________________________________________
        conta1.exibirDetalhes();
        conta2.exibirDetalhes();
        conta3.exibirDetalhes();
        System.out.println();

        // _____________________________________________________

        conta1.depositar(1000);
        conta3.depositar(50);

        conta1.exibirDetalhes();
        conta2.exibirDetalhes();
        conta3.exibirDetalhes();
        System.out.println();

        // _____________________________________________________

        conta1.levantar(150);
        conta3.levantar(2000);

        conta1.exibirDetalhes();
        conta2.exibirDetalhes();
        conta3.exibirDetalhes();
        System.out.println();

        // _____________________________________________________

        conta1.transferencia(300, conta2);

        conta1.exibirDetalhes();
        conta2.exibirDetalhes();
        conta3.exibirDetalhes();
        System.out.println();

    }
}
