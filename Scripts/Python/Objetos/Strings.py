texto = 'texto simples'
texto = "texto simples"
print(texto)
texto = '''...texto
...com
...quebra
...de
...linhas'''
print(texto)
texto = 'olá mundo'
print(texto) #Sobrescrevendo
print(texto.upper()) 
#print(dir(texto))
texto = "OLÁ MUNDO"
print(texto.lower())
texto = 'olá mundo'
print(texto.capitalize())
#help(texto.capitalize)

texto="Hello " 
print(texto + "World" + "!") #Concatenação
inteiro = 5
#print (texto + inteiro)# O python nao concatena string com inteiros ou outros valores
print ( texto + str(inteiro))#Mudando o valor da variável

#interpolação
# %s: string, %d: inteiro, %o:octal; %x: hexadecimal; %f:real; %e:real exponencial, %%: sinal de porcentagem
texto = "Ola %s"
print(texto %20)
print(type(texto))
