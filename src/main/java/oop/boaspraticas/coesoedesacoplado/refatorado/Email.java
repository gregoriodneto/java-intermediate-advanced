package oop.boaspraticas.coesoedesacoplado.refatorado;

public class Email implements Notificador {
    @Override
    public void enviar(String mensagem) {
        System.out.println(mensagem);
    }
}
