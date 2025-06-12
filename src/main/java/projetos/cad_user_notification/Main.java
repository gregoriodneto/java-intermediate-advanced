package projetos.cad_user_notification;

import projetos.cad_user_notification.app.Sistema;
import projetos.cad_user_notification.domain.Historico;
import projetos.cad_user_notification.domain.Notificador;
import projetos.cad_user_notification.domain.Repositorio;
import projetos.cad_user_notification.infra.BancoEmMemoria;
import projetos.cad_user_notification.infra.EmailConsole;
import projetos.cad_user_notification.infra.HistoricoConsole;

/*
 * Projeto baseado em boas práticas de programação orientada a objetos.
 *
 * Princípios e padrões aplicados:
 *
 * - SRP (Princípio da Responsabilidade Única): cada classe possui uma única responsabilidade bem definida.
 * - Coesão: os métodos de cada classe estão diretamente relacionados ao propósito da classe.
 * - Desacoplamento: o sistema depende de interfaces (abstrações), não de implementações concretas.
 * - Composição: objetos são compostos por outros objetos, evitando o uso desnecessário de herança.
 * - OCP (Princípio Aberto/Fechado): o sistema é aberto para extensão, mas fechado para modificação.
 *
 * Padrões de projeto:
 * - Observer: o padrão Observer é aplicado por meio da interface EventoUsuarioListener.
 *   As classes HistoricoConsole e EmailConsole implementam essa interface e reagem
 *   de forma independente ao evento de cadastro de usuário.
 *
 * Observações adicionais:
 * - A classe Sistema recebe suas dependências por injeção de dependência.
 * - O código é mais testável, flexível e de fácil manutenção.
 */
public class Main {
    public static void main(String args[]) {
        Repositorio repositorio = new BancoEmMemoria();

        EmailConsole notificador = new EmailConsole();
        HistoricoConsole historico = new HistoricoConsole();

        Sistema sistema = new Sistema(repositorio);

        sistema.adicionarListener(historico);
        sistema.adicionarListener(notificador);

        sistema.cadastrarUsuario("Maria");
        sistema.cadastrarUsuario("João");
    }
}
