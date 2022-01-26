def leiadinheiro(msg):
    """
    --> Função
    :param msg: Preço digitado
    :return: verifica o preço inserido, funcionando com vírgula.
    """
    valido = False
    while not valido:
        n = str(input(msg)).replace(',', '.').strip()
        if n.isalpha() or n == '':
            print(f'\033[31mErro: {n} é um preço inválido!\033[m')
        else:
            valido = True
            return float(n)


def leiaint(msg):
    ok = False
    valor = 0
    while True:
        n = str(input('Digite um número: '))
        if n.isnumeric():
            valor = int(n)
            ok = True
        else:
            print('\033[0;31mErro! Digite um número inteiro válido.\033[m')
        if ok:
            break
    return valor