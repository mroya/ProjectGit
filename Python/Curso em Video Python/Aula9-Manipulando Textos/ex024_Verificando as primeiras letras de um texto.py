# Crie um programa que leia o nome de uma cidade e diga se ela começa ou não com o nome "santo".
cid = str(input('Qual o nome da sua cidade? ')).strip()
print(cid[:5].upper() == 'SANTO')
