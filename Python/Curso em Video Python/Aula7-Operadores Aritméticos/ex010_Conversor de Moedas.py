# Crie um programa que leia quanto dinheiro uma pessoa tem na carteira e mostre quantos Dólares ela
# pode comprar considerando 1 dólar = R$ 3,27
rs = float(input('Quanto de dinheiro você tem na carteira? R$ '))
usd = rs / 5.06
eu = rs / 6.20
print('Com R$ {:.2f} reais você pode comprar us$ {:.2f} dólar(es)'.format(rs, usd))
print('Com R$ {:.2f} reais você pode comprar eu$ {:.2f} euro(s)'.format(rs, eu))
