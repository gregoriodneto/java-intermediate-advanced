package oop.principios.heranca;

public class Carro extends Veiculo{
    private int quantidadePortas;

    public Carro(String marca, String modelo, int ano, int quantidadePortas) {
        super(marca, modelo, ano);
        this.quantidadePortas = quantidadePortas;
    }

    @Override
    public String exibirInfo() {
        return "{marca='"+ getMarca() + '\'' +
                ", modelo='" + getModelo() + '\'' +
                ", ano=" + getAno() +
                ", quantidadePortas="+ getQuantidadePortas() + "}";
    }

    public int getQuantidadePortas() {
        return quantidadePortas;
    }
}
