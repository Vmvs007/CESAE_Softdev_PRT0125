package PequenaPizzaria.Ingredientes;

import PequenaPizzaria.Enums.OrigemTopping;
import PequenaPizzaria.Enums.TipoQueijo;
import PequenaPizzaria.Enums.UnidadeMedida;

public class Queijo extends Topping{

    private TipoQueijo tipoQueijo;

    public Queijo(String codigo, String nome, UnidadeMedida medida, double kcal, OrigemTopping origem, TipoQueijo tipoQueijo) {
        super(codigo, nome, medida, kcal, origem);
        this.tipoQueijo = tipoQueijo;
    }
}
