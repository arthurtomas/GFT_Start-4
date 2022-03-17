package exercicio04;

public class Principal {
    public static void main(String[] args) {

        Funcionario gerente = new Gerente("Carlos", 54, 9000.00);
        Funcionario supervisor = new Supervisor("Marcos", 33, 8000.00);
        Funcionario vendedor = new Vendedor("Almachio", 47, 6000.00);

        System.out.println(gerente.toString());
        System.out.println(supervisor.toString());
        System.out.println(vendedor.toString());
    }
}
