package PequenaPizzaria.Ingredientes;

import PequenaPizzaria.Enums.OrigemTopping;
import PequenaPizzaria.Enums.UnidadeMedida;

public class Topping extends Ingrediente{
    private OrigemTopping origem;

    public Topping(String codigo, String nome, UnidadeMedida medida, double kcal, OrigemTopping origem) {
        super(codigo, nome, medida, kcal);
        this.origem = origem;
    }
}
