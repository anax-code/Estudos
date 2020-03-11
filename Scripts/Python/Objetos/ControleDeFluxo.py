#Operadores Lógicos em Python: and (e) or (ou)
idade = 19
if idade < 20:
    print("Você é jovem")

print()

idade = 17
if (idade >=18):
    print("Você é maior de idade")
else:
    print("Você é menor de idade")
print()
idade = 61
if (idade < 18):
    print("Criança")
elif (idade >= 18 and idade <= 59):
    print("Adulto")
else:
    print ("Idoso")
