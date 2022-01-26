# Crie um programa que tenha uma função chamada maior(), que receba vários parâmetros com valores inteiros.
# Seu programa tem que analisar todos os valores e dizer qual deles é o maior.
from time import sleep


def maior(*num):
    mai = cont = 0
    print('-=' * 20)
    print('Analisando os valores passados...')
    for p in num:
        if p == 1:
            mai = p
        else:
            if p > mai:
                mai = p
        cont += 1
    sleep(1)
    print(f'{num} foram informados {len(num)} valores ao todo.')
    print(f'O maior valor informado foi o {mai}')


maior(2, 9, 7, 8, 5)
maior(4, 5, 9)
maior(8, 7, 2, 1, 45)
maior()
