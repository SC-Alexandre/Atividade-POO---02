package exercicio05;

public class PagamentoCartao extends Pagamento {

    public PagamentoCartao(double valor){
        super(valor);
    }

    @Override
    public double calcularValor(){
        return getValor()  - (getValor() * 0.02);
    }

}
