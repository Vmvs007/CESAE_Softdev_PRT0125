package PequenaPizzaria.Ingredientes;

import PequenaPizzaria.Enums.OrigemTopping;
import PequenaPizzaria.Enums.TipoFrutoMar;
import PequenaPizzaria.Enums.UnidadeMedida;

public class FrutoMar extends Topping{
    private TipoFrutoMar tipoFrutoMar;

    public FrutoMar(String codigo, String nome, UnidadeMedida medida, double kcal, OrigemTopping origem, TipoFrutoMar tipoFrutoMar) {
        super(codigo, nome, medida, kcal, origem);
        this.tipoFrutoMar = tipoFrutoMar;
    }
}
