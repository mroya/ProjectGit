#  Crie um programa que leia nome, sexo e idade de várias pessoas, guardando os dados de cada pessoa em um
#  dicionário e todos os dicionários em uma lista. No final, mostre:
# A) Quantas pessoas foram cadastradas
# B) A média de idade
# C) Uma lista com as mulheres
# D) Uma lista de pessoas com idade acima da média
dados = dict()
lista = list()
cont = soma = maior = 0
while True:
    dados['nome'] = str(input('Nome: '))
    cont += 1
    dados['sexo'] = str(input('Sexo[M/F]:  ')).strip().upper()[0]
    while dados['sexo'] not in 'MF':
        dados['sexo'] = str(input('ERRO! Por favor, apenas M ou F: ')).strip().upper()[0]
    dados['idade'] = int(input('Idade: '))
    soma += dados['idade']
    media = soma / cont
    if media == 1:
        maior = media
    else:
        if dados['idade'] > maior:
            maior = dados['idade']
    lista.append(dados.copy())
    resp = str(input('Quer continuar? [S/N] ')).strip().upper()[0]
    if resp == 'N':
        break
    while resp != 'S' and resp != 'N':
        print('Erro! Responda apenas S ou N')
        resp = str(input('Quer continuar?[S/N] ')).strip().upper()[0]
print('-='*30)
print(f'A)Ao todo temos {cont} pessoas cadastradas')
print(f'B)A média de idade é de {media:.2f} anos.')
print('C)As mulheres cadastradas foram: ', end='')
for e in lista:
    if e['sexo'] == 'F':
        print(f'{e["nome"]}', end='/ ')
print()
print('D)Lista das pessoas que estão acima da média:')
for f in lista:
    if f['idade'] >= media:
        print(f'    Nome = {f["nome"]}, Sexo = {f["sexo"]}, Idade = {f["idade"]}')
print('<<<ENCERRADO>>>')
