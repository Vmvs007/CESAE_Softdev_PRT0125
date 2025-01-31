package PequenaPizzaria.Ingredientes;

import PequenaPizzaria.Enums.UnidadeMedida;


/**
 *
 */
public class Ingrediente {
    private String codigo;
    private String nome;
    private UnidadeMedida medida;
    private double kcal;

    /**
     * Método construtor para <b>Ingrediente</b>
     * @param codigo Código do <b>Ingrediente</b>
     * @param nome Nome Descritivo do <b>Ingrediente</b>
     * @param medida Unidade de Medida
     * @param kcal Kcal p/ Unidade de Medida
     */
    public Ingrediente(String codigo, String nome, UnidadeMedida medida, double kcal) {
        this.codigo = codigo;
        this.nome = nome;
        this.medida = medida;
        this.kcal = kcal;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public UnidadeMedida getMedida() {
        return medida;
    }

    public double getKcal() {
        return kcal;
    }

    public String getUnidadeMedidaAbreviada(){
        switch (this.medida){
            case GRAMAS:
                return "g.";

            case LITROS:
                return "L.";

            case UNIDADES:
                return "uni.";
        }

        return null;
    }

    public void exibirDetalhes(){
        System.out.print("[ "+this.codigo+" | "+this.nome+" | "+this.medida+" | "+this.kcal+" Kcal ]");
    }
}
