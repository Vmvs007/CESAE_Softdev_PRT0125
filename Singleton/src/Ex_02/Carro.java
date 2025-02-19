package Ex_02;


import java.io.IOException;

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

    public void ligar() throws IOException {

        Logger logger = Logger.getInstance("log_carro_ligar.txt");

        if (this.idade() > 30) { // Temos um carro antigo ( >30 anos )

            if (this.combustivel.equals(TipoCombustivel.DIESEL)) { // Carro a Diesel
                System.out.println("Deita um pouco de fumo... Custa a pegar... O carro está ligado!");
                System.out.println("Vrum-vrum-vrum");
                logger.log(this.marca + " " + this.modelo + " ligou como sendo um carro DIESEl antigo");
            } else { // Temos um carro não-Diesel
                System.out.println("Custa a pegar... O carro está ligado!");
                System.out.println("Vrum-vrum-vrum");
                logger.log(this.marca + " " + this.modelo + " ligou como sendo um carro não DIESEL antigo");
            }

        } else { // Temos um carro recente (30 anos ou inferior)

            if (this.potenciaCv < 250) { // Temos um carro com menos de 250 cv
                System.out.println("O carro está ligado!");
                System.out.println("Vrummmmmmmmmmmm");
                logger.log(this.marca + " " + this.modelo + " ligou como sendo um carro com menos de 250cv novo");
            } else { // Temos um carro com 250 cv ou mais
                System.out.println("O carro está ligado!");
                System.out.println("VRUMMMMMMMMMMMMMM");
                logger.log(this.marca + " " + this.modelo + " ligou como sendo um carro com mais de 250cv novo");
            }

        }
    }

    public Carro corrida(Carro adversario) throws IOException {

        Logger logger = Logger.getInstance("log_carro.txt");
        logger.log(this.marca + " " + this.modelo + " vai correr com " + adversario.marca + " " + adversario.modelo);

        if (this.potenciaCv > adversario.potenciaCv) { // Ganha o meu carro por cv
            logger.log("Ganhou " + this.marca + " " + this.modelo + " por potencia");
            return this;
        } else if (this.potenciaCv < adversario.potenciaCv) { // Ganha o adversario por cv
            logger.log("Ganhou " + adversario.marca + " " + adversario.modelo + " por potencia");
            return adversario;
        } else { // Empate por cv

            if (this.cc > adversario.cc) { // Ganha o meu carro por cc
                logger.log("Ganhou " + this.marca + " " + this.modelo + " por cc");
                return this;
            } else if (this.cc < adversario.cc) { // Ganha o adversario por cc
                logger.log("Ganhou " + adversario.marca + " " + adversario.modelo + " por cc");
                return adversario;
            } else { // Empate de cc

                if (this.anoFabrico > adversario.anoFabrico) { // Ganha o meu carro por idade
                    logger.log("Ganhou " + this.marca + " " + this.modelo + " por idade");
                    return this;
                } else if (this.anoFabrico < adversario.anoFabrico) { // Ganha o adversario por idade
                    logger.log("Ganhou " + adversario.marca + " " + adversario.modelo + " por idade");
                    return adversario;
                } else { // Empate
                    logger.log(this.marca + " " + this.modelo + " empatou com " + adversario.marca + " " + adversario.modelo);
                    return null;
                }

            }

        }

    }

    public void exibirDetalhes() {
        System.out.println(this.marca + " | " + this.modelo + " | " + this.anoFabrico);
    }

}
