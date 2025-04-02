package parteA.gestaoBancaria;

/**
 * Representa uma conta bancária com saldo, titular, ano de criação,
 * país de origem, IBAN, e métodos para operações como depositar,
 * levantar, transferir e aplicar rendimentos.
 */
public class ContaBancaria {

    private String titular;        // Nome do titular da conta
    private double saldo;          // Saldo atual
    private int anoCriacao;        // Ano de criação da conta
    private String pais;           // País de origem da conta
    private String iban;           // IBAN associado à conta

    /**
     * Constrói uma ContaBancaria com os dados iniciais fornecidos.
     *
     * @param titular       O nome do titular da conta
     * @param saldoInicial  O saldo inicial da conta
     * @param anoCriacao    O ano de criação da conta
     * @param pais          O país de origem da conta
     * @param iban          O IBAN associado à conta
     */
    public ContaBancaria(String titular, double saldoInicial,
                         int anoCriacao, String pais, String iban) {
        this.titular = titular;
        this.saldo = saldoInicial;
        this.anoCriacao = anoCriacao;
        this.pais = pais;
        this.iban = iban;
    }

    /**
     * Deposita o valor especificado, adicionando-o ao saldo.
     *
     * @param valor O valor a depositar
     */
    public void depositar(double valor) {
        this.saldo = valor;
    }

    /**
     * Levanta o valor especificado do saldo, mas apenas se o saldo
     * for suficiente para cobrir essa quantia. Caso contrário, não faz nada.
     *
     * @param valor O valor que se pretende levantar
     */
    public void levantar(double valor) {
        if (this.saldo <= valor) {
            this.saldo -= valor;
        }
    }

    /**
     * Transfere o valor especificado desta conta para a conta de destino,
     * desde que esta conta tenha saldo suficiente para isso.
     * Se não houver saldo suficiente, a transferência não é efectuada.
     *
     * @param destino A conta de destino que receberá o valor
     * @param valor   O valor a transferir
     */
    public void transferir(ContaBancaria destino, double valor) {
        if (this.saldo >= valor) {
            this.saldo -= valor;
            destino.saldo += valor;
        }
    }

    /**
     * Aplica um rendimento mensal ao saldo, tendo em conta a taxa especificada.
     * Por exemplo, uma taxa de 0.01 equivale a 1% de rendimento.
     *
     * @param taxa A taxa de rendimento (ex.: 0.01 = 1%)
     */
    public void aplicarRendimentoMensal(double taxa) {
        double rendimento = this.saldo * taxa;
        this.saldo += rendimento;
    }

    /**
     * Retorna o saldo atual da conta.
     *
     * @return O valor numérico do saldo
     */
    public double consultarSaldo() {
        return this.saldo;
    }

    /**
     * Gera um resumo textual com as principais informações da conta,
     * incluindo o titular, IBAN, país, ano de criação e saldo atual.
     *
     * @return Uma String que descreve os atributos principais da conta
     */
    public String gerarResumoConta() {
        return "Titular: " + this.titular
                + ", IBAN: " + this.iban
                + ", País: " + this.pais
                + ", AnoCriação: " + this.anoCriacao
                + ", Saldo: " + this.saldo;
    }
}
