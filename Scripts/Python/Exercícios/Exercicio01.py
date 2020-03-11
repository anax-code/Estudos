def calculaIMC(peso, altura):
    try:
        imc = peso / (altura*altura)

        if imc < 16:
            print ("Magreza grave")
        elif imc >16 and imc <17: 
            print ('Magreza Moderada')
        elif imc >17 and imc <18.5:
            print("Magreza Leve")
        elif imc >18.5 and imc < 25:
            print('Saudável')
        elif imc >25 and imc <30:
            print ("Sobrepeso")
        elif imc > 30 and imc < 35:
            print ("Obesidade grau I")
        elif imc >35 and imc < 40:
            print ('Obesidade Grau II (severa)')
        else:
            print('Obesidade Grau III (mórbida)')
    except:
        print('Valor Inválido')
#altura=input('Digite a sua altura: ')
#peso = input('Digite o seu peso: ') 

print(calculaIMC(75,1.71))