# Crie um programa que leia um número qualquer e mostre o seu fatorial.
# Ex: 5! = 5x4x3x2x1=120
# Fazendo com o 'FOR'
from math import factorial
num = int(input('Digite um número para calcular seu fatorial: '))
fat = factorial(num)
print('Calculando o !{}: '.format(num), end='')
for c in range(num, 0, -1):
    print(f'{c}', end='')
    print(' x ' if c > 1 else ' = ', end='')
print(f'{fat}', end='')

'''# Fazendo com o 'WHILE'
n = int(input('Digite um número para calcular seu fatorial: '))
c = n
f = 1 # porque colocar 1? Porque o fator nulo na multiplicação é 1, por exemplo o da soma/subtração é 0
print('Calculando {}! = '.format(n), end='')
while c > 0:
    print(f'{c}', end='')
    print(' x ' if c > 1 else ' = ', end='')
    f *= c
    c -= 1
print(f'{f}')'''


