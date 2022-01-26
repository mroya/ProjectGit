# Faça um programa que leia um ângulo e mostre na tela o valor do seno, cosseno e
# tangente desse ângulo
from math import radians, sin, cos, tan
ângulo = float(input('Digite um ângulo qualquer: '))
seno = sin(radians(ângulo))
cosseno = cos(radians(ângulo))
tangente = tan(radians(ângulo))
print('O ângulo de {:.0f}° graus tem os seguintes dados:\nSeno {:.2f}\nCosseno {:.2f}\nTangente {:.2f}'.format(ângulo, seno, cosseno, tangente))
