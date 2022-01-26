# Crie um programa que leia quatro valores pelo teclado e guarde-os em uma tupla. No final, mostre:
# a)Quantas vezes apareceu o valor 9.
# b) Em que posição foi digitado o primeiro valor 3.
# c)Quais foram os números PARES.
num = []
cont = par = cont3 = 0
for c in range(0, 4):
    num.append(int(input('Digite um número: ')))
print(f'Os números digitados foram', end=' ')
for c in num:
    print(c, end=' ')
print()
print(f'O número 9 apareceu {num.count(9)} vezes.')
if 3 in num:
    print(f'O número 3 apareceu na posição {num.index(3)+1}ª posição')
else:
    print('O valor 3 não foi digitado.')
print('Os Valores pares foram ', end='')
for c in num:
    if c % 2 == 0:
        print(c, end=' ')
