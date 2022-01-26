# Desenvolva uma lógica que leia o peso e a altura de uma pessoa, calcule seu IMC e mostre seu status de acordo
# com a tabela abaixo:
# - Abaixo de 18.5: abaixo do peso
# - Entre 18.5 e 25: Peso ideal
# - 25 até 30: Sobrepeso
# - 30 até 40: Obesidade
# - Acima de 40: Obesidade mórbida
print('-='*20)
print('CÁLCULO DO IMC')
print('-='*20)
peso = float(input('Qual o Peso do paciente (kg): '))
altura = float(input('Qual a Altura do Paciente(mt): '))
imc = peso / (altura ** 2)
print('O imc do paciente é {:.1f}'.format(imc))
if imc < 18.5:
    print('O paciente está ABAIXO DO PESO!')
elif 18.5 <= imc < 25:
    print('O paciente está com PESO IDEAL!')
elif 25 <= imc < 30:
    print('O paciente está com SOBREPESO!')
elif 30 <= imc < 40:
    print('O paciente está com status de OBESIDADE!')
elif imc >= 40:
    print('O paciente está com status de OBESIDADE MÓRBIDA, Cuidado!!')
