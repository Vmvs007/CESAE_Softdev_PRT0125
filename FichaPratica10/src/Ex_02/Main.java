package Ex_02;

public class Main {
    public static void main(String[] args) {

        Pessoa pessoa1 = new Pessoa("Vitor", 25, 911222333, "vitor@gmail.com");
        Pessoa pessoa2 = new Pessoa("Joana", 30, 933444111, "joana@gmail.com");
        Pessoa pessoa3 = new Pessoa("Joaninha", 12, 988777666, "joaninha@gmail.com");
        Pessoa pessoa4 = new Pessoa("Joaquim", 44, 92233999, "quim@gmail.com");

        System.out.println();

        Sorteio euromilhoes = new Sorteio("Euromilhões", 150000);
        euromilhoes.inscreverPessoa(pessoa1);
        euromilhoes.inscreverPessoa(pessoa2);
        euromilhoes.inscreverPessoa(pessoa3);
        euromilhoes.inscreverPessoa(pessoa4);


        euromilhoes.exibirDetalhes();

        System.out.println();

        System.out.println("******************** VENCEDOR ********************");
        Pessoa vencedor = euromilhoes.sortear();
        System.out.println(vencedor.getNome() + " | Idade: " + vencedor.getIdade());

    }
}
