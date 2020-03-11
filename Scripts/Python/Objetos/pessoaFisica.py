#Herança
from pessoa import Pessoa 
class PessoaFisica(Pessoa):
    #Construtor
    def __init__(self, nome, idade, cpf):
        Pessoa.__init__(self, nome, idade) 
        self.cpf = cpf

    #Metodos de acesso
    def getCpf(self):
        return self.cpf
    def setCpf(self, cpf):
        self.cpf = cpf

#Exemplo de herança múltipla
#class PessoaFisica(Pessoa, Carro):
    #def __init__(self, nome, idade, cpf, tipo, marca, ano):
    #    Pessoa.__init__(self, nome, idade) 
    #    Carro.__init__(self, tipo, marca, ano)
    #    self.cpf = cpf
         