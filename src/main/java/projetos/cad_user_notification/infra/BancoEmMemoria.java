package projetos.cad_user_notification.infra;

import projetos.cad_user_notification.domain.Repositorio;
import projetos.cad_user_notification.domain.Usuario;

import java.util.ArrayList;
import java.util.List;

public class BancoEmMemoria implements Repositorio {
    private List<Usuario> usuarios = new ArrayList<>();

    @Override
    public void salvar(Usuario usuario) {
        usuarios.add(usuario);
        System.out.println("Usuário salvo no banco em memória: " + usuario.getName());
    }
}
