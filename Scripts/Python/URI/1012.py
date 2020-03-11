import math
linha = input().split()
A = float(linha[0])
B = float(linha[1])
C = float(linha[2])

areaTriangulo = (A*C)/2
areaCirculo = 3.14159*math.pow(C,2)
areaTrapezio = (((A+B))*C)/2
areaQuadrado = math.pow(B,2)
areaRetangulo = A*B

print('TRIANGULO: {:.3f}'.format(areaTriangulo))
print('CIRCULO: {:.3f}'.format(areaCirculo))
print('TRAPEZIO: {:.3f}'.format(areaTrapezio))
print('QUADRADO: {:.3f}'.format(areaQuadrado))
print('RETANGULO: {:.3f}'.format(areaRetangulo))