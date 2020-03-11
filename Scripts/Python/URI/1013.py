linha=input().split()
a = int (linha[0])
b = int (linha[1])
c = int (linha[2])

MaiorAB = (a+b+abs(a-b))/2
Maior = (int)((c+MaiorAB+abs(MaiorAB-c))/2)

print('{} eh o maior'.format(Maior))