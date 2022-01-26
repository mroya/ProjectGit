# Crie um programa que leia a idade e o sexo de várias pessoas. A cada pessoa cadastrada, o programa
# deverá perguntar se o usuário quer ou não continuar. No final, mostre:
# a) Quantas pessoas pessoas tem mais de 18 anos.
# b) Quantos homens foram cadastrados.
# c) Quantas mulheres tem menos de 20 anos.
continuar = cont = masc = fem = 0
print('-'*40)
print('{:^40}'.format('CADASTRE UMA PESSOA'))
print('-'*40)
while True:
    idade = int(input('Idade: '))
    sexo = str(input('Sexo:[M/F] ')).strip().upper()[0]
    while sexo != 'M' and sexo != 'F':
        sexo = str(input('Sexo:[M/F] ')).strip().upper()[0]
    if idade >= 18:
        cont += 1
    if sexo == 'M':
        masc += 1
    if sexo == 'F' and idade < 20:
        fem += 1
    continuar = str(input('Quer continuar? [S/N] ')).strip().upper()[0]
    while continuar != 'N' and continuar != 'S':
        continuar = str(input('Quer continuar? [S/N] ')).strip().upper()[0]
    if continuar != 'S':
        break
print('=========Fim do Programa========')
print(f'Temos {cont} pessoa(s) maior(es) de 18 anos.')
print(f'Temos {masc} homem(s) cadastrado(s)')
print(f'Temos {fem} mulher(es) com menos de 20 anos')
