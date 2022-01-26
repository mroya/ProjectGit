#Crie um programa que leia um ano qualquer e mostre se ele é Bissexto.
print('Descubra se o ano é BISSEXTO')
ano = int(input('Qual ano você gostaria de saber? '))
if (ano % 4 == 0 and ano % 100 != 0) or ano % 400 == 0:
    print('O ano de {} é Bissexto!'.format(ano))
    print('Portanto o mês de Fevereiro de {} terá 29 dias'.format(ano))
else:
    print('O ano de {} NÃo é bissexto!'.format(ano))
