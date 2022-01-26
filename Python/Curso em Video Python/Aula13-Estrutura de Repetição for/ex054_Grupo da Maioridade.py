# Crie um programa que leia o ano de nascimento de 7 pessoas. No final, mostre
# quantas pessoas ainda não atingiram a maioridade e quantas já são maiores.
import datetime
menor = 0
maior = 0
for c in range(1, 8):
    atual = datetime.date.today().year
    ano = int(input('Qual o ano de nascimento da {}º pessoa? '.format(c)))
    soma = atual - ano
    if soma < 21:
        menor += 1
    else:
        maior += 1
print('Dentre estes 7 nascimentos temos:')
print('{} pessoa(s) Menor de Idade'.format(menor))
print('{} pessoa(s) Maior de Idade.'.format(maior))

