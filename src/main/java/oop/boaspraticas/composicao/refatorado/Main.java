package oop.boaspraticas.composicao.refatorado;

/*
 * Prefira composição em vez de herança para reutilização de código.
 * Composição significa construir objetos a partir de outros objetos (has-a), em vez de estender classes (is-a).
 *
 * Herança cria um acoplamento forte entre classes.
 * Por exemplo, se a classe Pessoa mudar, isso pode quebrar a classe Funcionario, caso ela herde de Pessoa.
 *
 * Já com composição, Funcionario contém uma instância de Pessoa, o que torna o sistema mais flexível e menos acoplado.
*/
public class Main {
    public static void main(String args[]) {
        Pessoa pessoa = new Pessoa("João");
        Funcionario funcionario = new Funcionario(pessoa, 3000.0);
        System.out.println(funcionario);
    }
}
