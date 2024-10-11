package main

import (
	"fmt"
	"errors"
)

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

func (c *ContaBancaria) Sacar(valor float64) error{
	if valor > c.saldo {
		return errors.New("Saque não foi realizado, pois o saldo é insuficiente\n")
	}
	c.saldo -= valor
	fmt.Printf("Saque de R$%.2f realizado com sucesso\n", valor)
	fmt.Printf("Saldo atual: R$%.2f\n", c.saldo)
	return nil
}

func main() {
	conta := ContaBancaria{
		titular: "Renan",
	}

	conta.Exibir_detalhes()
	conta.Depositar(500)
	erro := conta.Sacar(300)
	if erro != nil {
		fmt.Print(erro)
	}
	
	erro = conta.Sacar(300)
	if erro != nil {
		fmt.Print(erro)
	}

	conta.Exibir_detalhes()
}