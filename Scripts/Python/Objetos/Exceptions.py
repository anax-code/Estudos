from random import randint


x=randint(0,9)
y=randint(0,5)

try:
    print(x/y)
except ZeroDivisionError:
    print("Ocorreu um erro! Não se pode dividir por 0")
except:
    print("Ocorreu um outro erro")
finally:
    print("Fim da execução!")

#Podemos colocar vários exceptions destacando os erros pontuais.