package projetos.cad_user_notification.app;

import projetos.cad_user_notification.domain.*;
import projetos.cad_user_notification.strategies.ValidadorComposto;
import projetos.cad_user_notification.strategies.ValidadorStrategy;

import java.util.ArrayList;
import java.util.List;

public class Sistema {
    private final Repositorio repositorio;
    private final ValidadorComposto validadorComposto;
    private final List<EventoUsuarioListener> listeners = new ArrayList<>();

    public Sistema(Repositorio repositorio, ValidadorComposto validadorComposto) {
        this.repositorio = repositorio;
        this.validadorComposto = validadorComposto;
    }

    public void adicionarListener(EventoUsuarioListener listener) {
        listeners.add(listener);
    }

    public void cadastrarUsuario(String nome) {
        if (!validadorComposto.validador(nome)) {
            return;
        }
        Usuario usuario = new Usuario(nome);
        repositorio.salvar(usuario);

        // Notificar todos os ouvintes
        for (EventoUsuarioListener listener : listeners) {
            listener.quandoUsuarioCadastrado(usuario);
        }
    }
}
