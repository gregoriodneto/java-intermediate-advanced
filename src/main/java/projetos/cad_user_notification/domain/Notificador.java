package projetos.cad_user_notification.domain;

public interface Notificador {
    void enviarMensagem(Usuario usuario, String mensagem);
}
