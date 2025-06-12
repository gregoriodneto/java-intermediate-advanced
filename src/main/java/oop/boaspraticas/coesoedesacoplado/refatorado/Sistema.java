package oop.boaspraticas.coesoedesacoplado.refatorado;

public class Sistema {
    private final Repositorio repositorio;
    private final Notificador notificador;

    public Sistema(Repositorio repositorio, Notificador notificador) {
        this.repositorio = repositorio;
        this.notificador = notificador;
    }

    public void registrarUsuario(String nome) {
        repositorio.salvar(nome);
        notificador.enviar("Cadastro realizado com sucesso!");
    }
}
