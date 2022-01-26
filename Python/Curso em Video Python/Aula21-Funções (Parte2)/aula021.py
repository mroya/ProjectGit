# Funções Parte 2
'''help(input) #Mostra o manual por exemplo do input

print(input.__doc__)

help(input)
'''

'''
#EXEMPLO DE CONTADOR
def contador(i, f, p):
    """
    -> Faz uma contagem e mostra na tela.
    :param i: início da contagem
    :param f: fim da contagem
    :param p: passo da contagem
    :return: sem retorno
    """
    c = i
    while c <= f:
        print(f'{c}', end='..')
        c += p
    print('FIM!')


contador(0, 100, 10)

help(contador)'''

'''
# Parâmetros Opcionais
# coloca o numeral 0 no último campo caso não seja informado o terceiro numero ou posso colocar
# em todas as letras o numeral 0.
def somar(a=0, b=0, c=0):

    s = a + b + c
    print(f'A soma vale {s}.')


somar(3, 2, 5)
somar(1, 3)
somar()
'''
'''# ESCOPO DE VARIÁVEIS
#exemplo:


def teste():
    n1 = 4 # O n1 é uma variável local
    print(f'Na função teste, n1 dentro vale {n1}')


#Programa principal
n1 = 2
# O n1 é uma variável global pq está no programa principal
print(f'No programa principal, n1 vale {n1}')
teste()'''
'''
# Escopo de variáveis tratando o A como global da forma tradicional


def teste(b):
    global a # utilizamos a função "global"
    a = 8
    b += 4
    c = 2
    print(f'A dentro vale {a}')
    print(f'B dentro vale {b}')
    print(f'C dentro vale {c}')


a = 5
teste(a)
print(f'A fora vale {a}')'''
'''
# Retornando valores: Personalização de resultados Função com retorno


def somar(a=0, b=0, c=0):
    s = a + b + c
    return s


r1 = somar(3, 2, 5)
r2 = somar(2, 2)
r3 = somar(6)
print(f'Meus cálculos deram {r1}, {r2} e {r3}.')'''

'''Exemplo 1
def fatorial(num=1):
    f = 1
    for c in range(num, 0, -1):
        f *= c
    return f

n = int(input('Digite um número: '))
print(f'O fatorial de {n} é igual a {fatorial(n)}')'''


'''#Exemplo 2:


def fatorial(num=1):
    f = 1
    for c in range(num, 0, -1):
        f *= c
    return f

f1 = fatorial(5)
f2 = fatorial(4)
f3 = fatorial()
print(f'Os resultados são {f1}, {f2} e {f3}.')'''


# Exemplo 3:


def par(n=0):
    if n % 2 == 0:
        return True
    else:
        return False


num = int(input('Digite um número: '))
if par(num):
    print('É Par!')
else:
    print('Não é Par!')

