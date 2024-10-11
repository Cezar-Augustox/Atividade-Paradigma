package Exercicio7;

public class Main {
    public static void AssociarProfessorEscola(Escola escola, Professor professor) {
        escola.addProfessor(professor);
        professor.addEscola(escola);
    }

    public static void main(String[] args) {
        Professor p1 = new Professor("Ricardo", "726384367");
        Professor p2 = new Professor("Douglas", "984357359");
        Professor p3 = new Professor("Carlos", "342423523");

        Escola e1 = new Escola("Escola1", "2342323435");
        Escola e2 = new Escola("Escola2", "4525234525");
        Escola e3 = new Escola("Escola3", "5673865962");

        AssociarProfessorEscola(e1, p1);
        AssociarProfessorEscola(e1, p2);
        AssociarProfessorEscola(e1, p3);
        AssociarProfessorEscola(e2, p1);
        AssociarProfessorEscola(e2, p2);
        AssociarProfessorEscola(e3, p1);

        p1.detalhesProfessor();
        p2.detalhesProfessor();
        p3.detalhesProfessor();

        e1.detalhesEscola();
        e2.detalhesEscola();
        e3.detalhesEscola();

    }
}
