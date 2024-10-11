package Exercicio1;

public class Carro {
    
    private String marca;
    private String modelo;
    private int ano;

    public Carro(String marca, String modelo, int ano){
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
    }

    public void mostrar_detalhes(){
        System.out.println("Marca: " + this.marca + ", Modelo: " + this.modelo + ", Ano: " + this.ano);
    }
}