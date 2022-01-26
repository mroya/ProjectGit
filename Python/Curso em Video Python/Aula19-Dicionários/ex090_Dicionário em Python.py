# Crie um programa que leia o nome e a media de um aluno, guardando também a situação
# em um dicionário. No final mostre o conteúdo da estrutura na tela.
aluno = dict()
aluno['Nome'] = str(input('Nome: '))
aluno['Média'] = float(input(f'Média do aluno {aluno["Nome"]}: '))
if aluno['Média'] >= 7:
    aluno['Situação'] = 'Aprovado!'
elif 5 < aluno['Média'] <= 7:
    aluno['Situação'] = 'Recuperação!'
else:
    aluno['Situação'] = 'Reprovado!'
print('-='*30)
for n, m in aluno.items():
    print(f'- {n} é igual a {m}')
