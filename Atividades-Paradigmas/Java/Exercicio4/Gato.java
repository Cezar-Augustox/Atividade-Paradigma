package Exercicio4;

public class Gato extends Animal{

    public Gato(String nome, String raca, int idade) {
        super(nome, raca, idade, "Gato");
    }

    @Override
    public void emitir_som() {
        System.out.println(this.nome + " faz MIAU");
    }
}
