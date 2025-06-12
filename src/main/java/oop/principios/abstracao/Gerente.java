package oop.principios.abstracao;

public class Gerente extends Funcionario {
    private double salario;
    private double bonus;

    public Gerente(double salario, double bonus) {
        this.salario = salario;
        this.bonus = bonus;
    }

    @Override
    public double calcularSalario() {
        return salario + bonus;
    }

    @Override
    public String exibirDados() {
        return "Salário atual é: " + calcularSalario();
    }
}
