package Exercicio9;

public class Relatorio implements Interfaces.Imprimivel {
    private String conteudo;

    public Relatorio(String conteudo){
        this.conteudo = conteudo;
    }
    @Override
    public void imprimir(){
        System.out.println("Conteúdo:\n" + this.conteudo + "\n");
    }
}
