package Ex_03;

public class Main {
    public static void main(String[] args) {

        Peixe sardinha = new Peixe("Sardinha",25,12.5);
        Peixe robalo = new Peixe("Robalo",100,20);
        Peixe dourada = new Peixe("Dourada",100,17.9);
        Peixe peixeEspada = new Peixe("Peixe Espada",250,22);

        Marisco lagosta = new Marisco("Lagosta",50,95);
        Marisco ameijoa = new Marisco("Ameijoa",120,45);
        Marisco caranguejo = new Marisco("Caranguejo",25,89.9);

        BarcoPesca amorDeMae = new BarcoPesca("Amor de Mãe","Branco e Amarelo",1985,3,350,MarcaBarco.BENTZ);

        // Tentamos pescar algum peixe
        amorDeMae.pescarPeixe(sardinha);
        amorDeMae.pescarPeixe(robalo);
        amorDeMae.pescarPeixe(dourada);
        amorDeMae.pescarPeixe(peixeEspada);

        // Tentamos pescar algum marisco
        amorDeMae.pescarMarisco(lagosta);

        // Largamos a dourada para conseguir pescar a ameijoa
        amorDeMae.largarPeixe(dourada);
        amorDeMae.pescarMarisco(ameijoa);

        amorDeMae.exibirDetalhes();


    }
}
