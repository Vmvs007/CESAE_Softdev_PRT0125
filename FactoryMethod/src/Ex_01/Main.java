package Ex_01;

public class Main {
    public static void main(String[] args) {

//        Livro livro = new Livro("GoF",22.9);
//
//        Roupa camisa = new Roupa("Camisa Azul",50);
//        Roupa calcas = new Roupa("Calças Bege",60);
//
//        Eletronico laptop = new Eletronico("Laptop HP",1000);

        LojaOnline lo = new LojaOnline("Loja TOP");

        lo.adicionarProduto(ProdutoFactory.criarProduto("Livro","GoF",22.9));
        lo.adicionarProduto(ProdutoFactory.criarProduto("Roupa","Camisa Azul",50));
        lo.adicionarProduto( ProdutoFactory.criarProduto("Eletronico","Laptop HP",1000));
        lo.adicionarProduto( ProdutoFactory.criarProduto("Comida","Hamburguer",10.5));
        lo.adicionarProduto( ProdutoFactory.criarProduto("Sapatos","Hamburguer",10.5));

        lo.listarStock();



    }
}
