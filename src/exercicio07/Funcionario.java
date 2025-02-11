package exercicio07;

public class Funcionario {
    private String nome;
    private double salario;

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public void exbirDetalhes(){
        System.out.println(" ============="
                +"\n INFORMAÇÕES"
                +"\n ============="
                +"\n Nome: "+nome
                +"\n Salario: "+salario
                +"\n Bônus: "+calcularBonus());
    }

    public double calcularBonus(){
        return salario * 0.10;
    }

}
