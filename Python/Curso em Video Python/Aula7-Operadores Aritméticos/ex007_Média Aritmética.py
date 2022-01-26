# Desenvolva um programa que leia as duas notas de um aluno, calcule e mostre a sua media
nome = input('Nome do Aluno: ')
n1 = float(input('Digite a 1ª nota: '))
n2 = float(input('Digite a 2ª nota: '))
media = (n1 + n2) / 2
print('O aluno {} tirou {:.1f} na 1ª prova e {:.1f} na 2ª prova'.format(nome, n1, n2))
print('A média do aluno {} foi de {:.1f}'.format(nome, media))
print('Situação do aluno:')
if media >= 6:
    print('APROVADO!!')
if media < 6:
    print('ESTÁ EM RECUPERAÇÃO, MARQUE SUA PROVA COM O PROFESSOR(A)')
