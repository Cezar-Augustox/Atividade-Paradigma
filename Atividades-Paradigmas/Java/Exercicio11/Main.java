package Exercicio11;

public class Main {
    public static void main(String[] args) {
        FuncionarioAssalariado fAssalariado = new FuncionarioAssalariado(
                "Márcia", "Caixa", 1300, 10);
        FuncionarioHorista fHorista = new FuncionarioHorista(
                "Felipe", "Entregador", 8);

        fAssalariado.calcularSalario(10);
        fHorista.calcularSalario(160);

    }
}
