package projetos.cad_user_notification.strategies;

public class NomeNaoNuloOuVazio implements ValidadorStrategy {
    @Override
    public boolean validador(String nome) {
        if (nome == null || nome.isEmpty()) {
            System.out.println("[Validação] O nome não pode ser vazio.");
            return false;
        }
        return true;
    }
}
