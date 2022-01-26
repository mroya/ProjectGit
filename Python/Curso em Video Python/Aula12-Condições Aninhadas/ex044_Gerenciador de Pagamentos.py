# Faça um programa que calcule o valor a ser pago por um produto, considerando o seu preço normal e condição
# de pagamento:
# - à vista dinheiro/cheque: 10% Desconto.
# - à vista no cartão: 5% de desconto.
# - em até 2x no cartão preço normal.
# - 3x ou mais no cartão: 20% de juros.
print('{:*^40}'.format(' Lojas Reis '))
total = 0
preço = float(input('Qual o valor do produto? R$ '))
print('''FORMAS DE PAGAMENTO
[ 1 ]À Vista dinheiro/cheque
[ 2 ]À Vista no cartão
[ 3 ]2x no cartão
[ 4 ]3x ou mais no cartão''')
opção = int(input('Qual opção: '))
if opção == 1:
    total = preço - (preço * 10/100)
    print('Você teve um desconto de 10%')
elif opção == 2:
    total = preço - (preço * 5/100)
    print('Você teve um desconto de 5%')
elif opção == 3:
    total = preço
    parcela = total / 2
    print('Você escolheu pagar em 2x e cada parcela será de R$ {:.2f}'.format(parcela))
elif opção == 4:
    total = preço + (preço * 20/100)
    totparc = int(input('Em quantas vezes? '))
    parcela = total / totparc
    print('Você escolheu pagar em {} vezes com juros de 20% e cada parcela será de R$ {:.2f} reais'.format(totparc, parcela))
print('Sua compra de R$ {} reais vai custar R${} reais no final'.format(preço, total))
