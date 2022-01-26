# Crie um programa que leia o primeiro termo e a razão de PA. No final, mostre os 10 primeiros
# termos dessa progressão.
print('-='*20)
print('{:^40}'.format(' 10 TERMOS DE UMA PA '))
print('-='*20)
primeiro = int(input('Primeiro termo: '))
razao = int(input('Razão da PA: '))
decimo = primeiro + (10-1) * razao
for c in range(primeiro, decimo + razao, razao):
    print('{}'.format(c), end='-> ')
print('Acabou')



