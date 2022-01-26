# Faça um programa que leia algo pelo teclado e mostre na tela o seu tipo
# primitivo e todas as informações possíveis sobre ele.
n = input('Digite algo: ')
print(f'O tipo primitivo de {n} é', type(n))
print(f'{n} só tem espaços?', n.isspace())
print(f'{n} é um número: ', n.isnumeric())
print(f'{n} é um alfabético? ', n.isalpha())
print(f'{n} é um alfanumérico? ', n.isalnum())
print(f'{n} esta em maiúsculo: ', n.isupper())
print(f'{n} esta em minúsculo: ', n.islower())
print(f'{n} esta capitalizada: ', n.istitle())

