package main

import "fmt"

type Empregado struct {
	nome string
    cargo string
    salario float64
}
    
func (e Empregado) Detalhes() {
	fmt.Printf(" -Nome: %s, Cargo: %s, Salário: %.2f\n", e.nome, e.cargo, e.salario)
}
        
type Empresa struct {
	nome, cnpj string
    empregados []Empregado
}
          
func (e *Empresa) addEmpregados(empregado Empregado) {
	e.empregados = append(e.empregados, empregado)
}
        
    
func (e Empresa) detalhes() {
	
	fmt.Println("Nome:", e.nome,
              "\nCNPJ:", e.cnpj,
              "\nEmpregados:")
        
    for _, empregado := range e.empregados {
		empregado.Detalhes()
	}
               
    fmt.Println()
}
        
        
func main() {
	
	e1 := Empregado{
		nome: "Renan",
	    cargo: "Engenheiro de Software",
	    salario: 50000,
	}

	e2 := Empregado{
		nome: "Lucas",
		cargo: "Programador Junior",
		salario: 5000,
	}

	e3 := Empregado{
		nome: "Pedro",
		cargo: "Estagiário",
		salario: 2000,
	}

	empresa := Empresa{
		nome: "Google",
		cnpj: "983040548",
	}

    empresa.addEmpregados(e1)
    empresa.addEmpregados(e2)
    empresa.addEmpregados(e3)

    empresa.detalhes()
}

