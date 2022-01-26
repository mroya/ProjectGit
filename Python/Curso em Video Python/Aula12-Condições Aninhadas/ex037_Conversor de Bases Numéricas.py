# Escreva um programa que leia um número inteiro qualquer e peça para o usuário escolher qual será a base de
# conversão:
# - 1 para Binário - 2 para octal - 3 para Hexadecimal.
n = int(input('Digite um número: '))
escolha = int(input('Escolha o tipo de conversão: \n1 para Binário\n2 para Octal\n3 para Hexadecimal\n Sua Escolha: '))
if escolha == 1:
    print('A conversão do número {} para binário é {}'.format(n, bin(n)))
elif escolha == 2:
    print('A conversão do número {} para Octal é {}'.format(n, oct(n)))
elif escolha == 3:
    print('A conversão do número {} para Hexadecimal é {}'.format(n, hex(n)))
print('Fim')

