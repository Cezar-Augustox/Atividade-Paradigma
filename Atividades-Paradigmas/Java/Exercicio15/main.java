package Exercicio15;

public class main {
    public static void main(String[] args){
        ContaBancaria conta = new ContaBancaria("Renan");
        conta.depositar(500);
        conta.sacar(300);
        conta.sacar(300);
    }
}
