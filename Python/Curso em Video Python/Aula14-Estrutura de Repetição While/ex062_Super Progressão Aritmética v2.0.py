# Melhore o exercício 061, perguntando para o usuário se ele quer mostrar mais alguns termos.
# O programa encerra quando ele disser que não quer mostrar nenhum termo.
print('-='*20)
print('Gerador de PA')
print('-='*20)
primeiro = int(input('Primeiro Termo: '))
razão = int(input('Razão: '))
termo = primeiro
cont = 1
total = 0
mais = 10
while mais != 0:
    total += mais
    while cont <= total:
        print('{} ->'.format(termo), end=' ')
        termo = termo + razão
        cont += 1
    print('Pausa')
    mais = int(input('Quantos termos você quer mais? '))
print('Você finalizou a progressão com {} termos.'.format(total))
print('Fim')
