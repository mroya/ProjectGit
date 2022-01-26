# Crie um programa que leia 5 valores numéricos e guarde-os em uma lista. No final, mostre qual foi
# o maior e o menor valor digitado e as suas respectivas posições na lista.
num = list()
maior = menor = cont = 0
for c in range(0, 5):
    num.append(int(input(f'Digite um valor para a Posição {c}: ')))
    if c == 0:
        maior = menor = num[c]
    else:
        if num[c] > maior:
            maior = num[c]
            cont += 1
        if num[c] < menor:
            menor = num[c]
            cont += 1
print('-='*30)
print(f'Você digitou os valores {num}.')
print(f'O maior valor digitado foi {maior} na posição ', end='')
for i, v in enumerate(num):
    if v == maior:
        print(f'{i}...', end='')
print()
print(f'O menor valor digitado foi {menor} na posição ', end='')
for i, v in enumerate(num):
    if v == menor:
        print(f'{i}...', end='')
print()
