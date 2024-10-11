class Funcionario:   
    def __init__(self, nome, cargo):
        self.nome = nome
        self.cargo = cargo
    
    def calcularSalario():
        pass

class FuncionarioHorista(Funcionario):
    def __init__(self, nome, cargo, valorHora):
        super().__init__(nome, cargo)
        self.valorHora = valorHora

    def calcularSalario(self, horasTrabalhadas):
        return self.valorHora * horasTrabalhadas
    
class FuncionarioAssalariado(Funcionario):
    def __init__(self, nome, cargo, salario, valorHoraExtra):
        super().__init__(nome, cargo)
        self.salario = salario
        self.valorHoraExtra = valorHoraExtra

    def calcularSalario(self, horaExtra):
        return self.salario + horaExtra * self.valorHoraExtra
    

fAssalariado = FuncionarioAssalariado("Rodolfo", "caixa", 1300, 10)
fHorista = FuncionarioHorista("João", "Entregador", 8)

print(fAssalariado.calcularSalario(10))
print(fHorista.calcularSalario(160))