package exercicio03;


public class MainProduto {
    public static void main(String[] args) {

        Produto produto01 = new Produto();
        produto01.setNome("detergente");
        produto01.setPreco(8);
        produto01.adicionarProdutos(15);
        produto01.infoProduto();

        System.out.println();
        produto01.removerProdutos(5);
        produto01.infoProduto(); // após a adição

    }
}
