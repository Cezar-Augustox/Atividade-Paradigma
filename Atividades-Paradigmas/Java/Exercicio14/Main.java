package Exercicio14;

public class Main {
    public static void main(String[] args){
        Configuracao c1 = Configuracao.getInstancia();
        c1.setLinguagem("Português Brasileiro");
        System.out.println(c1.getLinguagem());
        Configuracao c2 = Configuracao.getInstancia();
        System.out.println(c2.getLinguagem());
        c2.setLinguagem("Francês");
        System.out.println(c1.getLinguagem());
    }
}
