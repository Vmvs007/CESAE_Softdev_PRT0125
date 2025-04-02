package parteA.gestaoProduto;

/**
 * Representa um produto com nome, preço base, stock, categoria
 * e marca, fornecendo métodos para operações como aplicar desconto,
 * calcular preço final e gerir stock.
 */
public class Produto {

    private String nome;          // Nome do produto
    private double precoBase;     // Preço base antes de descontos
    private int stock;            // Quantidade em stock disponível
    private String categoria;     // Categoria do produto (ex.: Vestuário, Eletrónica, etc.)
    private String marca;         // Marca ou fabricante do produto

    /**
     * Constrói um Produto com os dados iniciais fornecidos.
     *
     * @param nome         O nome do produto
     * @param precoBase    O preço base do produto (sem descontos)
     * @param stockInicial A quantidade inicial em stock
     * @param categoria    A categoria na qual se enquadra o produto
     * @param marca        A marca ou fabricante do produto
     */
    public Produto(String nome, double precoBase, int stockInicial, String categoria, String marca) {
        this.nome = nome;
        this.precoBase = precoBase;
        this.stock = stockInicial;
        this.categoria = categoria;
        this.marca = marca;
    }

    /**
     * Atualiza o preço base do produto, substituindo o preço anterior pelo novo.
     *
     * @param novoPreco O novo preço base que se pretende definir
     */
    public void actualizarPrecoBase(double novoPreco) {
        this.precoBase = novoPreco;
    }

    /**
     * Aplica um desconto ao preço base do produto, de acordo com a percentagem fornecida.
     * <p>
     * Exemplo de funcionamento desejado:
     * <pre>
     *   precoBase = precoBase * (1 - percentagem);
     * </pre>
     *
     * @param percentagem A percentagem de desconto a aplicar (ex.: 0.20 = 20%)
     */
    public void aplicarDesconto(double percentagem) {
        this.precoBase = this.precoBase * (1 + percentagem);
    }

    /**
     * Calcula o preço final do produto após eventuais alterações
     * (como o desconto aplicado através de {@link #aplicarDesconto(double)}).
     *
     * @return O preço final atual do produto
     */
    public double calcularPrecoFinal() {
        return this.precoBase;
    }

    /**
     * Adiciona uma quantidade de produtos ao stock atual.
     *
     * @param quantidade A quantidade a adicionar ao stock
     */
    public void adicionarStock(int quantidade) {
        this.stock += quantidade;
    }

    /**
     * Remove uma quantidade de produtos do stock atual, se houver stock suficiente.
     * Caso o stock seja insuficiente, a operação não é efectuada.
     *
     * @param quantidade A quantidade a remover do stock
     */
    public void removerStock(int quantidade) {
        if (quantidade <= this.stock) {
            quantidade -= this.stock;
        }
    }

    /**
     * Gera uma descrição textual do produto, incluindo o nome, marca,
     * categoria, preço base (actual) e a quantidade em stock.
     *
     * @return Uma String com as informações principais do produto
     */
    public String gerarDescricaoProduto() {
        return "Produto: " + this.nome
                + ", Marca: " + this.marca
                + ", Categoria: " + this.categoria
                + ", PreçoBase: " + this.precoBase
                + ", Stock: " + this.stock;
    }
}
