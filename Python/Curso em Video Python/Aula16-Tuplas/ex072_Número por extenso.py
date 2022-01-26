# Crie um programa que tenha uma tupla totalmente preenchida com uma contagem por extensão, de zero até vinte.
# Seu programa deverá ler um número pelo teclado (entre 0 e 20) e mostrá-lo por extenso.
lista = ('Zero', 'Um', 'Dois', 'Três', 'Quatro',
         'Cinco', 'Seis', 'Sete', 'Oito', 'Nove',
         'Dez', 'Onze', 'Doze', 'Treze', 'Quatorze',
         'Quinze', 'Dezesseis', 'Dezessete', 'Dezoito',
         'Dezenove', 'Vinte')
resp = ''
while resp in 'S':
    num = int(input('Digite um valor entre 0 e 20: '))
    while num > 20 or num < 0:
        num = int(input('Tente novamente. Digite um valor entre 0 e 20: '))
    print(f'Você digitou {lista[num]}.')
    resp = str(input('Quer continuar? [S/N] ')).strip().upper()[0]
