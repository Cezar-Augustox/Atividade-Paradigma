package main

import "fmt"

type Motor struct {
	Tipo string
	Cilindradas int
}

func (m Motor) DetalhesMotor() {
	fmt.Printf("%s de %d cilindradas\n", m.Tipo, m.Cilindradas)
}

type Carro struct {
	Motor Motor
	Marca, Modelo string
	Ano int
}

func (c Carro) DetalhesCarro() { 
	fmt.Printf("Marca: %s, Modelo: %s, Ano: %d, Motor: ", c.Marca, c.Modelo, c.Ano)
	c.Motor.DetalhesMotor()
}

func main() {
	
	carro := Carro{
		Marca: "Toyota",
		Modelo: "Corolla",
		Ano: 2020,
		Motor: Motor{
			Tipo: "Híbrido",
			Cilindradas: 2000,
		},
	}

	carro.DetalhesCarro()
}
