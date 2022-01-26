# Crie uma tupla preenchida com os 20 primeiros colocados da tabela do Campeonato Brasileiro de Futebol,
# na ordem de colocação. Depois mostre:
# a)Apenas os 5 Primeiros colocados.
# b)Os últimos 4 colocados da tabela.
# c) Uma lista com os times em ordem alfabética.
# d) Em que posição na tabela está o time da Chapecoense.
times = ('Inter', 'São Paulo', 'Atlético-MG', 'Flamengo', 'Palmeiras', 'Grêmio', 'Fluminense', 'Santos',
         'Corinthians', 'Bragantino', 'Atlético-PR', 'Ceará SC', 'Atlético-Go', 'SportRecife', 'Bahia',
         'Vasco da Gama', 'Fortaleza', 'Coritiba', 'Goiás', 'Botafogo')
print("-="*20)
print(f'Lista dos Times do Brasileirão: {times}')
print("-="*20)
print(f'Os Cinco primeiros são: {times[0:5]}')
print("-="*20)
print(f'Os últimos 4 colocados são {times[-4:]}')
print("-="*20)
print(f'Times em ordem alfabética: {sorted(times)}')
print("-="*20)
print(f'O Grêmio está na {times.index("Grêmio")}ª colocação')
print("-="*20)

