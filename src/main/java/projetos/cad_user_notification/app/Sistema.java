package projetos.cad_user_notification.app;

import projetos.cad_user_notification.domain.*;

import java.util.ArrayList;
import java.util.List;

public class Sistema {
    private final Repositorio repositorio;
    private final List<EventoUsuarioListener> listeners = new ArrayList<>();

    public Sistema(Repositorio repositorio) {
        this.repositorio = repositorio;
    }

    public void adicionarListener(EventoUsuarioListener listener) {
        listeners.add(listener);
    }

    public void cadastrarUsuario(String nome) {
        Usuario usuario = new Usuario(nome);
        repositorio.salvar(usuario);

        // Notificar todos os ouvintes
        for (EventoUsuarioListener listener : listeners) {
            listener.quandoUsuarioCadastrado(usuario);
        }
    }
}
