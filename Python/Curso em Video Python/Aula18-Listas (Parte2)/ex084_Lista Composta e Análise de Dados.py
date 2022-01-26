# Crie um programa que leia nome e peso de várias pessoas, guardando tudo em uma lista. No final, mostre:
# A) Quantas pessoas foram cadastradas.
# B) Uma listagem com as pessoas mais pesadas.
# C) Uma listagem com as pessoas mais leves.
dados = list()
cadastro = list()
maior = menor = 0
while True:
    dados.append(str(input('Nome: ')))
    dados.append(float(input('Peso: ')))
    if len(cadastro) == 0:
        maior = menor = dados[1]
    else:
        if dados[1] > maior:
            maior = dados[1]
        if dados[1] < menor:
            menor = dados[1]
    cadastro.append(dados[:])
    dados.clear()
    resp = str(input('Quer continuar?[S/N] ')).strip().upper()[0]
    while resp != 'S' and resp != 'N':
        resp = str(input('Digite apenas [S/N]: ')).strip().upper()[0]
    if resp == 'N':
        break
print('-='*20)
print(f'Ao todo, foram cadastrados {len(cadastro)} pessoas.')
print(f'O maior peso foi de {maior} kg. Peso de ', end='')
for p in cadastro:
    if p[1] == maior:
        print(f'[{p[0]}] ', end='')
print()
print(f'O menor peso foi de {menor} Kg. Peso de ', end='')
for p in cadastro:
    if p[1] == menor:
        print(f'[{p[0]}] ', end='')
print()
