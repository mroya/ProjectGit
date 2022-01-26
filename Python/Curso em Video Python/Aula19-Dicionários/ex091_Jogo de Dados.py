# Crie um programa onde 4 jogadores joguem um dado e tenham resultados aleatórios.
# Guarde esses resultados em um dicionário. No final, coloque esse dicionário em ordem,
# sabendo que o vencedor tirou o maior número no dado.
from random import randint
from time import sleep
from operator import itemgetter
sorteio = {'Jogador1': randint(1, 6),
           'Jogador2': randint(1, 6),
           'Jogador3': randint(1, 6),
           'Jogador4': randint(1, 6)}
ranking = list()
print('Valores Sorteados:')
print('-='*15)
for k, v in sorteio.items():
    print(f'{k} tirou {v} nos dados.')
    sleep(1)
print('-='*15)
print('   == Ranking dos Jogadores ==')
ranking = sorted(sorteio.items(), key=itemgetter(1), reverse=True)
for i, v in enumerate(ranking):
    print(f'    {i+1}º lugar: {v[0]} com {v[1]}')
