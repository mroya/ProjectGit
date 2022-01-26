# Faça um programa que leia um número de 0 até 9999 e mostre na tela cada um dos dígitos separados.
# ex: Digite um número: 1834  - unidade: 4 dezena: 3 centena: 8 milhar: 1
numero = str(input('Digite um número de 0 a 9999: ')).strip()
print('O número digitado foi {}.'.format(numero))
tam = len(numero)
if tam == 1:
    print('Sua unidade é {}'.format(numero[0]))
if tam == 2:
    print('Sua unidade é {}'.format(numero[1]))
    print('Sua dezena é {}'.format(numero[0]))
if tam == 3:
    print('Sua unidade é {}'.format(numero[2]))
    print('Sua dezena é {}'.format(numero[1]))
    print('Sua centena é {}'.format(numero[0]))
if tam == 4:
    print('Sua unidade é {}'.format(numero[3]))
    print('Sua dezena é {}'.format(numero[2]))
    print('Sua centena é {}'.format(numero[1]))
    print('Seu milhar é {}'.format(numero[0]))
