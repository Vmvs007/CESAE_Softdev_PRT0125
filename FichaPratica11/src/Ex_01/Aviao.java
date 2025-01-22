package Ex_01;

public class Aviao {
    protected int numSerie;
    protected String modelo;
    protected int anoFabrico;
    protected double peso;
    protected double compFuselagem;
    protected double envAsas;
    protected double alturaCauda;
    protected int numMotores;
    protected double autonomia;
    protected double velMax;
    protected double preco;

    public Aviao(int numSerie, String modelo, int anoFabrico, double peso, double compFuselagem, double envAsas, double alturaCauda, int numMotores, double autonomia, double velMax, double preco) {
        this.numSerie = numSerie;
        this.modelo = modelo;
        this.anoFabrico = anoFabrico;
        this.peso = peso;
        this.compFuselagem = compFuselagem;
        this.envAsas = envAsas;
        this.alturaCauda = alturaCauda;
        this.numMotores = numMotores;
        this.autonomia = autonomia;
        this.velMax = velMax;
        this.preco = preco;
    }

    public void exibirDetalhes() {
        System.out.println("_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_ " + this.modelo + " : " + this.numSerie + " _*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_");
        System.out.println("Ano: " + this.anoFabrico + " | Num. Motores: " + this.numMotores + " | Vel. Máx.: " + this.velMax + " Km/h | Autonomia: " + this.autonomia + " | Preço: " + this.preco + " €");
        System.out.println("Peso: " + this.peso + " Kg. | Fuselagem: " + this.compFuselagem + " m. | Env. Asas: " + this.envAsas + " m. | Cauda: " + this.alturaCauda + " m.");
    }
}
