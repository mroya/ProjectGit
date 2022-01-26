# Crie um programa que leia um número n Inteiro qualquer e mostre na tela os n primeiros
# elementos de uma Sequência de Fibonacci.Ex: 0 -> 1 -> 1 -> 2 -> 3 -> 5 -> 8
print('-='*20)
print('SEQUÊNCIA DE FIBONACCI')
print('-='*20)
n = int(input('Quantos Termos você quer mostrar? '))
t1 = 0
t2 = 1
cont = 3
print('{} -> {}'.format(t1, t2), end=' ')
while cont <= n:
    t3 = t1 + t2
    print('-> {}'.format(t3), end=' ')
    t1 = t2
    t2 = t3
    cont += 1
print('- Fim')

