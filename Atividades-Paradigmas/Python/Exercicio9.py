from typing import Protocol

class Imprimiveis(Protocol):
    def imprimir(self):
        pass

class Relatorio:
    def __init__(self, conteudo):
        self._conteudo = conteudo

    def imprimir(self):
        return self._conteudo
    
class Contrato:
    def __init__(self, conteudo):
        self._conteudo = conteudo
    
    def imprimir(self):
        return self._conteudo
    
def imprimir_documento(documento: Imprimiveis):
    print(documento.imprimir())


relatorio = Relatorio("Conteúdo do relatório")
contrato = Contrato("Conteúdo do contrato")

imprimir_documento(relatorio)
imprimir_documento(contrato)