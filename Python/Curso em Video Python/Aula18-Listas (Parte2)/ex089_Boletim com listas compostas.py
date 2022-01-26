# Crie um programa que leia nome e duas notas de vários alunos e guarde tudo em uma lista composta. No final,
# mostre um boletim contendo a média de cada um e permita que o usuário possa mostrar as notas de cada aluno
# individualmente.
from time import sleep
aluno = list()
lista = list()
while True:
    aluno.append(str(input('Nome do Aluno: ')))
    nota1 = float(input('Nota 1: '))
    aluno.append(nota1)
    nota2 = float(input('Nota 2: '))
    aluno.append(nota2)
    mediaNota = (nota1 + nota2) / 2
    aluno.append(mediaNota)
    lista.append(aluno[:])
    aluno.clear()
    resp = str(input('Quer continuar? [S/N] ')).strip().upper()[0]
    while resp != 'N' and resp != 'S':
        resp = str(input('Quer continuar? [S/N] ')).strip().upper()[0]
    if resp in 'N':
        break
print('-='*20)
print('-'*22)
print(f"{'Nº':<2}", f"{'Nome':<10}", f"{'Média':<10}")
print('-'*22)
for i, v in enumerate(lista):
    print(f'{i:<2}', end=' ')
    print(f'{v[0]:<10}', f'{v[3]:<10.2f}')
print('-'*22)
while True:
    pergunta = int(input('Quer ver a nota de qual aluno?[999]Encerra '))
    print('-' * 46)
    for i, v in enumerate(lista):
        if pergunta == i:
            print(f'As notas do Aluno(a) {v[0]} foram: ', end='')
            print(f'{v[1], v[2]}', end=' ')
            print()
    print('-' * 46)
    print()
    if pergunta == 999:
        print('Finalizando...')
        sleep(1)
        break

