package oop.principios.polimorfismo;

public class Main {
    public static void main(String args[]) {
        Animal[] animals = {
          new Cachorro(),
          new Gato(),
          new Vaca()
        };
        listagemAnimais(animals);
    }

    public static void listagemAnimais(Animal[] animais) {
        for (Animal animal : animais) {
            System.out.println(animal.emitirSom());
        }
    }
}
