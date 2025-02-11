package exercicio05;

public class TestePagamento {

    public static void main(String[] args) {
        Pagamento pagamento = new PagamentoBoleto(1500);
        Pagamento pagamento2 = new PagamentoCartao(1500);

        pagamento.calcularValor();
        pagamento2.calcularValor();
        pagamento.exibirDetalhe();
        pagamento2.exibirDetalhe();


    }
}
