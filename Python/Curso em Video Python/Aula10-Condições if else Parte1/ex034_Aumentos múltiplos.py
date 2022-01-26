# Crie um programa que pergunte o salário de um funcionário e calcule o valor do seu
# aumento. Para salário superior a R$1.250,00 calcule um aumento de 10%.
# Para salário inferior ou igual a R$ 1.250,00 o aumento é de 15%.
print('Saiba qual foi o seu aumento de salário')
sal = float(input('Qual o seu salário atual? '))
calc1 = (sal * 15/100 + sal)
calc2 = (sal * 10/100 + sal)
if sal <= 1250:
    print('Seu salário teve um aumento de 15%')
    print('O valor do seu salário passa a ser de {:.2f} reais'.format(calc1))
else:
    print('Seu salário teve um aumento de 10%')
    print('O valor do seu salário passa a ser de {:.2f} reais'.format(calc2))
