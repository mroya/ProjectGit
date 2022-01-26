# Crie um programa onde o usuário digite uma expressão qualquer que use parênteses. Seu aplicativo deverá analisar
# se a expressão passada está com os parênteses abertos e fechados na ordem correta.
exp = str(input('Digite a expressão: '))
contador = list()
for simbolo in exp:
    if simbolo == '(':
        contador.append('(')
    elif simbolo == ')':
        if len(contador) > 0:
            contador.pop()
        else:
            contador.append(')')
            break
if len(contador) == 0:
    print('Sua expressão está válida!')
else:
    print('Sua expressão está errada!')






