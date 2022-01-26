# Crie um programa que vai gerar cinco números aleatórios e colocar em uma tupla. Depois disso, mostre
# a listagem de números gerados e também indique o menor e o maior valor que estão na tupla.
from random import randint
num = (randint(0, 10), randint(1, 11), randint(2, 12), randint(3, 13), randint(4, 14))
print(f'Os valores sorteados foram', end=' ')
for c in num:
    print(c, end=' ')
print()
print(f'O menor valor sorteado foi {min(num)}')
print(f'O maior valor sorteado foi {max(num)}')
