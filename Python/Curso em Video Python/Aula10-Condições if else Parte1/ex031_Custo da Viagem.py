# Crie um programa que pergunte a distância de uma viagem em KM. Calcule o preço da
# passagem, cobrando R$ 0,50 por KM para viagens de até 200km e R$ 0.45 para viagens mais
# longas.
dist = int(input('Qual a distância da viagem em KM? '))
calc1 = dist * 0.50
calc2 = dist * 0.45
if dist <= 200:
    print('Para o percurso de {}km o preço da passagem será de R$ {:.2f} Reais'.format(dist, calc1))
else:
    print('Para o percurso de {}km o preço da Passagem será de R$ {:.2f} Reais'.format(dist, calc2))
print('Faça uma boa viagem!')