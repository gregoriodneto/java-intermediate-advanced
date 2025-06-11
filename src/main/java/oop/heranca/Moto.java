package oop.heranca;

public class Moto extends Veiculo {
    private int cilindrada;

    public Moto(String marca, String modelo, int ano, int cilindrada) {
        super(marca, modelo, ano);
        this.cilindrada = cilindrada;
    }

    @Override
    public String exibirInfo() {
        return "{marca='"+ getMarca() + '\'' +
                ", modelo='" + getModelo() + '\'' +
                ", ano=" + getAno() +
                ", cilindrada="+ getCilindrada() + "}";
    }

    public int getCilindrada() {
        return cilindrada;
    }
}
