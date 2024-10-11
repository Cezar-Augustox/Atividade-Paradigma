package main

import "fmt"

type Animal interface {
	EmitirSom()
	Detalhes()
}

type Cachorro struct {
	Nome string
}

func (c Cachorro) EmitirSom() {
	fmt.Println(c.Nome + " faz AU AU")
}

func (c Cachorro) Detalhes() {
	fmt.Println("Nome: " + c.Nome + ", Espécie: Cachorro")
}

type Gato struct {
	Nome string
}

func (g Gato) EmitirSom() {
	fmt.Println(g.Nome + " faz MIAU")
}

func (g Gato) Detalhes() {
	fmt.Println("Nome: " + g.Nome + ", Espécie: Gato")
}

func main(){
	dog := Cachorro{
		Nome: "Luck",
	}

	cat := Gato{
		Nome: "Lucy",
	}

	dog.Detalhes()
	cat.Detalhes()
	dog.EmitirSom()
	cat.EmitirSom()
}