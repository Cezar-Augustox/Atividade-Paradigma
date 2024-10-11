package main

import "fmt"

type ContaBancaria struct {
	titular string
	saldo float64
}

func (c ContaBancaria) Exibir_detalhes() {
	fmt.Printf("Titular: %s, Saldo: %.2f\n", c.titular, c.saldo)
}

func (c *ContaBancaria) Depositar(valor float64) {
	c.saldo += valor
	fmt.Printf("Depósito de R$%.2f realizado com sucesso\n", valor)
	fmt.Printf("Saldo atual: R$%.2f\n", c.saldo)
}

func (c *ContaBancaria) Sacar(valor float64) {
	if valor <= c.saldo {
		c.saldo -= valor
		fmt.Printf("Saque de R$%.2f realizado com sucesso\n", valor)
	}else {
		fmt.Printf("Saque de R$%.2f não foi realizado, pois o saldo é insuficiente\n", valor)
	}
	fmt.Printf("Saldo atual: R$%.2f\n", c.saldo)
}

func main() {
	conta := ContaBancaria{
		titular: "Renan",
	}
	conta.Exibir_detalhes()
	conta.Depositar(500)
	conta.Sacar(300)
	conta.Sacar(300)
	conta.Sacar(200)
	conta.Exibir_detalhes()
}