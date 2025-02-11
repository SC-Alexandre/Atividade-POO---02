package exercicio06;

public class TesteFormas {
    public static void main(String[] args) {
        Triangulo triangulo = new Triangulo(4,8);
        triangulo.exibirArea();

        Retangulo retangulo = new Retangulo(4,4);
        retangulo.exibirArea();

        Circulo circulo = new Circulo(8);
        circulo.exibirArea();
    }

}
