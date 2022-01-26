# Crie um programa que leia o nome completo de uma pessoa e mostre:
# o nome com todas as letras maiúsculas, com todas as letras minúsculas,
# quantas letras tem ao todo sem considerar espaços e quantas letras tem o primeiro nome.
nome = str(input('Digite seu nome completo: ')).strip()
print('Seu nome em maiúsculas fica {}'.format(nome.upper()))
print('Seu nome em minúsculas fica {}'.format(nome.lower()))
print('Seu nome tem ao todo {} Letras'.format(len(nome) - nome.count(' ')))
separa = nome.split()
print('Seu primeiro nome é {} e ele tem {} letras.'.format(separa[0], len(separa[0])))

