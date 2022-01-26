# Crie um algoritmo que leia um número e mostre o seu dobro, triplo e raiz quadrada.
n = int(input('Digite um número: '))
d = n * 2
t = n * 3
raiz = n ** (1/2)
print('O Dobro de {} é {}'.format(n, d))
print('O Triplo de {} é {}'.format(n, t))
print('A Raiz quadrada de {} é {:.2f}'.format(n, raiz))
