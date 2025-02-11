package exercicio03;

public class Produto {
    private String nome;
    private double preco;
    private int quantidade;

    public Produto(){}

    public Produto(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void infoProduto(){
        System.out.println(" ======"
                +"\n INFO"
                +"\n ======"
                +"\n Nome: "+nome
                +"\n Preco: "+preco
                +"\n quantidade: "+quantidade);

    }

    public void adicionarProdutos(int quantidade){
        if(quantidade > 0){
            this.quantidade += quantidade;
        }else{
            System.out.println("Quantidade informada  não deve ser negativa.");
        }
    }

    public void removerProdutos(int quantidade){
        if(quantidade > 0 & quantidade <= this.quantidade){
            this.quantidade -= quantidade;
        }else{
            System.out.println("Quantidade inválida. Certifique-se de que o valor seja positivo e não ultrapasse o estoque disponível.");
        }
    }

}
