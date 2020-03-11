nomeVendedor = str(input())
salarioFixo = float(input())
totalVendas = float(input())

total = (salarioFixo+totalVendas*(15/100))

print('TOTAL = R$ {:.2f}'.format(total))