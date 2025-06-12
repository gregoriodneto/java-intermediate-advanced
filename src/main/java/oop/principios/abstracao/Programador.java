package oop.principios.abstracao;

public class Programador extends Funcionario {
    private double valorPorHora;
    private int horasTrabalhadas;

    public Programador(double valorPorHora, int horasTrabalhadas) {
        this.valorPorHora = valorPorHora;
        this.horasTrabalhadas = horasTrabalhadas;
    }

    @Override
    public double calcularSalario() {
        return horasTrabalhadas * valorPorHora;
    }

    @Override
    public String exibirDados() {
        return "Salário atual é: " + calcularSalario();
    }
}
