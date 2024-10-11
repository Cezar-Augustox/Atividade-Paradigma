package Exercicio9;

public class Contrato implements Interfaces.Imprimivel{
    private String conteudo;

    public Contrato(String conteudo){
        this.conteudo = conteudo;
    }
    @Override
    public void imprimir(){
        System.out.println("Conteúdo:\n" + this.conteudo + "\n");
    }
}
