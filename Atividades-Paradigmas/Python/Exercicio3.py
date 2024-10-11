class ContaBancaria:
    
    def __init__(self, titular):
        self.__saldo = 0
        self.titular = titular

    def depositar(self, valor):
        self.__saldo += valor
        print(f"Depósito de R${valor} realizado com sucesso")
        print(f"Saldo atual: R${self.__saldo}")

    def sacar(self, valor):      
        if valor <= self.__saldo:
            self.__saldo -= valor
            print(f"Saque de R${valor} realizado com sucesso")
        else:
            print("Saldo insuficiente para saque.")

        print(f"Saldo atual: R${self.__saldo}")

    def exibir_detalhes(self):
        print(f"Titular: {self.titular}, Saldo: R${self.__saldo}")

conta = ContaBancaria("Renan")
conta.exibir_detalhes()
conta.depositar(500)
conta.exibir_detalhes()
conta.sacar(300)
conta.exibir_detalhes()
conta.sacar(300)
conta.exibir_detalhes()