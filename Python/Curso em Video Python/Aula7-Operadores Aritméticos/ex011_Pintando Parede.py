# Faça um programa que leia a largura e a altura de uma parede em metros,
# calcule a sua área e a quantidade de tinta necessária para pintá-la,
# sabendo que cada litro de tinta pinta uma área de 2m
lg = float(input('Qual é a largura da parede em metros? '))
alt = float(input('Qual é a altura da parede em metros? '))
area = lg * alt
tinta = area / 2
print('Sua área total é de {} m²'.format(area))
print('Para pintar a sua parede de {} m² você vai precisar de {} litros de tinta'.format(area, tinta))
