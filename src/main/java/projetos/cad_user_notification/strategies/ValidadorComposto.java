package projetos.cad_user_notification.strategies;

import java.util.List;

public class ValidadorComposto implements ValidadorStrategy {
    private final List<ValidadorStrategy> validadores;

    public ValidadorComposto(List<ValidadorStrategy> validadores) {
        this.validadores = validadores;
    }

    @Override
    public boolean validador(String nome) {
        for (ValidadorStrategy validador : validadores) {
            if (!validador.validador(nome)) {
                return false;
            }
        }
        return true;
    }
}
