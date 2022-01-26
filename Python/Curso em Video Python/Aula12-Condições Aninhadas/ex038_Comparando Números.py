# Escreva um programa que leia dois números inteiros e compare-os, mostrando na tela uma mensagem:
# -O primeiro valor é maior, - O segundo valor é maior, - Não existe valor maior, os dois são iguais.
n1 = int(input('Digite o 1º número: '))
n2 = int(input('Digite o 2º número: '))
if n1 > n2:
    print('O primeiro valor {} é o Maior número digitado!'.format(n1))
elif n2 > n1:
    print('O segundo valor {} é Maior número digitado!'.format(n2))
elif n1 == n2:
    print('Não existe número maior, os dois são iguais!')
print('Fim')
