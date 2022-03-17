package exercicio04;

public class Supervisor extends Funcionario {

    public Supervisor(String nome, int idade, double salario) {
        this.setNome(nome);
        this.setIdade(idade);
        this.setSalario(salario);

    }

    @Override
    public double bonificacao() {
        return this.getSalario()+5000.00;
    }

    @Override
    public String toString() {
        return "Supervisor {Nome: "+this.getNome()+", Rendimento total: R$ "+String.format("%.2f", this.bonificacao())+"}";
    }
}
