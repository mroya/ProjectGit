#tempo = int(input('Quantos anos tem seu carro? '))
# método simplificado
#print('Carro Novo'if tempo <=3 else'Carro Velho')
#print('Fim')

# ou
# Método comum e mais sugestível
#    print('Carro Novo')
# else:
#    print('Carro Velho')
# print('Fim')
"""nome = str(input('Qual é o seu nome? ')).strip()
if nome == 'Márcio':
    print('Que nome lindo você tem!')
else:
    print('Seu nome é tão normal!')
print('Bom Dia, {}'.format(nome))"""
n1 = float(input('Digite a primeira nota: '))
n2 = float(input('Digite a segunda nota: '))
m = (n1 + n2)/2
print('A sua média foi {:.1f}'.format(m))
if m >= 6.0:
    print('Sua média foi boa, Parabéns!')
else:
    print('Você não alcançou a média, ESTUDE MAIS!!')
