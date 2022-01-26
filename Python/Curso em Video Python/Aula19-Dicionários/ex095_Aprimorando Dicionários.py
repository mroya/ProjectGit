# Aprimore o desafio 93 para que ele funcione com vários jogadores, incluindo um sistema de
# visualização de detalhes do aproveitamento de cada jogador.
jogador = dict()
partidas = list()
time = list()
soma = 0
while True:
    jogador.clear()
    jogador['nome'] = str(input('Nome do Jogador: '))
    tot = int(input(f'Quantas partidas o {jogador["nome"]} jogou? '))
    partidas.clear()
    for c in range(0, tot):
        partidas.append(int(input(f'Quantos gols na partida {c+1}: ')))
    jogador['gol'] = partidas[:]
    jogador['total'] = sum(partidas)
    time.append(jogador.copy())
    resp = str(input('Quer continuar?[S/N] ')).strip().upper()[0]
    while resp != 'S' and resp != 'N':
        resp = str(input('Responda somente [S/N] ')).strip().upper()[0]
    if resp == 'N':
        break
print('-='*30)
print('cod ', end='')
for i in jogador.keys():
    print(f'{i:<15}', end='')
print()
print('-'*40)
for k, v in enumerate(time):
    print(f'{k:>3} ', end='')
    for d in v.values():
        print(f'{str(d):<15}', end='')
    print()
print('-'*40)
while True:
    busca = int(input('Quer mostrar dados de qual jogador? (999 para sair) '))
    print('-'*40)
    if busca == 999:
        break
    if busca >= len(time):
        print(f'ERRO! Não existe jogador com código {busca}!')
    else:
        print(f' -- LEVANTAMENTO DO JOGADOR {time[busca]["nome"]} -- ')
        for i, g in enumerate(time[busca]["gol"]):
            print(f'    => No jogo {i+1}, fez {g} gols')
    print('-'*40)
print('<< Volte Sempre >>')
