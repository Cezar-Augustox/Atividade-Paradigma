package main

import "fmt"

type Professor struct {
	nome,cpf string
	escolas []Escola
}

func (p *Professor) AddEscola(escola Escola) {
	p.escolas = append(p.escolas, escola)
}

func (p Professor) GetNome() string {
	return p.nome
}

func (p Professor) GetCpf() string {
	return p.cpf
}

func (p Professor) DetalhesProfessor() {
	fmt.Println("Nome: " + p.nome +
	"\nCPF: " + p.cpf +
	"\nEscolas que trabalha:")
	for _, escola := range p.escolas{
		fmt.Println("  Nome: " + escola.GetNome() + ", CNPJ: " + escola.GetCnpj())
	}
}

type Escola struct {
    nome, cnpj string
	professores []Professor
}

func (e *Escola) AddProfessor(professor Professor) {
	e.professores = append(e.professores, professor)
}

func (e Escola) GetNome() string {
	return e.nome
}

func (e Escola) GetCnpj() string {
	return e.cnpj
}

func (e Escola) DetalhesEscola() {
	fmt.Println("Nome: " + e.nome +
	"\nCNPJ: " + e.cnpj +
	"\nProfessores que trabalham na escola:")
	for _, professor := range e.professores{
		fmt.Println("  Nome: " + professor.GetNome() + ", CPF: " + professor.GetCpf())
	}
}

func AssociarEscolaProfessor(escola *Escola, professor *Professor) {
	escola.AddProfessor(*professor)
	professor.AddEscola(*escola)
}

func main() {
	p1 := Professor{
		nome: "Ricardo",
		cpf: "23523535",
	}

	p2 := Professor{
		nome: "Douglas",
		cpf: "235235235",
	}

	p3 := Professor{
		nome: "Carlos",
		cpf: "43678569",
	}

	e1 := Escola{
		nome: "Escola1",
		cnpj: "234253525",
	}

	e2 := Escola{
		nome: "Escola2",
		cnpj: "239873450",
	}

    e3 := Escola{
		nome: "Escola3",
		cnpj: "7694037560",
	}

	AssociarEscolaProfessor(&e1, &p1)
	AssociarEscolaProfessor(&e1, &p2)
	AssociarEscolaProfessor(&e1, &p3)
	AssociarEscolaProfessor(&e2, &p1)
	AssociarEscolaProfessor(&e2, &p2)
	AssociarEscolaProfessor(&e3, &p1)

	p1.DetalhesProfessor()
	p2.DetalhesProfessor()
	p3.DetalhesProfessor()

	e1.DetalhesEscola()
	e2.DetalhesEscola()
	e3.DetalhesEscola()

}