# Faça um algoritmo que leia o preço de um produto e mostre seu novo preço, com 5% de desconto
prod = float(input('Quanto custa o produto?R$ '))
desc = prod - (prod * 5 / 100)
print('Hoje PROMOÇÃO de 5% em toda a loja!!!')
print('Seu produto com preço de R$ {:.2f} Reais vai custar agora com o desconto R$ {:.2f} reais'.format(prod, desc))
