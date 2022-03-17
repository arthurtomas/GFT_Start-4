package exercicio04;

public class Vendedor extends Funcionario {

    public Vendedor(String nome, int idade, double salario) {
        this.setNome(nome);
        this.setIdade(idade);
        this.setSalario(salario);

    }

    @Override
    public double bonificacao() {
        return this.getSalario()+3000.00;
    }

    @Override
    public String toString() {
        return "Vendedor {Nome: "+this.getNome()+", Rendimento total: R$ "+String.format("%.2f", this.bonificacao())+"}";
    }
}
