package exercicio06;

public class Circulo implements IForma{
    private double raio;

    public Circulo(double raio) {
        this.raio = raio;
    }

    @Override
    public double calcularArea() {
        return Math.PI * Math.pow(raio,2);
    }

    public void exibirArea(){
        System.out.println("area do circulo: "+calcularArea());
    }
}
