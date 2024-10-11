package Exercicio11;

public class FuncionarioHorista extends Funcionario{
    private double valorHora;

    public FuncionarioHorista(String nome, String cargo, double valorHora) {
        super(nome,cargo);
        this.valorHora = valorHora;
    }

    public void calcularSalario(double horasTrabalhadas){
        System.out.println(this.valorHora * horasTrabalhadas);
    }
}
