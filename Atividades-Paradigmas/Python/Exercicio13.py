class Matematica:
    @staticmethod
    def fatorial(n):
        resultado = 1
        for i in range(2, n+1):
            resultado *= i
        return resultado

print(Matematica.fatorial(5))