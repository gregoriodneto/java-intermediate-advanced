package oop.boaspraticas.coesoedesacoplado.err;

public class SistemaErr {
    private ConexaoBancoErr banco = new ConexaoBancoErr();
    private EmailErr email = new EmailErr();

    public void registrarUsuario(String nome) {
        banco.salvar(nome);
        email.enviar("Cadastro realizado com sucesso!");
    }
}
