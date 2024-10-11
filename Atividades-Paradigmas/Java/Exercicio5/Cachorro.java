package Exercicio5;

public class Cachorro extends Animal {

    public Cachorro(String nome, String raca, int idade) {
        super(nome, raca, idade, "Cachorro");
    }

    @Override
    public void emitir_som(){
        System.out.println(this.nome + " faz AU AU");
    }
}
