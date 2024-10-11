package Exercicio6;

public class Carro {
    private String marca, modelo;
    private int ano;
    private Motor motor;

    public Carro(String marca, String modelo, int ano, Motor motor) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.motor = motor;
    }

    public String detalhesCarro() {
        return "Marca: " + this.marca + ", Modelo: " + this.modelo +
                ", Ano: " + this.ano + ", Motor: " + this.motor.detalhesMotor();
    }
}
