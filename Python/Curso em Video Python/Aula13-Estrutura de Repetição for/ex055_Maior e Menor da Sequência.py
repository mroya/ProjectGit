# Crie um programa que leia o peso de cinco pessoas. No final,
# mostre qual foi o maior e o menor peso lido.
menor = maior = 0
for c in range(1, 6):
    peso = float(input('Qual é o seu peso da {}ª pessoa? '.format(c)))
    if c == 1:
        maior = peso
        menor = peso
    else:
        if peso > maior:
            maior = peso
        if peso < menor:
            menor = peso
print('O MAIOR peso é de {} kg'.format(maior))
print('O MENOR peso é de {} kg'.format(menor))

