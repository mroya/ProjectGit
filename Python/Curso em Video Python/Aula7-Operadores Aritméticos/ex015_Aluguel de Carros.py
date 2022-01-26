#ALgoritmo para calcular aluguel de carro, sabendo que o carro custa R$ 60,00 p/dia e R$0.15 por km
d = int(input('Quantos dias o carro ficou alugado? '))
k = float(input('Quantos Km rodados? '))
t = (d * 60) + (k * 0.15)
print('O total a Pagar é de R$ {:.2f}'.format(t))
