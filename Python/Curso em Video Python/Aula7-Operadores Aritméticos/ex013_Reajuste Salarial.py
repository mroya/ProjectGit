# Faça um algoritmo que leia o salário de um funcionário e mostre seu novo salário com
# 15% de aumento
func = input('Qual o nome do Funcionário? ')
sal = float(input('Qual o valor atual do salário do Funcionário {}? '.format(func)))
reaj = int(input('Qual será a porcentagem de aumento do salário?% '))
calc = sal + (sal * reaj / 100)
print('Teve reajuste de R$ {:.2f}'.format(sal * reaj / 100))
print('O novo salário do funcionário {} será de R$ {:.2f} '.format(func, calc))
