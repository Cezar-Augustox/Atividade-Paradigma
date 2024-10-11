package Exercicio3;

public class ContaBancaria {
    public String titular;
    protected double saldo;

    public ContaBancaria(String titular){
        this.titular = titular;
        this.saldo = 0.0;
    }

    public void depositar(double valor){
        this.saldo += valor;
        System.out.println("Depósito de R$" + valor + " realizado com sucesso");
        System.out.printf("Saldo atual: R$%.2f\n", this.saldo);
    }

    public void sacar(double valor){
        if (valor <= this.saldo) {
            this.saldo -= valor;
            System.out.println("Saque de R$" + valor + " realizado com sucesso");
        }else{
            System.out.println("Saque de R$" + valor + " não foi realizado, pois o saldo é insuficiente");
        }
        System.out.printf("Saldo atual: R$%.2f\n", this.saldo);
    }

    public void exibir_detalhes(){
        System.out.printf("Titular: %s, Saldo: R$%.2f\n", this.titular, this.saldo);
    }
}
