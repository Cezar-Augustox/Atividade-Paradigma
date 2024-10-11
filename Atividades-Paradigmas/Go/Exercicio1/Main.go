package main

import "fmt"

type Carro struct {
	Marca, Modelo string
	Ano int
}

func (c Carro) exibir_detalhes(){
	fmt.Printf("Marca: %s, Modelo: %s, Ano: %d\n", c.Marca, c.Modelo, c.Ano)
}

func main(){
	
	carro1 := Carro{
		Marca: "Toyota",
		Modelo: "Corolla",
		Ano: 2020,
	}
	
	carro2 := Carro{
		Marca: "Honda",
		Modelo: "Civic",
		Ano: 2019,
	}
	
	carro3 := Carro{
		Marca: "Ford",
		Modelo: "Mustang",
		Ano: 2021,
	}

	carro1.exibir_detalhes()
	carro2.exibir_detalhes()
	carro3.exibir_detalhes()
}