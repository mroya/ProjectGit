# Crie um programa que leia o nome de uma pessoa e diga se ela tem o nome "silva".
nome = str(input('Qual o seu nome completo? ')).strip()
print('O nome possui "silva"? {}'.format('SILVA' in nome.upper()))

