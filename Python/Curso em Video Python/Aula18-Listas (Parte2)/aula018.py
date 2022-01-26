# Listas - parte 2
'''
# Aula passada listas parte 1
dados = list()
dados.append('Pedro')
dados.append(25)
print(dados[0])# imprime o nome "Pedro"
print(dados[1])# imprime o valor "25"

# Aula Lista parte 2:
# Listas compostas: uma lista dentro da outra.
pessoas = list()
pessoas.append(dados[:]) # ou seja, vai criar uma nova lista com a lista anterior'''

'''teste = list()
teste.append('Gustavo')
teste.append(40)
galera = list()
galera.append(teste[:]) # Nunca esquecer de colocar os dois pontos.
teste[0] = 'Maria'
teste[1] = 22
galera.append(teste[:])
print(galera)'''

'''galera = [['João', 19], ['Ana', 33], ['Joaquim', 13], ['Maria', 45]]
#print(galera[2][1])
#print(galera[0][0])
for p in galera:
    print(f'{p[0]} tem {p[1]} anos de idade.')
    #print(p[1])
    #print(p[0])'''
galera = list()
dado = list()
totmai = totmen = 0
for c in range(0, 3):
    dado.append(str(input('Nome: ')))
    dado.append(int(input('Idade: ')))
    galera.append(dado[:])# os dois pontos é criar a copia de dados em galera
    dado.clear() #Após inserir a lista dado em galera, temos que excluir ele usando o comando "CLEAR".

for p in galera:
    if p[1] >= 21:
        print(f'{p[0]} é maior de idade.')
        totmai += 1
    else:
        print(f'{p[0]} é menor de idade.')
        totmen += 1
