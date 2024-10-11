package Exercicio8;

public class Main {
    public static void main(String[] args) {
        Empregado e1 = new Empregado("Renan", "Engenheiro de Software", 50000);
        Empregado e2 = new Empregado("Lucas", "programdos Junior", 5000);
        Empregado e3 = new Empregado("Pedro", "Estagiário", 2000);

        Empresa empresa = new Empresa("Google", "28284298240");

        empresa.addEmpregado(e1);
        empresa.addEmpregado(e2);
        empresa.addEmpregado(e3);

        empresa.detalhes();
    }
}
