package Exercicio7;

import java.util.ArrayList;

public class Professor {
    private String nome,cpf;
    private ArrayList<Escola> escolas;

    public Professor(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
        this.escolas = new ArrayList<>();
    }

    public void addEscola(Escola escola) {
        this.escolas.add(escola);
    }

    public void detalhesProfessor() {
        System.out.println("Nome: " + this.nome +
                "\nCPF: " + this.cpf +
                "\nEscolas em que trabalha:");
        for(Escola escola: escolas) {
            System.out.println("  Nome: " + escola.getNome() + ", CNPJ: " + escola.getCnpj());
        }
    }

    public String getNome() {
        return this.nome;
    }

    public String getCpf() {
        return this.cpf;
    }
}
