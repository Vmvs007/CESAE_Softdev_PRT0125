package parteA.veiculos;

/**
 * Representa um carro com informações como marca, modelo, ano de fabrico,
 * potência, cilindrada, tipo de combustível e consumo.
 */
public class Carro {

    // Atributos de instância
    private String marca;
    private String modelo;
    private int anoFabrico;
    private int potenciaCv;
    private int cc;
    private TipoCombustivel combustivel;
    private double consumoL100Km;

    /**
     * Construtor da classe Carro.
     *
     * @param marca            Marca do carro
     * @param modelo           Modelo do carro
     * @param anoFabrico       Ano de fabrico do carro
     * @param potenciaCv       Potência do carro em cavalos
     * @param cc               Cilindrada do carro
     * @param combustivel      Tipo de combustível utilizado
     * @param consumoL100Km    Consumo médio em litros por 100 km
     */
    public Carro(String marca, String modelo, int anoFabrico, int potenciaCv, int cc, TipoCombustivel combustivel, double consumoL100Km) {
        this.marca = marca;
        this.modelo = modelo;
        this.anoFabrico = anoFabrico;
        this.potenciaCv = potenciaCv;
        this.cc = cc;
        this.combustivel = combustivel;
        this.consumoL100Km = consumoL100Km;
    }

    /**
     * Calcula a idade atual do carro.
     *
     * @return Idade do carro em anos
     */
    public int idade() {
        return 2025 - this.anoFabrico;
    }

    /**
     * Liga o carro, simulando o som e comportamento com base nas suas
     * características como idade, tipo de combustível e potência.
     */
    public void ligar() {
        if (this.idade() > 30) { // Carro antigo

            if (this.combustivel.equals(TipoCombustivel.DIESEL)) { // Diesel
                System.out.println("Deita um pouco de fumo... Custa a pegar... O carro está ligado!");
                System.out.println("Vrum-vrum-vrum");
            } else {
                System.out.println("Custa a pegar... O carro está ligado!");
                System.out.println("Vrum-vrum-vrum");
            }

        } else { // Carro recente

            if (this.potenciaCv < 250) {
                System.out.println("O carro está ligado!");
                System.out.println("Vrummmmmmmmmmmm");
            } else {
                System.out.println("O carro está ligado!");
                System.out.println("VRUMMMMMMMMMMMMMM");
            }

        }
    }

    /**
     * Compara este carro com outro e determina o vencedor de uma corrida
     * com base na potência, cilindrada e ano de fabrico.
     *
     * @param adversario Carro adversário na corrida
     * @return O carro vencedor ou {@code null} em caso de empate total
     */
    public Carro corrida(Carro adversario) {

        if (this.potenciaCv > adversario.potenciaCv){
            return this;
        } else if (this.potenciaCv < adversario.potenciaCv) {
            return adversario;
        } else {

            if( this.cc > adversario.cc){
                return this;
            } else if (this.cc < adversario.cc) {
                return adversario;
            } else {

                if( this.anoFabrico > adversario.anoFabrico){
                    return this;
                } else if (this.anoFabrico < adversario.anoFabrico) {
                    return adversario;
                } else {
                    return null;
                }

            }

        }

    }

    /**
     * Calcula o consumo de combustível numa viagem, com base na distância percorrida.
     *
     * @param kms Distância da viagem em quilómetros
     * @return Quantidade estimada de litros consumidos
     */
    public double calcularConsumoViagem(double kms) {
        return (consumoL100Km / 100) * kms;
    }


    /**
     * Exibe no terminal os detalhes principais do carro: marca, modelo e ano de fabrico.
     */
    public void exibirDetalhes(){
        System.out.println(this.marca + " | "+this.modelo+" | "+this.anoFabrico);
    }

}
