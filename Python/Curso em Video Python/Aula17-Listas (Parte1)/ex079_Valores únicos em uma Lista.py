# Crie um programa onde o usuário possa digitar vários valores numéricos e cadastre-os em uma lista.
# Caso o número já exista lá dentro, ele não será adicionado. No final, serão exibidos todos os valores únicos
# digitados, em ordem crescente
lista = list()
while True:
    num = int(input('Digite um valor: '))
    if num in lista:
        print('Valor Duplicado! Não vou adicionar...')
        lista.remove(num)
    lista.append(num)
    continuar = str(input('Quer continuar?[S/N] ')).strip().upper()[0]
    if continuar == 'N':
        break
print(f'Os números digitados foram {sorted(lista)}')
