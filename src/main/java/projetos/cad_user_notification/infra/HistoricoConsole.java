package projetos.cad_user_notification.infra;

import projetos.cad_user_notification.domain.EventoUsuarioListener;
import projetos.cad_user_notification.domain.Historico;
import projetos.cad_user_notification.domain.Usuario;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class HistoricoConsole implements Historico, EventoUsuarioListener {
    @Override
    public void registrar(Usuario usuario, String acao) {
        String dateTimeNow = LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss"));
        System.out.println("[Histórico] " + dateTimeNow + " " + usuario.getName() + " - " + acao);
    }

    @Override
    public void quandoUsuarioCadastrado(Usuario usuario) {
        registrar(usuario, "Cadastro Realizado");
    }
}
