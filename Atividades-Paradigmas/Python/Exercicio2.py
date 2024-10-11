class Carro:
    def __init__(self, marca, modelo, ano):
        self.marca = marca
        self.modelo = modelo
        self.ano = ano
        self.velocidade = 0

    def exibir_detalhes(self):
        print(f"Marca: {self.marca}, Modelo: {self.modelo}, Ano: {self.ano}")

    def acelerar(self, aumento_velocidade):
        self.velocidade += aumento_velocidade

    def freiar(self, reducao_velocidade):
        self.velocidade -= reducao_velocidade
    
    def exibir_velocidade(self):
        print(f"A velocidade atual do {self.modelo} é de {self.velocidade}km/h")


carro = Carro("Toyota", "Corolla", 2020)

carro.exibir_detalhes()
carro.acelerar(30)
carro.freiar(10)
carro.exibir_velocidade()
