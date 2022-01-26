# Crie um programa que leia uma frase qualquer e diga se ela é um PALÍNDROMO,
# desconsiderando os espaços.
print('-='*20)
print('{:^40}'.format(' Verificação de PALÍNDROMO '))
print('-='*20)
frase = str(input("Digite uma frase: ")).strip().upper()
palavras = frase.split()
junto = ''.join(palavras)
inverso = ''
for c in range(len(junto)-1, -1, -1):
    inverso += junto[c]
print('O inverso de {} é {}'.format(junto, inverso))
if inverso == junto:
    print('Temos um Palíndromo!')
else:
    print('Não é um Palíndromo!')
print('Fim')
