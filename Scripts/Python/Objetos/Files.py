def escrever():
    arquivo = open('file.txt','w')
    texto = input('digite um texto \n')
    arquivo.write(texto)
    arquivo.close()

def ler ():
    arquivo = open('file.txt', 'r')
    for linha in arquivo:
        print(linha)
    arquivo.close()

print(escrever()) 


print()
print(ler())