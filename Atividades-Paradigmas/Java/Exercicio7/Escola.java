package Exercicio7;

import java.util.ArrayList;

public class Escola {
    private String nome,cnpj;
    private ArrayList<Professor> professores;

    public Escola(String nome, String cnpj) {
        this.nome = nome;
        this.cnpj = cnpj;
        this.professores = new ArrayList<>();
    }

    public void addProfessor(Professor professor) {
        this.professores.add(professor);
    }

    public void detalhesEscola() {
        System.out.println("Nome: " + this.nome +
                "\nCNPJ: " + this.cnpj +
                "\nProfessores que trabalham na escola:");
        for(Professor professor: professores) {
            System.out.println("  Nome: " + professor.getNome() + ", CPF: " + professor.getCpf());
        }
    }

    public String getNome() {
        return this.nome;
    }

    public String getCnpj() {
        return this.cnpj;
    }
}
