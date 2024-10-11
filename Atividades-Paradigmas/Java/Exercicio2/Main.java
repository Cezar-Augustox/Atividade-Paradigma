package Exercicio2;

public class Main {
    public static void main(String[] args){
        Carro carro = new Carro("Toyota", "Corolla", 2020);

        carro.exibir_detalhes();
        carro.acelerar(30);
        carro.freiar(10);
        carro.exibir_velocidade();
    }
}
