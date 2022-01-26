# Crie um programa que leia vários números inteiros pelo teclado.O programa só vai parar
# quando o usuário digitar o valor 999, que é a condição de parada.No final, mostre quantos
# números foram digitados e qual foi a soma entre eles.(desconsiderando o flag "999")
n = int(input('Digite um número [ 999 para parar]: '))
cont = soma = 0
p = 999
while n != p:
    soma += n
    n = int(input('Digite um número [ 999 para parar]: '))
    cont += 1
print('Você digitou {} números e a soma entre eles foi de {}'.format(cont, soma))
print('Fim')
