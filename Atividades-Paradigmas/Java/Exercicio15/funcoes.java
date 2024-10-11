package Exercicio15;

public class funcoes {
    public static void verificaSaldoSaque(double saldo, double valor) throws SaldoInsuficienteException {
        if (valor > saldo){
            throw new SaldoInsuficienteException("Erro: Saldo insuficiente para saque.");
        }
    }
}
