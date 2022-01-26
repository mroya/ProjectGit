# Crie um programa para aprovar um empréstimo bancário para a compra de uma casa.O programa vai perguntar o valor
# da casa, o salário do comprador e em quantos anos ele vai pagar. Calcule o valor da prestação mensal, sabendo que
# ela não pode exceder 30% do salário ou então o empréstimo será negado.
print('-='*20)
print('Financiamento Casa Própria')
print('-='*20)
valor = float(input('Qual o valor da casa R$ '))
salario = float(input('Sua renda mensal? '))
anos = int(input('Em quantos anos para pagar? '))
tempo = (anos*12)
calc = valor / tempo
sal30 = salario * 30/100
if calc < sal30:
    print('Você vai financiar sua casa em {} meses'.format(tempo))
    print('Sua prestação ficou em R${:.2f}'.format(calc))
    print('Empréstimo Aprovado!!')
else:
    print('A prestação ficou em R${:.2f}'.format(calc))
    print('Seu empréstimo foi negado!')
    print('A prestação foi superior a 30% do seu salário.')
    print('Onde 30% do seu salário é de R$ {} reais'.format(sal30))
