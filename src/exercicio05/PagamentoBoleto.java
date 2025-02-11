package exercicio05;

public class PagamentoBoleto extends Pagamento{

    public PagamentoBoleto(double valor){
        super(valor);
    }
    @Override
    public double calcularValor() {
        return getValor();
    }
}
