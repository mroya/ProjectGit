# TUPLAS - São imutáveis, ou seja, não mudam!
lanche = ('Hambúrguer', 'Suco', 'Pizza', 'Pudim')
print(lanche[0])# imprimir o elemento '0' na tela
print(lanche[0:2])# imprimir do elemento '0' Hamburguer até o elemento '1' Suco
print(lanche[1:])# imprimir do elemento '1'Suco até o final
print(lanche[-1])# imprimir o último elemento da tupla lanche que no caso é o '3'Pudim
print(lanche[-2])# imprimir o penúltimo elemento da tupla lanche que no caso é o '2'Pizza
print(lanche[:2])# imprimir do primeiro elemento '0' Hambúrguer da tupla lanche até o elemento '2' que no Python seria o '1' Suco
print(lanche[-2:])# começa na pizza e vai até o final
for c in lanche:
    print(c, end=' ')
# Para imprimir na tela sem as aspas da tupla "lanche" podemos fazer deste jeito:
print()
print('-='*20)
for comida in lanche:
    print(f'Eu vou comer {comida}')
print('Comi pra caramba!')
print('-='*20)
# Para imprimir uma tupla com contador usando o len
for cont in range(0, len(lanche)):
    print(cont, end=' ')
    print(lanche[cont])
#ou imprimir somente o lanche sem contar os elemento:
print('-='*20)
for cont in range(0, len(lanche)):
    print(lanche[cont])
print('-='*20)
# para mostrar a posição do elemento junto do elemento podemos usar o range ou o enumerate:
for cont in range(0, len(lanche)):
    print(f'Eu vou comer {lanche[cont]} na posição {cont}.')
print('-='*20)
for pos, comida in enumerate(lanche):
    print(f'Eu vou comer {comida} na posição {pos}.')
print('-='*20)
# podemos também organizar minha tupla colocando em ordem:
print(lanche)
print(sorted(lanche))# sorted coloca em ordem alfabetica
print('-='*20)
a = (2, 5, 4)
b = (5, 8, 1, 2)
c = a + b
print(a)
print(b)
print(c)
print(len(c))
print(c.count(5))# perguntamos quantas vezes aparece o número 5 dentro de "c"
print(c)
print(c.index(8))# esta função "index" mostra em qual posição se encontra o elemento que está dentro das aspas
print(c.index(2, 4))# Se procurar um número a partir por exemplo da posição 3
print(c.index(2))# localiza o numero 2 na tupla, mas se tiver outro cinco faz o seguinte
print(c.index(2, 1)) # localiza o numero 2 a partir da posição 1

print('-='*20)
pessoa = ('Márcio', 47, 'M', 101.00)
del(pessoa)# Esta função deleta toda a tupla 'pessoa' só não posso deletar os dados unitários da tupla pessoa(pois a tupla é imutável)
print(pessoa)
