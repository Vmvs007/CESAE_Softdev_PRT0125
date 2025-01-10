package Ex_10;

public class Main {
    public static void main(String[] args) {

        Funcionario vitor = new Funcionario("Vitor S.",2000,"Formação");

        vitor.exibirDetalhes();

        vitor.aumentarSalario(10);

        vitor.exibirDetalhes();
    }
}
