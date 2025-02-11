package exercicio04;

public class MainVeiculo {

    public static void main(String[] args) {

        Carro carro = new Carro();
        carro.setMarca("FIAT");
        carro.setModelo("MOBI");
        carro.setAno(2016);
        carro.setNumeroPortas(4);
        carro.exibirDetalhes();

        System.out.println();

        Moto moto = new Moto();
        moto.setMarca("YAMARA");
        moto.setModelo("YBR125");
        moto.setCilindradas(125);
        moto.exibirDetalhes();
    }
}
