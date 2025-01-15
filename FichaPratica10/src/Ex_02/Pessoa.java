package Ex_02;

public class Pessoa {
    private String nome;
    private int idade;
    private int telemovel;
    private String email;

    public Pessoa(String nome, int idade, int telemovel, String email) {
        this.nome = nome;
        this.idade = idade;
        this.telemovel = telemovel;
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public int getTelemovel() {
        return telemovel;
    }

    public String getEmail() {
        return email;
    }

    public void exibirDetalhes() {
        System.out.println(this.nome + " | Idade: " + this.idade + " | " + this.telemovel + " | " + this.email);
    }
}
