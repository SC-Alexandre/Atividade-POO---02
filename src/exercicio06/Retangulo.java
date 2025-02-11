package exercicio06;

public class Retangulo implements IForma{
    private double base;
    private double altura;

    public Retangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double calcularArea() {
        return base * altura;
    }

    public void exibirArea(){
        System.out.println("area do retangulo: "+calcularArea());
    }
}
