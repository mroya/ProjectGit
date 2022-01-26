def aumentar(n=0, taxaa=0, formato=False):
    """
    --> Calcula o aumento de um determinado preço
    retornando o resultado com ou sem formatação.
    :param n: o valor inicial
    :param taxaa: o percentual do aumento
    :param formato: indica se quer a saída formatada ou não
    :return: Saida do valor
    """
    res = n + (n * taxaa / 100)
    return res if formato is False else moeda(res)


def diminuir(n=0, taxar=0, formato=False):
    """
    --> Função para diminui o valor informado
    :param n: O valor inicial
    :param taxar: o percentual para reduzir
    :param formato: indica se quer a saída com formato ou não
    :return: Saída do valor
    """
    res = n - (n * taxar / 100)
    return res if formato is False else moeda(res)


def dobro(n=0, formato=False):
    """
    --> Função para dobrar o valor informado
    :param n: valor inicial
    :param formato: dobra o valor
    :return: Saída do valor em dobro
    """
    res = n * 2
    return res if formato is False else moeda(res)


def metade(n=0, formato=False):
    """
    --> Função para dividir pela metade o valor informado
    :param n: valor inicial
    :param formato: dividir o valor
    :return: Saída do valor informado pela metade
    """
    res = n / 2
    return res if formato is False else moeda(res)


def moeda(n=0, cifra='R$'):
    """
    --> Função para monetizar os valores da função
    :param n: valor inicial
    :param cifra: moeda real
    :return: Saída com formato em moeda Real
    """
    return f' {cifra} {n:>.2f}'.replace('.', ',')


def escreva(txt):
    """
    --> Função para acompanhar o tamanho do texto
    :param txt: o texto para acompanhar as linhas
    :return: saída do txt com as linhas embaixo e em cima
    """
    tam = len(txt) + 4
    print('-' * tam)
    print(f'  {txt}')
    print('-' * tam)


def resumo(n=0, taxaa=10, taxar=5):
    """
    --> Função gera um resumo
    :param n: o valor informado
    :param taxaa: percentual de aumento
    :param taxar: percentual da redução
    :return: Saída com formato em resumo
    """
    print('-' * 32)
    print('RESUMO DO VALOR'.center(32))
    print('-' * 32)
    res = n
    print(f'Preço Analisado: \t{moeda(res)}')
    print(f'Dobro do Preço: \t{dobro(res, formato=True)}')
    print(f'Metade do Preço: \t{metade(res, formato=True)}')
    print(f'{taxaa}% de aumento: \t{aumentar(n, taxaa, formato=True)}')
    print(f'{taxar}% de redução: \t{diminuir(n, taxar, formato=True)}')
    print('-'*32)
