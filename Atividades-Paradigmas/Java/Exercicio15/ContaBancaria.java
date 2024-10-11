package Exercicio15;

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
        try {
            funcoes.verificaSaldoSaque(this.saldo, valor);
            this.saldo -= valor;
            System.out.println("Saque de R$" + valor + " realizado com sucesso");
            System.out.printf("Saldo atual: R$%.2f\n", this.saldo);
        } catch (SaldoInsuficienteException e) {
            System.out.println(e.getMessage());
        }


    }
}
