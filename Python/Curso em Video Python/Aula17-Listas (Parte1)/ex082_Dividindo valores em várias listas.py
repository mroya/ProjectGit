# Crie um programa que vai ler vários números e colocar em uma lista. Depois disso, crie duas listas extras
# que vão conter apenas os valores pares e os valores ímpares digitados, respectivamente. Ao final,
# mostre o conteúdo das três listas geradas.
lista = list()
par = list()
impar = list()
while True:
    lista.append(int(input('Digite um número: ')))
    resp = str(input('Quer continuar? [S/N] ')).strip().upper()[0]
    while resp != 'S' and resp != 'N':
        resp = str(input('Quer continuar? [S/N] ')).strip().upper()[0]
    if resp == 'N':
        break
for i, v in enumerate(lista):
    if v % 2 == 0:
        par.append(v)
    elif v % 2 == 1:
        impar.append(v)
print('-='*30)
lista.sort()
print(f'Os números digitados foram {lista}.')
par.sort()
print(f'Os números pares Digitados foram {par}.')
impar.sort()
print(f'Os números ímpares digitados foram {impar}.')
