package Exercicio12;

public class Main {
    public static void main(String[] args){
        Produto p1 = new Produto("Feijão", 5);
        Produto p2 = new Produto("Arroz", 6);

        double valorFinal = funcoes.somaValorProdutos(p1, p2);

        System.out.println(valorFinal);
    }
}
