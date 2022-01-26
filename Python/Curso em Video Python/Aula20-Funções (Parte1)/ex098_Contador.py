# Crie um programa que tenha uma função chamada contador(), que receba três parâmetros: início, fim e passo.
# Seu programa tem que realizar três contagens através da função criada:
# a) de 1 até 10, de 1 em 1
# b) de 10 até 0, de 2 em 2
# c) uma contagem personalizada
def contador(i, f, p):
    print('-='*20)
    print(f'Contagem de {i} até {f} de {p} em {p}')
    if p < 0:
        p *= -1
    if p == 0:
        p = 1
    if i < f:
        cont = i
        while cont <= f:
            from time import sleep
            sleep(0.4)
            print(f'{cont}', end=' ')
            cont += p
        print('Fim!')
    else:
        cont = i
        while cont >= f:
            from time import sleep
            sleep(0.4)
            print(f'{cont}', end=' ')
            cont -= p
        print('Fim!')


contador(1, 10, 1)
print()
contador(10, 0, 2)
print()
print('-='*20)
print('Agora é a sua vez de personalizar a contagem!')
ini = int(input('Início: '))
fim = int(input('Fim:    '))
pas = int(input('Passo:  '))
contador(ini, fim, pas)
