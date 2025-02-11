package exercicio07;

public class testeFuncionario {
    public static void main(String[] args) {

        Funcionario funcionario1 = new Funcionario("Jorge",1500);
        Desenvolvedor dev1 = new Desenvolvedor("Tayna", 2000);
        Gerente gerente = new Gerente("Leonardo", 4000);

        System.out.println();
        funcionario1.exbirDetalhes();
        System.out.println();
        dev1.exbirDetalhes();
        System.out.println();
        gerente.exbirDetalhes();
    }
}
