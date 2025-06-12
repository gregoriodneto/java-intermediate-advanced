package oop.boaspraticas.composicao.refatorado;

public class Funcionario {
    private Pessoa pessoa;
    private double salario;

    public Funcionario(Pessoa pessoa, double salario) {
        this.pessoa = pessoa;
        this.salario = salario;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public double getSalario() {
        return salario;
    }

    @Override
    public String toString() {
        return "Funcionario{" +
                "pessoa=" + pessoa +
                ", salario=" + salario +
                '}';
    }
}
