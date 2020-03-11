def soma(x,y):
    print(x+y)

soma (2,10)
print()

def soma(x,y, z=2):
    print(x+y+z)

soma (2,10)

print()

# * siginifa uma lista ou tupla
# ** significa um dicionário 

def funcaoDinamica(*args, **kwargs):
    print(args)
    print(kwargs)

funcaoDinamica(1, 'a', texto = 'teste')