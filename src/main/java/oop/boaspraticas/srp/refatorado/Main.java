package oop.boaspraticas.srp.refatorado;

/*
 * O SRP (Princípio da Responsabilidade Única) afirma que uma classe deve ter apenas uma responsabilidade.
 * No exemplo original, a classe Relatorio tinha três responsabilidades: gerar, salvar e imprimir relatórios.
 * Isso violava o SRP, pois mudanças em uma dessas responsabilidades poderiam afetar as outras.
 *
 * Para corrigir isso, o código foi refatorado em três classes:
 * - GerarRelatorio: responsável por gerar o conteúdo do relatório.
 * - ArmazenarRelatorio: responsável por salvar o relatório.
 * - ImpressoraRelatorio: responsável por imprimir o relatório.
 *
 * Dessa forma, cada classe tem uma única responsabilidade,
 * tornando o código mais coeso, modular e fácil de manter.
 */
public class Main {
    public static void main(String args[]) {
        GerarRelatorio relatorio = new GerarRelatorio();
        ArmazenarRelatorio armazenarRelatorio = new ArmazenarRelatorio();
        ImpressoraRelatorio impressoraRelatorio = new ImpressoraRelatorio();
        armazenarRelatorio.salvar(relatorio.gerar());
        impressoraRelatorio.imprimir(relatorio.gerar());
    }
}
