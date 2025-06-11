package oop.encapsulamento;

public class Produto {
    private String nome;
    private double preco;
    private int estoque;

    public Produto(String nome, double preco, int estoque) {
        this.nome = nome;
        this.preco = preco > 0 ? preco : 0.01;
        this.estoque = Math.max(estoque, 0);
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public int getEstoque() {
        return estoque;
    }

    public void setPreco(double novoPreco) {
        if (novoPreco > 0) {
            preco = novoPreco;
        } else {
            System.out.println("Preço inválido. Deve ser maior que zero.");
        }
    }

    public void adicionarEstoque(int qtd) {
        if (qtd > 0) {
            estoque += qtd;
        } else {
            System.out.println("Quantidade deve ser maior que zero.");
        }
    }

    public void removerEstoque(int qtd) {
        if (qtd > 0 && qtd <= estoque) {
            estoque -= qtd;
        } else {
           System.out.println("Quantidade inválida para remoção.");
        }
    }

    @Override
    public String toString() {
        return "Produto{" +
                "nome='" + nome + '\'' +
                ", preco=" + preco +
                ", estoque=" + estoque +
                '}';
    }
}
