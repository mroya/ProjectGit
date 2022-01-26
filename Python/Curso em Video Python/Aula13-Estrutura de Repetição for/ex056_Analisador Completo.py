# Crie um programa que leia o nome, idade e sexo de 4 pessoas. No final mostre:
# - A media de idade do grupo
# - Qual é o nome do homem mais velho
# - Quantas mulheres tem menos de 20 anos.
soma = 0
media = 0
maior = 0
cont = 0
homemvelho = ''
for c in range(1, 5):
    print('-----Nome da {}ª pessoa-----'.format(c))
    nome = str(input('Qual o seu Nome? ')).strip()
    idade = int(input('Qual a sua Idade? '))
    sexo = str(input('Qual o seu Sexo?[M/F] ')).strip().upper()
    soma += idade
    media = soma / 4
    if c == 1 and sexo in 'Mm':
        maior = idade
        homemvelho = nome
    if sexo in 'Mm' and idade > maior:
        maior = idade
        homemvelho = nome
    elif idade < 20 and sexo in 'Ff':
        cont += 1
print('-='*20)
print('{:^40}'.format('Resultados'))
print('-='*20)
print('A média de idade do grupo é de {:.1f} anos.'.format(media))
print('O Homem mais velho do Grupo se chama {} e tem {} anos'.format(homemvelho, maior))
print('Temos ao todo {} mulher menor de 20 anos no grupo.'.format(cont))
