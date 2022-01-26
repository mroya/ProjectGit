# Crie um programa que leia dois valores e mostre um menu na tela:
# [1]soma[2]multiplicar[3]maior[4]novos números[5]sair do programa.
# Seu programa deverá realizar a operação solicitada em cada caso.
opção = 0
maior = 0
print('-=' * 20)
n1 = int(input('Digite o 1º valor: '))
n2 = int(input('Digite o 2º valor: '))
print('-=' * 20)
while opção != 5:
    print('[1]somar\n[2]multiplicar\n[3]maior\n[4]novos números\n[5]sair do Programa''')
    opção = int(input('>>>>>Qual é a sua opção? '))
    print('-='*20)
    if opção == 1:
        soma = (n1 + n2)
        print('A soma entre {} + {} = {}'.format(n1, n2, soma))
        print('-='*20)
    elif opção == 2:
        mult = (n1 * n2)
        print('A multiplicação entre {} x {} = {}'.format(n1, n2, mult))
        print('-=' * 20)
    elif opção == 3:
        if n1 > n2:
            maior = n1
            print('Entre {} e {} o MAIOR é {}'.format(n1, n2, maior))
            print('-=' * 20)
        elif n1 < n2:
            maior = n2
            print('Entre {} e {} o MAIOR é {}'.format(n1, n2, maior))
            print('-=' * 20)
    elif opção == 4:
        print('-=' * 20)
        n1 = int(input('Digite o 1º valor: '))
        n2 = int(input('Digite o 2º valor: '))
        print('-=' * 20)
        print('[1]somar\n[2]multiplicar\n[3]maior\n[4]novos números\n[5]sair do Programa')
        opção = int(input('>>>>>Qual é a sua opção? '))
        if opção == 1:
            soma = (n1 + n2)
            print('A soma entre {} + {} = {}'.format(n1, n2, soma))
            print('-=' * 20)
        elif opção == 2:
            mult = (n1 * n2)
            print('A multiplicação entre {} x {} = {}'.format(n1, n2, mult))
            print('-=' * 20)
        elif opção == 3:
            if n1 > n2:
                maior = n1
                print('Entre {} e {} o MAIOR é {}'.format(n1, n2, maior))
                print('-=' * 20)
            elif n1 < n2:
                maior = n2
                print('Entre {} e {} o MAIOR é {}'.format(n1, n2, maior))
                print('-=' * 20)
        elif opção == 4:
            print('-=' * 20)
            n1 = int(input('Digite o 1º valor: '))
            n2 = int(input('Digite o 2º valor: '))
            print('-=' * 20)
            print('[1]somar\n[2]multiplicar\n[3]maior\n[4]novos números\n[5]sair do Programa')
            opção = int(input('>>>>>Qual é a sua opção? '))
        elif opção == 5:
            exit()
            print('Fim')
        else:
            print('Opção Inválida. Tente novamente!')
            print('-='*20)
    elif opção == 5:
        print('Fim do programa')
        exit()
    else:
        print('Opção Inválida.Tente novamente!')
        print('-='*20)
print('Fim')



