package main

import "fmt"

type Matematica struct {

}

func (Matematica) Fatorial(n int) int{
	resultado := 1
	
	for i := 2; i <= n; i++{
		resultado *= i
	}

	return resultado
}

func main() {
	m := Matematica{}
	fmt.Println(m.Fatorial(5))
}