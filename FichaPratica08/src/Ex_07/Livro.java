package Ex_07;

public class Livro {
    private String titulo;
    private String autor;
    private String categoria;
    private int numPaginas;
    private String isbn;

    public Livro(String titulo, String autor, String categoria, int numPaginas, String isbn) {
        this.titulo = titulo;
        this.autor = autor;
        this.categoria = categoria;
        this.numPaginas = numPaginas;
        this.isbn = isbn;
    }

    public void exibirDetalhes() {
        System.out.println("********** " + this.titulo + " **********");
        System.out.println(this.autor + " | Categoria: " + this.categoria);
        System.out.println(this.numPaginas + " páginas | ISBN: " + this.isbn);
    }

}
