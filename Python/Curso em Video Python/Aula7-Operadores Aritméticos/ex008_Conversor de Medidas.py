# Escreva um programa que leia um valor em metros e o exiba convertido em centímetros e milímetros
mt = float(input('Digite um valor em metros: '))
cm = mt * 100
mm = mt * 1000
print('Em {} mt temos {} cm.'.format(mt, cm))
print('Em {} mt temos {} mm.'.format(mt, mm))
