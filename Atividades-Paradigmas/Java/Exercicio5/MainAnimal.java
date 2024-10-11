package Exercicio5;
import java.util.List;

public class MainAnimal {

    public static void emitir_som(List<Animal> animais) {
        for (Animal animal: animais){
            animal.emitir_som();
        }
    }

    public static void detalhes(List<Animal> animais) {
        for (Animal animal: animais){
            animal.detalhes();
        }
    }

    public static void main(String[] args) {
        Cachorro dog = new Cachorro("Luck", "Vira lata", 4);
        Gato cat = new Gato("Lucy", "Persa", 5);

        List<Animal> animais = List.of(dog, cat);

        detalhes(animais);
        emitir_som(animais);
    }
}
