package oop.principios.heranca;

public class Main {
    public static void main(String args[]) {
        Veiculo carro = new Carro("Fiat", "Uno", 2014, 4);
        Veiculo moto = new Moto("Honda", "Titan", 2018, 150);
        System.out.println(carro.exibirInfo());
        System.out.println(moto.exibirInfo());
    }
}
