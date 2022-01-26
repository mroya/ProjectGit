# Crie um programa que leia duas notas de um aluno e calcule sua média, mostrando uma mensagem no final,
# de acordo com a média atingida:
# - Média abaixo de 5.0: REPROVADO - Média entre 5.0 e 6.9:RECUPERAÇÃO - Média 7.0 ou superior: APROVADO
print('-='*20)
print('Boletim Escolar')
print('-='*20)
n1 = float(input('Digite a 1º nota: '))
n2 = float(input('Digite a 2º nota: '))
media = (n1 + n2) / 2
if media < 5:
    print('Sua média ficou em {}'.format(media))
    print('Você foi REPROVADO!')
elif media == 5:
    print('Sua média ficou em {}'.format(media))
    print('Você esta em RECUPERAÇÃO!')
elif media <= 6.9:
    print('Sua média ficou em {}'.format(media))
    print('Você está em RECUPERAÇÃO!')
elif media >= 7:
    print('Sua média ficou em {}'.format(media))
    print('Parabéns você está APROVADO!')
print('Fim')