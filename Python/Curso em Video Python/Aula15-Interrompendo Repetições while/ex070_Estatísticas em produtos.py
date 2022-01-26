# Crie um programa que leia o nome e o preço de vários produtos. O programa deverá perguntar se o usuário
# vai continuar.No final mostre:
# a)Qual é o total gasto na compra. b)Quantos produtos custam mais de R$1000.
# c) Qual é o nome do produto mais barato.
cont = cont1 = soma = menor = menor2 = cmen = 0
print('-'*40)
print('*{:^38}*'.format('Lojão OBA OBA'))
print('-'*40)
while True:
    produto = str(input('Nome do Produto: ')).strip().upper()
    preço = float(input('Preço: R$ '))
    cmen += 1
    if preço >= 1000:
        cont += 1
    soma += preço
    if cmen == 1 or preço < menor:
        menor = preço
        menor2 = produto
        cont1 += 1
    resp = str(input('Quer continuar? [S/N] ')).strip().upper()[0]
    while resp != 'S' and resp != 'N':
        resp = str(input('Quer continuar? [S/N] ')).strip().upper()[0]
    if resp == 'N':
        break
print('----------FIM DO PROGRAMA----------')
print(f'O Total da compra foi de R$ {soma:.2f}')
print(f'Temos {cont} produto(s) com preço acima de R$1000.00')
print(f'O produto mais barato foi a {menor2} com preço de R$ {menor}')
