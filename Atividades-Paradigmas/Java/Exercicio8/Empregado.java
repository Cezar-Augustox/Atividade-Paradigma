package Exercicio8;

public class Empregado {
    private String nome,cargo;
    private double salario;

    public Empregado(String nome, String cargo, double salario) {
        this.nome = nome;
        this.cargo = cargo;
        this.salario = salario;
    }

    public void detalhes() {
        System.out.printf(" -Nome: %s, Cargo: %s, Salário: %.2f\n", this.nome, this.cargo, this.salario);
    }
}
