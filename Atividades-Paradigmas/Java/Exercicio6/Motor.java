package Exercicio6;

public class Motor {
    private String tipo;
    private int cilindradas;

    public Motor(String tipo, int cilindradas) {
        this.tipo = tipo;
        this.cilindradas = cilindradas;
    }

    public String detalhesMotor() {
        return this.tipo + " de " + this.cilindradas + " cilindradas";
    }
}
