package Exercicio8;

import java.util.ArrayList;

public class Empresa {
    private String nome, cnpj;
    private ArrayList<Empregado> empregados;

    public Empresa(String nome, String cnpj) {
        this.nome = nome;
        this.cnpj = cnpj;
        this.empregados = new ArrayList<>();
    }

    public void addEmpregado(Empregado empregado) {
        this.empregados.add(empregado);
    }

    public void detalhes() {
        System.out.println("Nome: " + this.nome +
                "\nCNPJ: " + this.cnpj +
                "\nEmpregados:");
        for(Empregado empregado: this.empregados) {
            empregado.detalhes();
        }
        System.out.println();
    }
}
