# Faça um programa que mostre a tabuada de vários números, um de cada vez, para cada valor digitado pelo usuário.
# O programa será interrompido quando o número solicitado for negativo.
cont = 0
while True:
    tab = int(input('Você quer ver a tabuada de qual valor? '))
    if tab < 0:
        break
    while cont <= 9:
        cont += 1
        calc = tab * cont
        print(f'{tab} x {cont} = {calc}')
    if cont == 10:
        cont = 0
print('Programa Encerrado!')
