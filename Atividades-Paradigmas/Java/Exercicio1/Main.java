package Exercicio1;

public class Main {
    
    public static void main(String[] args) {
        
        Carro carro1 = new Carro("Toyota", "Corolla", 2020);
        Carro carro2 = new Carro("Honda", "Civic", 2019);
        Carro carro3 = new Carro("Ford", "Mustang", 2021);

        carro1.mostrar_detalhes();
        carro2.mostrar_detalhes();
        carro3.mostrar_detalhes();
    }
}
