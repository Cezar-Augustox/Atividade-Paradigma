package Exercicio13;

public class Matematica {
    public static int fatorial(int n){
        int resultado = 1;
        for(int i =  2; i <= n; i++){
            resultado *= i;
        }
        return resultado;
    }
}
