#any = ou
#all = e
listaVerdadeira = [True, True, True]
listaFalsa = [False, False, False]
listaMista = [True, False, True]
print(any(listaVerdadeira))
print(any(listaFalsa))
print(any(listaMista))
print(all(listaVerdadeira))
print(all(listaFalsa))
print(all(listaMista))

print('--------------------')

for x in range (5):
    print(x)

print('-------------------------')

#A seguir duas maneiras de criar listas e preenche-las
lista=[]
for x in range (10+1):
    lista.append(x)
print(lista)
print('-------------------------')

lista1 = []
lista1 = [x for x in range(5)]
print(lista1)