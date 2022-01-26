def aumentar(n=0, taxa=0, formato=False):
    """
    Aumenta o valor inicial
    :param n: o valor inicial
    :param taxa: o percentual do aumento
    :param formato: indica se quer a saída formatada ou não
    :return: Saida do valor
    """
    res = n + (n * taxa / 100)
    return res if formato is False else moeda(res)


def diminuir(n=0, taxa=0, formato=False):
    res = n - (n * taxa / 100)
    return res if formato is False else moeda(res)


def dobro(n=0, formato=False):
    res = n * 2
    return res if formato is False else moeda(res)


def metade(n=0, formato=False):
    res = n / 2
    return res if formato is False else moeda(res)


def moeda(n=0, cifra='R$'):
    return f' {cifra} {n:>.2f}'.replace('.', ',')
