# Crie um programa que leia vários números inteiros pelo teclado.No final da execução,
# mostre a média entre todos os valores e qual foi o maior e o menor valores lidos.
# O programa deve perguntar ao usuário se ele quer ou não continuar a digitar valores.
cont = soma = media = maior = menor = 0
resp = 'S'
while resp in 'Ss':
    n = int(input('Digite um valor: '))
    soma += n
    cont += 1
    media = soma / cont
    resp = str(input('Quer Continuar?[S/N] ')).upper().strip()[0]
    if cont == 1:
        maior = menor = n
    elif n > maior:
        maior = n
    elif n < menor:
        menor = n
print('A soma dos números foi de {} e a media foi {}'.format(soma, media))
print('O maior valor foi {} e o menor valor foi {}'.format(maior, menor))
print('Fim')
