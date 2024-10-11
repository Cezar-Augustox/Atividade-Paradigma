package main

import "fmt"

type Animal interface {
	Som()
	Detalhes()
}

type Cachorro struct {
	Nome string
}

func (c Cachorro) Som() {
	fmt.Println(c.Nome + " faz AUAU")
}

func (c Cachorro) Detalhes() {
	fmt.Println("Nome: " + c.Nome + ", Espécie: Cachorro")
}

type Gato struct {
	Nome string
}

func (g Gato) Som() {
	fmt.Println(g.Nome + " faz MIAU")
}

func (g Gato) Detalhes() {
	fmt.Println("Nome: " + g.Nome + ", Espécie: Gato")
}

func SomAnimais(animais []Animal) {
	for _, animal := range animais {
		animal.Som()
	}
}

func DetalhesAnimais(animais []Animal) {
	for _, animal := range animais {
		animal.Detalhes()
	}
}

func main() {
	dog := Cachorro{
		Nome: "Luck",
	}

	cat := Gato{
		Nome: "Lucy",
	}

	animais := []Animal{dog,cat}

	SomAnimais(animais)
	DetalhesAnimais(animais)
}