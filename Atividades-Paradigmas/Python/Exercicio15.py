class SaldoInsuficienteException(Exception):
    pass

class ValorNegativoException(Exception):
    pass

def verificaNumeroNegativo(valor):
    if valor < 0:
        raise ValorNegativoException(f"Erro, por favor insira um valor positivo.")
    
def verificaSaldoSaque(saldo, valor):
    verificaNumeroNegativo(valor)
    
    if valor > saldo:
        raise SaldoInsuficienteException(f"Erro, saldo insuficiente para saque de {valor} reais\nSeu Saldo: {saldo} reais")
    

class ContaBancaria:
    def __init__(self, titular, cpf):
        self._titular = titular
        self._cpf = cpf
        self.__saldo = 0.0
    
    def getSaldo(self):
        return self.__saldo
    
    def depositar(self):
        while True:
            try:
                valor = float(input("Insira o valor que queira depositar: "))

                verificaNumeroNegativo(valor)

            except ValueError:
                print("Erro, por favor insira somente valores numéricos.")
            
            except ValorNegativoException as e:
                print(e)
            
            else:
                self.__saldo += valor
                print(f"Valor de {valor} depositado com sucesso.\nSaldo total: {self.__saldo} reais")
                break

    def sacar(self):
        while True:
            try:
                valor = float(input("Insira o valor que queira sacar: "))

                verificaNumeroNegativo(valor)

                verificaSaldoSaque(self.__saldo, valor)

            except ValueError:
                print("Erro, por favor insira somente valores numéricos.")
            
            except ValorNegativoException as e:
                print(e)
            
            except SaldoInsuficienteException as e:
                print(e)
            
            else:
                self.__saldo -= valor
                print(f"Valor de {valor} sacado com sucesso.\nSaldo restante: {self.__saldo} reais")
                break

def criarConta():
    titular = input("Informe o nome do titular da conta: ")
    cpf = input("Informe o CPF do titular: ")

    conta = ContaBancaria(titular, cpf)

    return conta

def main():
    conta = criarConta()

    conta.depositar()

    conta.sacar()


main()