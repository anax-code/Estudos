inteiro = 5
decimal = 1.5 
c = 4+4j
print (inteiro)
print (type(inteiro))
print (type (decimal))
print (type(c))

#Conversões
inteiroConvertido = float(inteiro)
print (type(inteiroConvertido))
print(type(int(decimal))) #Posso aqui converter o valor direto no type

#Operações
print(inteiro+decimal)
print(inteiro-decimal)
print(inteiro*decimal)
print(inteiro/decimal)
print(inteiro//decimal) #Divisão mais exata
print(inteiro%decimal)

print(inteiro>decimal)
print(inteiro<decimal)
print(inteiro==decimal)
print(inteiro!=decimal)

import math
print(dir(math))
print(math.sqrt(16))
print(math.pi)
print(math.cos(45))