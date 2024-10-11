package Exercicio9;

public class Main {
    public static void main(String[] args){
        Relatorio relatorio = new Relatorio("Conteúdo do relatório");
        Contrato contrato = new Contrato("Conteúdo do contrato");

        funcoes.imprimirDocumento(relatorio);
        funcoes.imprimirDocumento(contrato);
    }
}
