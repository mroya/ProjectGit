# Faça um programa que leia três números e mostre qual é o maior e qual é o menor.
print('Digite três números inteiros qualquer:')
n1 = int(input('Digite o 1º número: '))
n2 = int(input('Digite o 2º número: '))
n3 = int(input('Digite o 3º número: '))
if n1 > n2 and n1 > n3:
    print('O número {} é o maior'.format(n1))
if n2 > n1 and n2 > n3:
    print('O número {} é o maior'.format(n2))
if n3 > n1 and n3 > n2:
    print('O número {} é o maior'.format(n3))
if n1 < n2 and n1 < n3:
    print('O número {} é o menor'.format(n1))
if n2 < n1 and n2 < n3:
    print('O número {} é o menor'.format(n2))
if n3 < n1 and n3 < n2:
    print('O número {} é o menor'.format(n3))
