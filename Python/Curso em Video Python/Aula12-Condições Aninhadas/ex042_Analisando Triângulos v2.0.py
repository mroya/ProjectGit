# Refaça o Desafio 035 dos triângulos, acrescentando o recurso de mostrar que tipo de triângulo será formado:
# - Equilátero:Todos os lados iguais,
# - Isóceles: dois lados iguais,
# - Escaleno:todos os lados diferentes.
print('-='*20)
print('Verificador de Triângulos')
print('-='*20)
r1 = float(input('1º tamanho de reta: '))
r2 = float(input('2º tamanho de reta: '))
r3 = float(input('3º tamanho de reta: '))
if r1 < r2 + r3 and r2 < r1 + r3 and r3 < r1 + r2:
    print('Com estes tamanhos PODEMOS FORMAR um triângulo ', end='')
    if r1 == r2 == r3:
        print('Equilátero')
    elif r1 != r2 != r3 != r1:
        print('Escaleno')
    else:
        print('Isóceles')
else:
    print('Com estes tamanhos NÃO PODEMOS FORMAR um triângulo')
