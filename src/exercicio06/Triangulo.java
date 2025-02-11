package exercicio06;

public class Triangulo implements IForma{
    private double base;
    private double altura;

    public Triangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double calcularArea(){
        return (base*altura) / 2;
    }

    public void exibirArea(){
        System.out.println("area do trangulo: "+calcularArea());
    }

}
