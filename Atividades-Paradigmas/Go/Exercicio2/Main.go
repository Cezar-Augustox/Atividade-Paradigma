package main

import "fmt"

type Carro struct {
	Marca, Modelo string
	Ano, Velocidade int
	
}

func (c Carro) exibir_detalhes(){
	fmt.Printf("Modelo: %s, Marca: %s, Ano: %d\n", c.Marca, c.Modelo, c.Ano)
}

func (c *Carro) acelerar(aumento_velocidade int) {
	c.Velocidade += aumento_velocidade
}

func (c *Carro) freiar(reducao_velocidade int) {
	c.Velocidade -= reducao_velocidade
}

func (c Carro) exibir_velocidade() {
	fmt.Printf("A velocidade atual do %s é de %dkm/h\n", c.Modelo, c.Velocidade)
}


func main() {
	carro := Carro{
		Marca: "Toyota",
		Modelo: "Corolla",
		Ano: 2020,
	}

	carro.exibir_detalhes()
	carro.acelerar(30)
	carro.freiar(10)
	carro.exibir_velocidade()
}