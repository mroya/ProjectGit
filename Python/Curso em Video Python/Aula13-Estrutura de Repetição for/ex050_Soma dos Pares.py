# Crie um programa que leia seis números inteiros e mostre a soma apenas daqueles que forem pares.
# Se o valor digitado for ímpar, desconsidere-o.
soma = 0
cont = 0
print('Digite 6 Números:')
for c in range(1, 6):
    n = int(input('Digite o {}º número: '.format(c)))
    if n % 2 == 0:
        cont = cont + 1
        soma = soma + n
print('Os números pares foram {}'.format(cont))
print('A soma dos números PARES digitados foi {}'.format(soma))
