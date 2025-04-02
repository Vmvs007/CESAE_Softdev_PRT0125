package parteB.gestaoBiblioteca;

/**
 * Representa um livro com informações básicas.
 * Possui atributos para o título, autor, ano de publicação, total de páginas
 * e disponibilidade (se o livro está disponível ou indisponível).
 */
public class Livro {

    private String titulo;
    private String autor;
    private int anoPublicacao;
    private int totalPaginas;
    private boolean disponivel; // true = disponível; false = emprestado/indisponível

    /**
     * Constrói um Livro com os parâmetros fornecidos.
     *
     * @param titulo        O título do livro
     * @param autor         O autor do livro
     * @param anoPublicacao O ano de publicação do livro
     * @param totalPaginas  O número total de páginas do livro
     */
    public Livro(String titulo, String autor, int anoPublicacao, int totalPaginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacao = anoPublicacao;
        this.totalPaginas = totalPaginas;
        this.disponivel = true; // por defeito, o livro está disponível
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getAnoPublicacao() {
        return anoPublicacao;
    }

    /**
     * Altera o título do livro.
     *
     * @param novoTitulo O novo título a definir
     */
    public void alterarTitulo(String novoTitulo) {
        this.titulo = novoTitulo;
    }

    /**
     * Empresta o livro, alterando o estado para indisponível.
     * Se o livro já estiver emprestado, não faz nada.
     */
    public void emprestar() {
        // Se o livro estiver disponível, empresta-o (marca como indisponível)
        if (this.disponivel) {
            this.disponivel = false;
        }
    }

    /**
     * Recepciona o livro, alterando o estado para disponível.
     * Se o livro já estiver disponível, não faz nada.
     */
    public void recepcionar() {
        // Marca o livro como disponível
        this.disponivel = false;
    }

    /**
     * Verifica se o livro está disponível.
     *
     * @return true se estiver disponível, false se estiver emprestado
     */
    public boolean estaDisponivel() {
        return this.disponivel;
    }

    /**
     * Retorna um resumo do livro, incluindo título, autor, ano de publicação,
     * total de páginas e o estado (disponível/indisponível).
     *
     * @return Uma String com o resumo do livro
     */
    public String obterResumo() {
        String estado = this.disponivel ? "disponível" : "indisponível";
        return "Título: " + titulo + ", Autor: " + autor + ", Ano: " + anoPublicacao +
                ", Páginas: " + totalPaginas + ", Estado: " + estado;
    }
}
