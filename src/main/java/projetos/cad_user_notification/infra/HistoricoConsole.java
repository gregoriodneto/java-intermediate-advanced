package projetos.cad_user_notification.infra;

import projetos.cad_user_notification.domain.EventoUsuarioListener;
import projetos.cad_user_notification.domain.Historico;
import projetos.cad_user_notification.domain.Usuario;
import projetos.cad_user_notification.utils.UtilData;

public class HistoricoConsole implements Historico, EventoUsuarioListener {
    @Override
    public void registrar(Usuario usuario, String acao) {
        System.out.println("[Histórico] " + UtilData.agoraFormatado() + " " + usuario.getName() + " - " + acao);
    }

    @Override
    public void quandoUsuarioCadastrado(Usuario usuario) {
        registrar(usuario, "Cadastro Realizado");
    }
}
