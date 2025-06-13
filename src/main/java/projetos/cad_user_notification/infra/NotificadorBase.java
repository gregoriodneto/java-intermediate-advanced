package projetos.cad_user_notification.infra;

import projetos.cad_user_notification.domain.Notificador;

public abstract class NotificadorBase implements Notificador {
    protected String formatarMensagem(String mensagem) {
        return "[Notificação] " + mensagem;
    }
}
