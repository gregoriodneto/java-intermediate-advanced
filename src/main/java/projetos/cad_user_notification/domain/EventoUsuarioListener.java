package projetos.cad_user_notification.domain;

public interface EventoUsuarioListener {
    default void quandoUsuarioCadastrado(Usuario usuario) { }

    default void quandoUsuarioRemovido(Usuario usuario) {}
}
