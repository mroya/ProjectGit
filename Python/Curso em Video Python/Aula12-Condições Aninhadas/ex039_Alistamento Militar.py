# Faça um programa que leia o ano de nascimento de um jovem e informe, de acordo com sua idade:
# - Se ele ainda vai se alistar ao serviço militar,
# - Se é a hora de se alistar,
# - Se já passou do tempo do alistamento.
# Seu programa também deverá mostrar o tempo que falta ou que passou do prazo.
import datetime
ano = datetime.date.today().year
nascimento = int(input('Qual o seu ano de nascimento? '))
idade = (ano - nascimento)
tempo = idade - 18
print('Estamos no ano de {}'.format(ano))
if idade <= 17:
    tempo2 = 18 - idade
    print('Sua idade é de {} anos'.format(idade))
    print('Falta ainda {} anos para se apresentar na junta militar'.format(tempo2))
    print('O ano que você tem que se apresentar é em Janeiro de {}'.format(tempo2 + nascimento))
elif idade == 18:
    print('Sua idade é de {} anos'.format(idade))
    print('Você deve se apresentar imediatamente na junta militar.')
elif idade > 18:
    print('Sua idade é de {} anos'.format(idade))
    print('Você ja passou em {} anos do prazo para se apresentar.'.format(tempo))
    print('Espero que tenha se apresentado na junta militar!!')
print('fim')
