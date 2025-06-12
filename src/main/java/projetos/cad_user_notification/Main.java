package projetos.cad_user_notification;

import projetos.cad_user_notification.app.Sistema;
import projetos.cad_user_notification.domain.Notificador;
import projetos.cad_user_notification.domain.Repositorio;
import projetos.cad_user_notification.infra.BancoEmMemoria;
import projetos.cad_user_notification.infra.EmailConsole;

/*
 * Projeto baseado no conteúdo de boas práticas de programação orientada a objetos.
 *
 * Princípios aplicados:
 * - SRP (Princípio da Responsabilidade Única): cada classe possui apenas uma função clara e bem definida.
 * - Coesão: os métodos de cada classe estão relacionados à sua responsabilidade principal.
 * - Desacoplamento: o sistema depende de interfaces (abstrações), e não de implementações concretas.
 * - Composição: objetos são formados por outros objetos, evitando herança desnecessária.
 *
 * Observações:
 * - A classe Sistema recebe suas dependências por injeção de dependência, não cria instâncias diretamente.
 * - Isso facilita a manutenção, os testes e a flexibilidade do código.
 */
public class Main {
    public static void main(String args[]) {
        Repositorio repositorio = new BancoEmMemoria();
        Notificador notificador = new EmailConsole();

        Sistema sistema = new Sistema(repositorio, notificador);
        sistema.cadastrarUsuario("Maria");
        sistema.cadastrarUsuario("João");
    }
}
