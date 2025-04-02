package parteB.gestaoEscola;

import java.util.ArrayList;

/**
 * Classe base que representa um aluno.
 */
class Aluno {
    protected int numeroAluno;
    protected String nome;
    protected int anoNascimento;
    protected String habilitacaoLiteraria;
    protected String nacionalidade;
    protected String morada;
    protected String email;
    protected String telefone;
    protected ArrayList<Double> notas;

    /**
     * Construtor do Aluno
     */
    public Aluno(int numeroAluno, String nome, int anoNascimento, String habilitacaoLiteraria,
                 String nacionalidade, String morada, String email, String telefone) {
        this.numeroAluno = numeroAluno;
        this.nome = nome;
        this.anoNascimento = anoNascimento;
        this.habilitacaoLiteraria = habilitacaoLiteraria;
        this.nacionalidade = nacionalidade;
        this.morada = morada;
        this.email = email;
        this.telefone = telefone;
        this.notas = new ArrayList<>();
    }

    /**
     * Adiciona uma nova nota ao aluno.
     */
    public void adicionarNota(double nota) {
        notas.add(nota);
    }

    /**
     * Calcula a média das notas.
     */
    public double calcularMedia() {
        return notas.stream().mapToDouble(Double::doubleValue).average().orElse(0);
    }

    /**
     * Retorna a nota mais alta.
     */
    public double notaMaisAlta() {
        return notas.stream().mapToDouble(Double::doubleValue).max().orElse(0);
    }

    /**
     * Retorna a nota mais baixa.
     */
    public double notaMaisBaixa() {
        return notas.stream().mapToDouble(Double::doubleValue).min().orElse(0);
    }

    public String getNome() {
        return nome;
    }

    public int getNumeroAluno() {
        return numeroAluno;
    }
}