class Configuracao:
    _instancia = None

    def __new__(cls, *args, **kwargs):
        if cls._instancia is None:
            cls._instancia = super(Configuracao, cls).__new__(cls, *args, **kwargs)
            cls._instancia.linguagem = ""
        return cls._instancia
    
    def setLinguagem(self, linguagem):
        self.linguagem = linguagem
    
    def getLinguagem(self):
        return self.linguagem

c1 = Configuracao()
c1.setLinguagem("Português Brasileiro")
print(c1.getLinguagem())
c2 = Configuracao()
print(c2.getLinguagem())       