package oop.boaspraticas.coesoedesacoplado.refatorado;

public class ConexaoBanco implements Repositorio {
    @Override
    public void salvar(String nome) {
        System.out.println("Salvo no banco: " + nome);
    }
}
