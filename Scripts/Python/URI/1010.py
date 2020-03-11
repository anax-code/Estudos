linha1 = input().split()
p1 = int(linha1[0])
n1 = int(linha1[1])
v1 = float(linha1[2])

linha2 = input().split()
p2 = int(linha2[0])
n2 = int(linha2[1])
v2 = float(linha2[2])

valor = (n1*v1)+(n2*v2)

print('VALOR A PAGAR: R$ {:.2f}'.format(valor))

#A função split() faz com que cada objeto digitado dentro da string seja separado pelo espaço
#ficando objetos indepedentes
#Em seguida foi colocado os valores das matrizes, de acordo com a posição que o objeto digitado se encontraria
#dentro da String