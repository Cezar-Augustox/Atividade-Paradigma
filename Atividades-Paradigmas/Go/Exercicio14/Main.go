package main

import (
	"fmt"
	"sync"
)

type Configuracao struct {
	linguagem string
}

var instancia *Configuracao
var once sync.Once

func GetInstancia() *Configuracao {
	once.Do(func() {
		instancia = &Configuracao{}
	})
	return instancia
}

func (c *Configuracao) SetLinguagem(linguagem string) {
	c.linguagem = linguagem
}

func (c *Configuracao) GetLinguagem() string {
	return c.linguagem
}

func main() {
	c1 := GetInstancia()
	c1.SetLinguagem("Português Brasileiro")
	fmt.Println(c1.GetLinguagem())

	c2 := GetInstancia()
	c2.SetLinguagem("Francês")
	fmt.Println(c2.GetLinguagem())
}
