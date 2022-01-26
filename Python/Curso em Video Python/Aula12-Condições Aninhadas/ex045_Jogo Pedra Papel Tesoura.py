# Crie um programa que faça o computador jogar Jokempô com você.
from random import randint
from time import sleep
itens = ('Pedra', 'Papel', 'Tesoura')
computador = randint(0, 2)
print('**'*20)
print('{:^40}'.format(' Jogo Jokempô '))
print('**'*20)
print('''Suas Opções:
[ 1 ] Pedra
[ 2 ] Papel
[ 3 ] Tesoura''')
jogador1 = int(input('Qual a sua escolha? '))
if jogador1 != 0 and jogador1 != 1 and jogador1 != 2:
    print('Jogada Inválida!')
    quit()
print('JO')
sleep(1)
print('KEN')
sleep(1)
print('PÔ')
sleep(1)
print('-='*20)
print('O Computador escolheu {}'.format(itens[computador]))
print('O Jogador escolheu {}'.format(itens[jogador1]))
print('-='*20)
if computador == 0: # Computador Jogou Pedra
    if jogador1 == 0:
        print('Empate!!')
    elif jogador1 == 1:
        print('Jogador Ganhou!!')
    elif jogador1 == 2:
        print('Computador Ganhou!!')
    else:
        print('Jogada Inválida!!')
elif computador == 1: # Computador Jogou Papel
    if jogador1 == 0:
        print('Computador Ganhou!!')
    elif jogador1 == 1:
        print('Empate!!')
    elif jogador1 == 2:
        print('Jogador Ganhou!!')
    else:
        print('Jogada Inválida!!')
elif computador == 2: # Computador Jogou Tesoura
    if jogador1 == 0:
        print('Jogador Ganhou!!')
    elif jogador1 == 1:
        print('Computador Ganhou!!')
    elif jogador1 == 2:
        print('Empate!!')
    else:
        print('Jogada Inválida!!')
