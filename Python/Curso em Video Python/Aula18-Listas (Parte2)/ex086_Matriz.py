# Crie um programa que declare uma matriz de dimensão 3×3 e preencha com valores lidos pelo teclado.
# No final, mostre a matriz na tela, com a formatação correta.
matriz = [[], [], []]
for c in range(0, 3):
    matriz[0].append(int(input(f'Digite um valor para [{c}, {0}]: ')))
    matriz[1].append(int(input(f'Digite um valor para [{c}, {1}]: ')))
    matriz[2].append(int(input(f'Digite um valor para [{c}, {2}]: ')))
print('-='*30)
print(f'[{matriz[0][0]:^5}][{matriz[1][0]:^5}][{matriz[2][0]:^5}]')
print(f'[{matriz[0][1]:^5}][{matriz[1][1]:^5}][{matriz[2][1]:^5}]')
print(f'[{matriz[0][2]:^5}][{matriz[1][2]:^5}][{matriz[2][2]:^5}]')
