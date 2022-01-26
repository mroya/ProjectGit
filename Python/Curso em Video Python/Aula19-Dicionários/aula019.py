# Dicionários
dados = dict()
ou
dados = {'nome': 'Pedro', 'idade': 25}
# print(dados['nome']) = Pedro
# print(dados['idade']) = 25
# Para inserir um campo:
dados['sexo'] = 'M'
# Para deletar um elementos:
#del dados['idade']

# Outro exemplo para criar um dicionário:
filme = {'título': 'Star Wars',
         'ano': 1977,
         'diretor': 'George Lucas'
    }

# Para retornar todos os valores do dicionário:
print(filme.values())
# Para retornar somente os títulos do dicionários ou seja as chaves(título, ano, diretor)
print(filme.keys())
# Para retornar todos os valores do dicionário:
print(filme.items())
# Exemplos:

for k, v in filme.items():
    print(f'O {k} é {v}')
# Vai sair impresso:
# O título é Star Wars
# O ano é 1977
# O diretor é George Lucas

# Podemos usar TUPLAS LISTAS E DICIONÁRIO tudo junto!

# Criamos uma lista chamada "locadora" dentro dela tem um dicionário chamado filme

# locadora = [{'título': 'Star Wars', 'ano': '1977', 'diretor': 'George Lucas'}]

# print(locadora[0]['ano']) vai sair 1977

pessoas = {'nome': 'Márcio', 'sexo': 'M', 'idade': 22}
print(f'O {pessoas["nome"]} tem {pessoas["idade"]} anos.')
print(pessoas.keys())
print(pessoas.values())
print(pessoas.items())
for k in pessoas.keys():
    print(k)
# Vai sair na tela isso:
# nome
# sexo
# idade
for k in pessoas.values():
    print(k)
# Vai sair na tela isso:
# Márcio
# M
# 22
for k, v in pessoas.items():
    print(f'{k} = {v}')
# Vai sair na tela isso:
# nome = Márcio
# sexo = M
# idade = 22
# Para adicionar outro item no dicionário:
# apenas digite o nome do dicionário junto com o valor, exemplo:
pessoas['peso'] = 98.5
print(pessoas)
# Criando um Dicionário dentro de uma lista
brasil = list()
estado1 = {'uf': 'Rio de Janeiro', 'sigla': 'RJ'}
estado2 = {'uf': 'São Paulo', 'sigla': 'SP'}
brasil.append(estado1)
brasil.append(estado2)

print(estado1)
# {'uf': 'Rio de Janeiro', 'sigla': 'RJ'}
print(estado1)
# {'uf': 'Rio de Janeiro', 'sigla': 'RJ'}
print(brasil)
# [{'uf': 'Rio de Janeiro', 'sigla': 'RJ'}, {'uf': 'São Paulo', 'sigla': 'SP'}]
print(brasil[0])
# {'uf': 'Rio de Janeiro', 'sigla': 'RJ'}
print(brasil[1])
# {'uf': 'São Paulo', 'sigla': 'SP'}
print(brasil[0]['uf'])
# Rio de Janeiro
print(brasil[1]['sigla'])
# SP'''
estado = dict()
brasil = list()
for c in range(0, 3):
    estado['uf'] = str(input('Unidade Federativa: '))
    estado['sigla'] = str(input('Sigla do Estado: '))
    brasil.append(estado.copy())
# Como podemos copiar um elemento sem fazer fatiamento usando o [:] em um dicionário,
# não podemos temos que usar o método:
# brasil.append(estado.copy())
print(brasil)
# [{'uf': 'Minas', 'sigla': 'MG'}, {'uf': 'Rio de Janeiro', 'sigla': 'RJ'}, {'uf': 'Rio Grande do Sul', 'sigla': 'RS'}]
# for e in brasil:
    # print(e)
# {'uf': 'Minas', 'sigla': 'MG'}
# {'uf': 'Rio de Janeiro', 'sigla': 'RJ'}
# {'uf': 'Rio Grande do Sul', 'sigla': 'RS'}
for e in brasil:
    for k, v in e.items():
        print(f'O campo {k} tem valor {v}.')
# O campo uf tem valor Rio de Janeiro.
# O campo sigla tem valor RJ.
# O campo uf tem valor São Paulo.
# O campo sigla tem valor SP.
# O campo uf tem valor Rio Grande do SUl.
# O campo sigla tem valor RS.
for e in brasil:
    for v in e.values():
        print(v, end=' ')
    print()
# Minas MG
# Rio RJ
# Sp SP


