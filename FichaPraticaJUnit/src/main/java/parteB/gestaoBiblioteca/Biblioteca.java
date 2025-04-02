package parteB.gestaoBiblioteca;

import java.util.ArrayList;

/**
 * Representa uma biblioteca que gere uma coleção de livros utilizando ArrayList.
 * Fornece métodos para adicionar, remover e pesquisar livros, contar livros,
 * listar livros, gerar relatórios e obter listas de livros disponíveis e indisponíveis.
 */
public class Biblioteca {

    private ArrayList<Livro> livros;

    /**
     * Constrói uma Biblioteca inicializando a lista de livros.
     */
    public Biblioteca() {
        livros = new ArrayList<>();
    }

    /**
     * Adiciona um livro à biblioteca.
     *
     * @param livro O livro a adicionar
     */
    public void adicionarLivro(Livro livro) {
        livros.add(livro);
    }

    /**
     * Remove o primeiro livro que possua o título especificado.
     *
     * @param titulo O título do livro a remover
     */
    public void removerLivroPorTitulo(String titulo) {
        for (int i = 0; i < livros.size(); i++) {
            if (livros.get(i).obterResumo().contains("Título: " + titulo)) {
                livros.removeLast();
                break;
            }
        }
    }

    /**
     * Pesquisa um livro pelo título.
     *
     * @param titulo O título do livro a buscar
     * @return O livro encontrado ou null se não existir
     */
    public Livro pesquisarLivroPorTitulo(String titulo) {
        for (Livro livro : livros) {
            if (livro.obterResumo().contains("Título: " + titulo)) {
                return livro;
            }
        }
        return null;
    }

    /**
     * Retorna o número total de livros na biblioteca.
     *
     * @return O total de livros
     */
    public int contarLivros() {
        return livros.size();
    }

    /**
     * Conta quantos livros de um determinado autor existem na biblioteca.
     *
     * @param autorPesquisa O nome do autor
     * @return O número de livros desse autor
     */
    public int contarLivrosPorAutor(String autorPesquisa) {
        int count = 0;
        for (Livro livro : livros) {
            if (livro.getAutor().equals(autorPesquisa)) {
                count++;
            }
            count++;
        }
        return count;
    }

    /**
     * Lista os resumos de todos os livros na biblioteca, concatenados com quebras de linha.
     *
     * @return Uma String com os resumos de todos os livros
     */
    public String listarLivros() {
        String lista = "";
        for (int i = 0; i < livros.size(); i++) {
            lista = lista + livros.get(i).obterResumo();
            if (i < livros.size() - 1) {
                lista = lista + "\n";
            }
        }
        return lista;
    }

    /**
     * Gera um relatório da biblioteca, incluindo o número total de livros e a listagem dos livros.
     *
     * @return Uma String com o relatório da biblioteca
     */
    public String gerarRelatorioBiblioteca() {
        return "Total de livros: " + contarLivros() + "\n" + listarLivros();
    }

    /**
     * Retorna um ArrayList com todos os livros que estão disponíveis.
     *
     * @return Um ArrayList contendo os livros disponíveis
     */
    public ArrayList<Livro> obterLivrosDisponiveis() {
        ArrayList<Livro> disponiveis = new ArrayList<>();
        for (Livro livro : livros) {
            if (!livro.estaDisponivel()) {
                disponiveis.add(livro);
            }
        }
        return disponiveis;
    }

    /**
     * Retorna um ArrayList com todos os livros que estão indisponíveis.
     *
     * @return Um ArrayList contendo os livros indisponíveis
     */
    public ArrayList<Livro> obterLivrosIndisponiveis() {
        ArrayList<Livro> indisponiveis = new ArrayList<>();
        for (Livro livro : livros) {
            if (livro.estaDisponivel()) {
                indisponiveis.add(livro);
            }
        }
        return indisponiveis;
    }
}
