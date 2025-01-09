package Ex_03;

public class Retangulo {

    // Variáveis de Instância
    private int largura;
    private int altura;

    // Método Construtor
    public Retangulo(int largura, int altura) {
        this.largura = largura;
        this.altura = altura;
    }

    // Métodos de acesso (getters e setters)
    public int getLargura() {
        return this.largura;
    }

    public int getAltura() {
        return this.altura;
    }

    public void setLargura(int largura){
        this.largura=largura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    // Métodos de instância
    public int perimetro() {
        return this.largura + this.largura + this.altura + this.altura;
    }

    public int area() {
        return this.largura * this.altura;
    }
}
