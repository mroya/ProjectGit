# Crie um programa que ajude um jogador da MEGA SENA a criar palpites.O programa vai perguntar quantos jogos
# serão gerados e vai sortear 6 números entre 1 e 60 para cada jogo, cadastrando tudo em uma lista composta.
from random import randint
from time import sleep
sorteio = list()
lista = list()
print('-'*40)
print('*{:^39}*'.format('JOGA NA MEGA SENA'))
print('-'*40)
jogo = int(input('Quantos jogos você quer que eu sorteie? '))
tot = 1
while tot <= jogo:
    cont = 0
    while True:
        num = randint(1, 60)
        if num not in sorteio:
            sorteio.append(num)
            cont += 1
        if cont >= 6:
            break
    sorteio.sort()
    lista.append(sorteio[:])
    sorteio.clear()
    tot += 1
print('=-=-=-={:^18}=-=-=-='.format(f' Sorteando {jogo} Jogos '))
for i, v in enumerate(lista):
    print(f'Jogo {i+1}: {v}')
    sleep(1)
print('=-=-=-={:^18}=-=-=-='.format(f' Boa Sorte!! '))
'''for c in range(0, jogo):
    sorteio.append([randint(1, 60), randint(1, 60), randint(1, 60), randint(1, 60), randint(1, 60), randint(1, 60)])
    sorteio.sort()
print('-=-=-={:^18}-=-=-='.format(f'Sorteando {jogo} Jogos'))
for i, v in enumerate(sorteio):
    print(f'Jogo {i+1}: {v}')
    sleep(1)
print('-=-=-={:^18}-=-=-='.format('BOA SORTE'))'''

