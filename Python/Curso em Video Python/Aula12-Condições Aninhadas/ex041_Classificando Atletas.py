# A confederação Nacional de Natação precisa de um programa que leia o ano de nascimento de um atleta e mostre
# sua categoria, de acordo com a idade: - Até 9 anos: Mirim - Até 14 anos: Infantil - Até 19 anos: junior
# - Até 25 anos: Sênior - Acima: Master
from datetime import date
print('-='*20)
print('Confederação Nacional de Natação')
print('-='*20)
ano = date.today().year
nascimento = int(input('Qual o ano de nascimento do Atleta: '))
idade = ano - nascimento
print('O atleta tem {} anos'.format(idade))
if idade <= 9:
    print('Categoria: Mirim')
elif idade <= 14:
    print('Categoria: Infantil')
elif idade <= 19:
    print('Categoria: Junior')
elif idade <= 25:
    print('Categoria: Sênior')
else:
    print('Categoria: Master')
