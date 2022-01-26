# Aprimore o desafio anterior, mostrando no final:
# A) A soma de todos os valores pares digitados.
# B) A soma dos valores da terceira coluna.
# C) O maior valor da segunda linha.
matriz = [[], [], []]
somaA = somaB = somaC = mai = 0
for c in range(0, 3):
    matriz[0].append(int(input(f'Digite um valor para [{c}, {0}]: ')))
    matriz[1].append(int(input(f'Digite um valor para [{c}, {1}]: ')))
    matriz[2].append(int(input(f'Digite um valor para [{c}, {2}]: ')))
print('-='*30)
print(f'[{matriz[0][0]:^5}][{matriz[1][0]:^5}][{matriz[2][0]:^5}]')
print(f'[{matriz[0][1]:^5}][{matriz[1][1]:^5}][{matriz[2][1]:^5}]')
print(f'[{matriz[0][2]:^5}][{matriz[1][2]:^5}][{matriz[2][2]:^5}]')
print('-='*30)
for d in matriz[0]:
    if d % 2 == 0:
        somaA += d
for e in matriz[1]:
    if e % 2 == 0:
        somaB += e
for f in matriz[2]:
    if f % 2 == 0:
        somaC += f
spar = somaA + somaB + somaC
print(f'A soma dos valores PARES é {spar}')
print(f'A soma dos valores da terceira coluna é {sum(matriz[2])}')
for g in range(0, 3):
    if g == 0:
        mai = matriz[g][1]
    elif matriz[g][1] > mai:
        mai = matriz[g][1]
print(f'O maior valor da segunda linha é {mai}')
