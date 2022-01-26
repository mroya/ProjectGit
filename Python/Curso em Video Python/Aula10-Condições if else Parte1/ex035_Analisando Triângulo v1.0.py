# Desenvolva um programa que leia o comprimento de três retas e diga ao usuário se elas
# podem ou não formar um triângulo.
print('-='*20)
print('Verificador de Triângulos')
print('-='*20)
r1 = float(input('1º tamanho de reta: '))
r2 = float(input('2º tamanho de reta: '))
r3 = float(input('3º tamanho de reta: '))
if r1 + r2 > r3 and r2 + r1 > r3 and r3 + r1 > r2:
    print('Com estes tamanhos PODEMOS FORMAR um triângulo')
else:
    print('Com estes tamanhos NÃO PODEMOS FORMAR um triângulo')
