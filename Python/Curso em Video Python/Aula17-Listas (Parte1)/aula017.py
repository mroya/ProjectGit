# LISTAS - PARTE 1
# LISTAS SÃO MUTÁVEIS
# LISTAS UTILIZA-SE COLCHETES [ ]
# COMANDO append adiciona no final da lista

"""num = [2, 5, 9, 1]
num[2] = 3
num.append(7)
#num.sort()
num.sort(reverse=True)
num.insert(2, 0)
if 5 in num:
    num.remove(5)
    print('o número 5 foi removido')
else:
    print('Não achei o número 5')
# remoção de elementos:
# remove o último elemento:
# num.pop()
# Remove o elemento na posição 2 por exemplo:
num.pop(2)
# Usando o remove para por exemplo remover o 2 elemento
num.remove(2)
print(num)
print(f'Esta lista tem {len(num)} elementos.')"""
"""valores = list()
for cont in range(0, 5):
    valores.append(int(input('Digite um valor: ')))
valores.append(5)
valores.append(9)
valores.append(4)
for v in valores:
    print(f'{v}...', end='')
print()
for c, v in enumerate(valores):
    print(f'Na posição {c} encontrei o valor {v}.')
print('Cheguei ao final da lista.')"""
a = [2, 3, 4, 7]
b = a
#b[2] = 8 # Se incluir na lista b na posição 2 o valor 3 ele também vai aparecer na Lista A, as duas listas são iguais.
# Se quiser incluir somente na lista b na posição 2 o valor 3 , faz o seguinte:
b = a[:] #aqui pega todos os valores de A para dentro de b
b[2] = 8
print(f'Lista A: {a}')
print(f'Lista B: {b}')
