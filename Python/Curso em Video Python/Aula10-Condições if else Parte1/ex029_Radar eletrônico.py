# Crie um programa que leia a velocidade de um carro. Se ele ultrapassar 80km,
# mostre uma mensagem dizendo que ele foi multado.A multa vai custar R$7,00 por cada km
# acima do limite.
v = int(input('Qual a velocidade do Veículo? '))
print('A velocidade foi de {}km\h'.format(v))
m = 7
acima = v - 80
multa = (v - 80) * m
if v > 80:
    print('MULTADO!, Você ultrapassou o limite de velocidade da via que é de 80 KM\h')
    print('Sua velocidade está {}km acima do limite na via, Sua multa foi de R$ {} reais'.format(acima, multa))
else:
    print("Parabéns, você esta dirigindo na velocidade indicada na via!")
print('Tenha um bom dia! Dirija com segurança!')
