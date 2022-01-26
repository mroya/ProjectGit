# Crie um programa que leia um número inteiro e diga se ele é ou não um número PRIMO.
numero = int(input('Digite um número: '))
cont = 0
for c in range(1, numero + 1):
    if numero % c == 0:
        cont = cont + 1
        print('\033[34m', end='')
    else:
        print('\033[33m', end='')
    print('{}\033[m'.format(c), end='')
print()
print('O número {} foi divisível {} vezes'.format(numero, cont))
if cont == 2:
    print('Portanto o número {} é PRIMO'.format(numero))
else:
    print('O número {} não é PRIMO'.format(numero))
