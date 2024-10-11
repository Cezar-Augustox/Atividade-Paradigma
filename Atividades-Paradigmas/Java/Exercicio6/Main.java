package Exercicio6;

public class Main {
    public static void main(String[] args) {
        Motor motor = new Motor("Híbrido", 2000);
        Carro carro = new Carro("Toyota", "Corolla", 2020, motor);

        System.out.println(carro.detalhesCarro());
    }
}
