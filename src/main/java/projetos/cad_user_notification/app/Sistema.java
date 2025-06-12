package projetos.cad_user_notification.app;

import projetos.cad_user_notification.domain.Notificador;
import projetos.cad_user_notification.domain.Repositorio;
import projetos.cad_user_notification.domain.Usuario;

public class Sistema {
    private final Repositorio repositorio;
    private final Notificador notificador;

    public Sistema(Repositorio repositorio, Notificador notificador) {
        this.repositorio = repositorio;
        this.notificador = notificador;
    }

    public void cadastrarUsuario(String nome) {
        Usuario usuario = new Usuario(nome);
        repositorio.salvar(usuario);
        notificador.enviarMensagem(usuario, "Cadastro realizado com sucesso!");
    }
}
