package oop.encapsulamento;

public class Main {
    public static void main(String args[]) {
        Produto produto = new Produto("Notebook", 3000.0, 5);
        System.out.println(produto);
        produto.setPreco(3500.0);
        produto.adicionarEstoque(9);
        produto.removerEstoque(4);
        System.out.println(produto);
    }
}
