package Exercicio11;

public class FuncionarioAssalariado extends Funcionario{
    private double salario, valorHoraExtra;

    public FuncionarioAssalariado(String nome, String cargo,double salario, double valorHoraExtra) {
        super(nome,cargo);
        this.salario = salario;
        this.valorHoraExtra = valorHoraExtra;
    }

    public void calcularSalario(double horasExtra){
        System.out.println(this.salario + this.valorHoraExtra * horasExtra);
    }
}
