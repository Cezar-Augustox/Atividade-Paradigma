package main

import (
	"fmt"
)

type Imprimivel interface {
	Imprimir()
}

type Relatorio struct {
	conteudo string
}

func (r Relatorio) Imprimir() {
	fmt.Println("Conteúdo:\n" + r.conteudo + "\n")
}

type Contrato struct {
	conteudo string
}

func (c Contrato) Imprimir() {
	fmt.Println("Conteúdo:\n" + c.conteudo + "\n")
}

func ImprimirDocumento(doc Imprimivel){
	doc.Imprimir()
}

func main(){
	relatorio := Relatorio{
		conteudo: "Conteúdo do relatório",
	}

	contrato := Contrato{
		conteudo: "Conteúdo do contrato",
	}

	ImprimirDocumento(relatorio)
	ImprimirDocumento(contrato)
}