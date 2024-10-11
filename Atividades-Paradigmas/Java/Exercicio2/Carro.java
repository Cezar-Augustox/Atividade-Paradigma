package Exercicio2;

public class Carro {
    private String marca, modelo;
    private int ano, velocidade;

    public Carro(String marca, String modelo, int ano){
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.velocidade = 0;
    }

    public void exibir_detalhes(){
        System.out.printf("Marca: %s, Modelo: %s, Ano: %d\n", this.marca, this.modelo, this.ano);
    }

    public void acelerar(double aumento_velocidade){
        this.velocidade += aumento_velocidade;
    }

    public void freiar(double reducao_velocidade){
        this.velocidade -= reducao_velocidade;
    }

    public void exibir_velocidade(){
        System.out.printf("A velocidade atual do %d é de %dkm/h\n", this.modelo, this.velocidade);
    }

}
