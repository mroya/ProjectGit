# Crie um programa que gerencie o aproveitamento de um jogador de futebol. O programa vai ler o nome do
# jogador e quantas partidas ele jogou. Depois vai ler a quantidade de gols feitos em cada partida.
# No final, tudo isso será guardado em um dicionário, incluindo o total de gols feitos durante o campeonato.
jogador = dict()
gol = list()
jogador['nome'] = str(input('Nome do Jogador: '))
partidas = int(input(f'Quantas partidas o {jogador["nome"]} jogou? '))
for c in range(0, partidas):
    gol.append(int(input(f'Quantos gols na partida {c+1}: ')))
jogador['gols'] = gol
jogador['total'] = sum(gol)
print('-='*30)
print(jogador)
print('-='*30)
for k, v in jogador.items():
    print(f'O campo {k} tem o valor {v}')
print('-='*30)
print(f'O jogador {jogador["nome"]} jogou {partidas} partidas.')
for c, v in enumerate(gol):
    print(f'    => Na partida {c+1}, fez {v} gols.')
print(f'Fez um total de {sum(gol)} gols.')
