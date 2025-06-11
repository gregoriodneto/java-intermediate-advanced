package oop.abstracao;

public class Main {
    public static void main(String args[]) {
        Funcionario programador = new Programador(50.0, 160);
        Funcionario gerente = new Gerente(5000.0, 1200.0);

        System.out.println(programador.exibirDados());
        System.out.println(gerente.exibirDados());
    }
}
