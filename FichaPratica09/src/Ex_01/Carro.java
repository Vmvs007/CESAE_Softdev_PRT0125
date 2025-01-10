package Ex_01;

public class Carro {

    // Atributos de instância
    private String marca;
    private String modelo;
    private int anoFabrico;
    private int potenciaCv;
    private int cc;
    private TipoCombustivel combustivel;
    private double consumoL100Km;


    // Método construtor
    public Carro(String marca, String modelo, int anoFabrico, int potenciaCv, int cc, TipoCombustivel combustivel, double consumoL100Km) {
        this.marca = marca;
        this.modelo = modelo;
        this.anoFabrico = anoFabrico;
        this.potenciaCv = potenciaCv;
        this.cc = cc;
        this.combustivel = combustivel;
        this.consumoL100Km = consumoL100Km;
    }


    // Métodos de acesso


    // Métodos de instância

    public int idade() {
        return 2025 - this.anoFabrico;
    }

    public void ligar() {
        if (this.idade() > 30) { // Temos um carro antigo ( >30 anos )

            if (this.combustivel.equals(TipoCombustivel.DIESEL)) { // Carro a Diesel
                System.out.println("Deita um pouco de fumo... Custa a pegar... O carro está ligado!");
                System.out.println("Vrum-vrum-vrum");
            } else { // Temos um carro não-Diesel
                System.out.println("Custa a pegar... O carro está ligado!");
                System.out.println("Vrum-vrum-vrum");
            }

        } else { // Temos um carro recente (30 anos ou inferior)

            if (this.potenciaCv < 250) { // Temos um carro com menos de 250 cv
                System.out.println("O carro está ligado!");
                System.out.println("Vrummmmmmmmmmmm");
            } else { // Temos um carro com 250 cv ou mais
                System.out.println("O carro está ligado!");
                System.out.println("VRUMMMMMMMMMMMMMM");
            }

        }
    }

    public Carro corrida(Carro adversario) {

        if (this.potenciaCv > adversario.potenciaCv){ // Ganha o meu carro por cv
            return this;
        } else if (this.potenciaCv < adversario.potenciaCv) { // Ganha o adversario por cv
            return adversario;
        }else{ // Empate por cv

            if( this.cc > adversario.cc){ // Ganha o meu carro por cc
                return this;
            } else if (this.cc < adversario.cc) { // Ganha o adversario por cc
                return adversario;
            }else{ // Empate de cc

                if( this.anoFabrico > adversario.anoFabrico){ // Ganha o meu carro por idade
                    return this;
                } else if (this.anoFabrico < adversario.anoFabrico) { // Ganha o adversario por idade
                    return adversario;
                }else{ // Empate
                    return null;
                }

            }

        }

    }

    public void exibirDetalhes(){
        System.out.println(this.marca + " | "+this.modelo+" | "+this.anoFabrico);
    }

}
