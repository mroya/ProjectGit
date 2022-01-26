# Crie um programa que vai ler vários números e colocar em uma lista. Depois disso, mostre:
# A) Quantos números foram digitados.
# B) A lista de valores, ordenada de forma decrescente.
# C) Se o valor 5 foi digitado e está ou não na lista.
lista = list()
while True:
    lista.append(int(input('Digite um valor: ')))
    continuar = str(input('Quer continuar?[S/N] ')).strip().upper()[0]
    while continuar != 'N' and continuar != 'S':
        continuar = str(input('Quer continuar? [S/N] ')).strip().upper()[0]
    if continuar == 'N':
        break
print('-='*30)
print(f'Você digitou {len(lista)} elementos.')
lista.sort(reverse=True)
print(f'Os valores digitados em ordem decrescente foram {lista}')
if 5 in lista:
    print('O número 5 aparece na lista.')
else:
    print('O número 5 não esta na lista.')
