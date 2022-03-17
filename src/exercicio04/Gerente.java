package exercicio04;

public class Gerente extends Funcionario {

    public Gerente(String nome, int idade, double salario) {
        this.setNome(nome);
        this.setIdade(idade);
        this.setSalario(salario);

    }

    @Override
    public double bonificacao() {
        return this.getSalario()+10000.00;
    }

    @Override
    public String toString() {
        return "Gerente {Nome: "+this.getNome()+", Rendimento total: R$ "+String.format("%.2f", this.bonificacao())+"}";
    }
}
