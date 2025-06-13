package projetos.cad_user_notification.strategies;

public class NomeMinimoTresCaracteres implements ValidadorStrategy {
    @Override
    public boolean validador(String nome) {
        if (nome == null || nome.length() < 3) {
            System.out.println("[Validação] O nome deve ter pelo menos 3 caracteres.");
            return false;
        }
        return true;
    }
}
