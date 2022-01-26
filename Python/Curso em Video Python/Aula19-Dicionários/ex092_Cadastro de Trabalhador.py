# Crie um programa que leia nome, ano de nascimento e carteira de trabalho e cadastre-o (com idade)
# em um dicionário. Se por acaso a CTPS for diferente de ZERO, o dicionário receberá também o ano de
# contratação e o salário. Calcule e acrescente, além da idade, com quantos anos a pessoa vai se aposentar.
import datetime
ano = datetime.date.today().year
empregado = dict()
while True:
    empregado['Nome'] = str(input('Nome: '))
    nascimento = int(input('Ano de Nascimento: '))
    empregado['Idade'] = ano - nascimento
    empregado['CTPS'] = int(input('Carteira de Trabalho (0 não tem): '))
    if empregado['CTPS'] == 0:
        break
    empregado['Contratação'] = int(input('Ano de Contratação: '))
    empregado['Salário'] = float(input('Salário:R$ '))
    if empregado['Contratação'] != 0:
        empregado['aposentadoria'] = empregado['Idade'] + ((empregado['Contratação'] + 35) - datetime.date.today().year)
    break
print('-='*30)
for c, v in empregado.items():
    print(f'- {c} tem o valor {v}')
