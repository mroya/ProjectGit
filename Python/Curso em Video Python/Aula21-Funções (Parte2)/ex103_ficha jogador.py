# Crie um programa que tenha uma função chamada ficha(), que receba dois parâmetros opcionais:
# o nome de um jogador e quantos gols ele marcou. O programa deverá ser capaz de mostrar a ficha do jogador,
# mesmo que algum dado não tenha sido informado corretamente.
'''
# Programa feito por Márcio
def ficha():
    gol = 0
    nome = str(input('Nome do Jogador: '))
    gol = str(input('Número de Gols: ')).strip()
    if nome in 'none':
        return f'O jogador <desconhecido> fez {gol} gols(s) no campeonato.'
    elif gol.isnumeric():
        g = int(gol)
    else:
        gol = 0
        return f'O Jogador {nome} fez {gol} gol(s) no campeonato.'
    return f'O Jogador {nome} fez {gol} gols(s) no campeonato.'

# Programa principal:
print('-'*25)
print(ficha())
'''

# Programa feito pelo professor:


def ficha(jog='<desconhecido>', gol=0):
    print(f'O Jogador {jog} fez {gol} gol(s) no campeonato.')


# Programa Principal
n = str(input('Nome do Jogador: '))
g = str(input('Número de Gols: '))
if g.isnumeric():
    g = int(g)
else:
    g = 0
if n.strip() == '':
    ficha(gol=g)
else:
    ficha(n, g)
