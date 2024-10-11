package Exercicio5;

public class Animal {
    public String nome, raca, especie;
    public int idade;

    public Animal(String nome, String raca, int idade, String especie){
        this.nome = nome;
        this.raca = raca;
        this.especie = especie;
        this.idade = idade;
    }

    public void detalhes(){
        System.out.printf("Nome: %s, Espécie: %s, Raça: %s, Idade: %d\n", this.nome, this.especie, this.raca, this.idade);
    }

    public void emitir_som(){
        System.out.println("Este animal faz som");
    }
}
