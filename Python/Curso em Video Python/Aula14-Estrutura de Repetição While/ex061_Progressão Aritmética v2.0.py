# Refaça o exercício 051, lendo o primeiro termo e a razão de uma PA , mostrando os
# 10 primeiros termos da progressão usando a estrutura while.
# Versão feito com for
"""print('-='*20)
print('{:^40}'.format(' 10 TERMOS DE UMA PA '))
print('-='*20)
primeiro = int(input('Primeiro termo: '))
razao = int(input('Razão da PA: '))
decimo = primeiro + (10-1) * razao
for c in range(primeiro, decimo + razao, razao):
    print('{}'.format(c), end='-> ')
print('Acabou')"""
# Versão feito com While
print('Gerador de PA')
print('-='*10)
primeiro = int(input('Primeiro Termo: '))
razao = int(input('Razão da PA: '))
termo = primeiro
cont = 1
while cont <= 10:
    print('{} -> '.format(termo), end='')
    termo = termo + razao
    cont += 1
print('Fim')
