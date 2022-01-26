# Melhore o ex028 onde o computador vai "Pensar" em um número entre 0 e 10.Só que agora
# o jogador vai tentar adivinhar até acertar, mostrando no final quantos palpites foram necessários
# para vencer.
# Minha Versão
"""from random import randint
print('\033[0;0;31m-*-\033[m'*20)
print('\033[0;0;33mVou pensar em um número entre 0 e 10. Tente advinhar ...\033[m')
print('\033[0;0;31m-*-\033[m'*20)
cont = 0
n = randint(1, 10)
num = int(input('\033[0;0;33mEm que número pensei? \033[m'))
while num != n:
    if n > num:
        print('Mais...Tente novamente!')
    elif n < num:
        print('Menos...Tente novamente!')
    num = int(input('Errou, Em que número pensei? '))
    if num != n:
        cont += 1
    elif n == num:
        print('Muito Bem, Você acertou o número!')
print('O número que escolhi foi {} e você tentou {} vezes até acertar.'.format(n, cont))"""
# **** Versão Prof Guanabara:*****
from random import randint
computador = randint(0, 10)
print('Sou seu computador...Acabei de pensar em um número entre 0 e 10.')
print('Será que você consegue adivinhar qual foi? ')
acertou = False
palpites = 0
while not acertou:
    jogador = int(input('Qual é o seu palpite? '))
    palpites += 1
    if jogador == computador:
        acertou = True
    else:
        if jogador < computador:
            print('Mais...Tente mais uma vez.')
        elif jogador > computador:
            print('Menos...Tente mais uma vez.')
print('Acertou com {} tentativas. Parabéns!'.format(palpites))

