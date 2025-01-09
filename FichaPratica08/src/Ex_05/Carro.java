package Ex_05;

public class Carro {

    // Atributos de instância
    private String marca;
    private String modelo;
    private int anoFabrico;

    // Método construtor
    public Carro(String marca, String modelo, int anoFabrico) {
        this.marca = marca;
        this.modelo = modelo;
        this.anoFabrico = anoFabrico;
    }

    // Métodos de acesso

    // Métodos de instância
    public void ligar(){
        System.out.println("O carro está ligado");
    }

}
