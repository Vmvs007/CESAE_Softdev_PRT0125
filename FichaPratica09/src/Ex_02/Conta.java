package Ex_02;

public class Conta {
    private String iban;
    private double saldo = 0;
    private String titular;
    private int anoAbertura = 2025;
    private double valorDivida = 0;

    public Conta(String iban, String titular) {
        this.iban = iban;
        this.titular = titular;
    }

    public double getMargemEmprestimo() {
        return this.saldo * 0.9;
    }

    public void depositar(double valor) {
        this.saldo += valor;
        System.out.println(valor + " € depositados na conta " + this.iban);
    }

    public void levantar(double valor) {
        if (this.saldo >= valor) { // tem saldo para levantar
            this.saldo -= valor;
            System.out.println(valor + " € levantados da conta " + this.iban);
        } else {
            System.out.println("Sem saldo para levantar: " + valor + " €");
        }
    }

    public void transferencia(double valor, Conta contaDestino) {
        if (this.saldo >= valor) { // temos saldo para a trasnferencia
            this.saldo -= valor; // tirar o dinheiro ao remetente
            contaDestino.saldo += valor; // acrescentar o dinheiro ao destinatario
            System.out.println("Transferência Efetuada de " + this.iban + " para " + contaDestino.iban + ": " + valor + " €");
        } else {
            System.out.println("Sem saldo para trasnferir: " + valor + " €");
        }
    }

    public boolean pedirEmprestimo(double valorPedir) {

        if (this.getMargemEmprestimo() >= valorPedir && this.valorDivida == 0) {
            // Empréstimo aprovado
            this.saldo += valorPedir;
            this.valorDivida += valorPedir;
            System.out.println("Empréstimo concedido na conta " + this.iban + ": " + valorPedir + " €");
            return true;

        } else {
            // Uma ou as duas condições falharam
            System.out.println("Empréstimo recusado. Não cumpre os requisitos.");
            return false;

        }
    }

    public void exibirDetalhes() {
        System.out.println(this.iban + " | Titular: " + this.titular + "\t| Saldo: " + this.saldo + " € | Margem Empréstimo: " + this.getMargemEmprestimo());
    }
}
