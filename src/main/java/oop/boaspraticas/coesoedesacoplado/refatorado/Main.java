package oop.boaspraticas.coesoedesacoplado.refatorado;

/*
 * Um código limpo é composto por objetos coesos e desacoplados.
 * - Coesão significa que uma classe deve se responsabilizar apenas por comportamentos relacionados a ela mesma.
 * - Desacoplamento significa que uma classe não deve depender diretamente de outras classes concretas, pois mudanças em uma podem impactar a outra.
 *
 * A Injeção de Dependência (DI) ajuda a alcançar isso: em vez de uma classe criar suas dependências diretamente,
 * elas são fornecidas de fora, geralmente via construtor, como no exemplo abaixo.
 *
 * Neste exemplo:
 * - Repositorio e Notificador são interfaces.
 * - ConexaoBanco e Email são implementações concretas dessas interfaces.
 * - A classe Sistema depende apenas das interfaces, não das implementações concretas,
 *   o que facilita testes, manutenção e reutilização.
*/
public class Main {
    public static void main(String args[]) {
        Repositorio repositorio = new ConexaoBanco();
        Notificador notificador = new Email();

        Sistema sistema = new Sistema(repositorio, notificador);
        sistema.registrarUsuario("João");
    }
}
