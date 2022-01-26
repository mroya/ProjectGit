# Escreva um programa que faça o computador "pensar" em um número inteiro entre 0 e 5
# e peça para o usuário tentar descobrir qual foi o número escolhido pelo computador.
# O programa deverá escrever na tela se o usuário venceu ou perdeu.
from random import randint
print('\033[0;0;31m-*-\033[m'*20)
print('\033[0;0;33mVou pensar em um número entre 0 e 5. Tente advinhar ...\033[m')
print('\033[0;0;31m-*-\033[m'*20)
n = randint(0, 5)
num = int(input('\033[0;0;33mEm que número pensei? \033[m'))
if n == num:
    print('Muito bem, você acertou!')
else:
    print('Você errou, tente novamente!')
print('O número que escolhi foi {}'.format(n))