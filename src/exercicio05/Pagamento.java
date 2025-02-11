package exercicio05;

public abstract class Pagamento {

    private double valor;

    public Pagamento(double valor) {
        this.valor = valor;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public abstract double calcularValor();

    public void exibirDetalhe(){
        System.out.println("Pagamento realizado com sucesso. Valor R$ "+calcularValor());
    }

}
