package PequenaPizzaria.Ingredientes;

import PequenaPizzaria.Enums.OrigemTopping;
import PequenaPizzaria.Enums.TipoVegetal;
import PequenaPizzaria.Enums.UnidadeMedida;

public class Vegetal extends Topping{
    private TipoVegetal tipoVegetal;

    public Vegetal(String codigo, String nome, UnidadeMedida medida, double kcal, OrigemTopping origem, TipoVegetal tipoVegetal) {
        super(codigo, nome, medida, kcal, origem);
        this.tipoVegetal = tipoVegetal;
    }
}
