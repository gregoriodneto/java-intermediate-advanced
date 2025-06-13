package projetos.cad_user_notification.infra;

import projetos.cad_user_notification.domain.EventoUsuarioListener;
import projetos.cad_user_notification.domain.Usuario;

public class EmailConsole extends NotificadorBase implements EventoUsuarioListener {
    @Override
    public void enviarMensagem(Usuario usuario, String mensagem) {
        System.out.println("Enviado email para " + usuario.getName() + ": " + formatarMensagem(mensagem));
    }

    @Override
    public void quandoUsuarioCadastrado(Usuario usuario) {
        enviarMensagem(usuario, "Cadastro realizado com sucesso!");
    }
}
