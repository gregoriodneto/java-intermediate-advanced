package projetos.cad_user_notification.infra;

import projetos.cad_user_notification.domain.Notificador;
import projetos.cad_user_notification.domain.Usuario;

public class EmailConsole implements Notificador {
    @Override
    public void enviarMensagem(Usuario usuario, String mensagem) {
        System.out.println("Enviado email para " + usuario.getName() + ": " + mensagem);
    }
}
