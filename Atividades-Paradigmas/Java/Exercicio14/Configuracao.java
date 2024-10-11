package Exercicio14;

public class Configuracao {
    private static Configuracao instancia = null;
    private String linguagem;

    private Configuracao(){
        this.linguagem = "";
    }

    public static Configuracao getInstancia(){
        if (instancia == null) {
            instancia = new Configuracao();
        }
        return instancia;
    }

    public void setLinguagem(String linguagem){
        this.linguagem = linguagem;
    }

    public String getLinguagem(){
        return this.linguagem;
    }
}
