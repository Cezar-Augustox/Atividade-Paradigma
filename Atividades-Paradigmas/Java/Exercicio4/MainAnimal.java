package Exercicio4;

public class MainAnimal {
    public static void main(String[] args) {
        Cachorro dog = new Cachorro("Luck", "Vira lata", 4);
        Gato cat = new Gato("Lucy", "Persa", 5);

        dog.detalhes();
        cat.detalhes();
        dog.emitir_som();
        cat.emitir_som();
    }
}
