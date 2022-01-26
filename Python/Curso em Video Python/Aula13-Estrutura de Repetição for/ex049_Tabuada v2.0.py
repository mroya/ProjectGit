# Refaça o exercício 9, mostrando a tabuada de um número que o usuário escolher,
# só que agora utilizando um laço for.
print('-='*20)
print('{:^40}'.format(' Cálculo da Tabuada '))
print('-='*20)
soma = 0
n = int(input('Escolha um número: '))
for c in range(1, 11):
    soma = n * c
    print(f'{c} x {n} = {soma}')
print('Fim')
