# Crie um programa que simule o funcionamento de um caixa eletrônico. No início, pergunte ao usuário qual será o
# valor a ser sacado(número inteiro) e o programa vai informar quantas cédulas de cada valor serão entregues.
# OBS.Considere que o caixa possui cédulas de R$50, R$20, R$10 e R$1
cont = 0
print('='*40)
print('{:^40}'.format('Banco REIS'))
print('='*40)
valor = int(input('Que valor você quer sacar? R$ '))
total = valor
ced = 50
totced = 0
totmais = 0
while True:
    if total >= ced:
        total -= ced
        totced += 1
    else:
        print(f'Total de {totced} cédulas de R$ {ced}.')
        if ced == 50:
            ced = 20
        elif ced == 20:
            ced = 10
        elif ced == 10:
            ced = 1
        totced = 0
        if total == 0:
            break
print('Volte sempre ao Banco REIS!\nTenha um ótimo Dia!')
