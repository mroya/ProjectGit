# Crie um programa que jogue PAR ou ÍMPAR com o computador. O jogo só será interrompido quando o jogador PERDER,
# mostrando o total de vitórias consecutivas que ele conquistou no final do jogo.
from random import randint
print('-='*20)
print('Jogo do PAR ou ÍMPAR')
print('-='*20)
soma = venceu = 0
while True:
    num = int(input('Escolha um valor? '))
    jogador = str(input('Par ou Ímpar? [P/I] ')).strip().upper()[0]
    print('-' * 40)
    computador = randint(0, 10)
    soma = num + computador
    print(f'Você jogou {num} e o computador {computador}.', end='')
    if soma % 2 == 0:
        print(f' Total de {soma} DEU PAR!')
        if jogador == 'P':
            venceu += 1
            print('Você ganhou!')
            print('Vamos jogar novamente...')
        else:
            break
        print('-='*20)
    if soma % 2 == 1:
        print(f' Total de {soma} DEU ÍMPAR!')
        if jogador == 'I':
            venceu += 1
            print('Você Ganhou!')
            print('Vamos jogar novamente...')
        else:
            break
        print('-='*20)
print(f'Game Over. Você venceu {venceu} vezes')
