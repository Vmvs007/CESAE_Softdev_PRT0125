package PequenaPizzaria.Ingredientes;

import PequenaPizzaria.Enums.OrigemTopping;
import PequenaPizzaria.Enums.TipoCarne;
import PequenaPizzaria.Enums.UnidadeMedida;

public class Carne extends Topping{

    private TipoCarne tipoCarne;

    public Carne(String codigo, String nome, UnidadeMedida medida, double kcal, OrigemTopping origem, TipoCarne tipoCarne) {
        super(codigo, nome, medida, kcal, origem);
        this.tipoCarne = tipoCarne;
    }
}
