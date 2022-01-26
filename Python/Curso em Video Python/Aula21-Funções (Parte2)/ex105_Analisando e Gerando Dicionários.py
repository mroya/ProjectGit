# Crie um programa que tenha uma função notas() que pode receber várias notas de alunos e vai retornar um
# dicionário com as seguintes informações:
# – Quantidade de notas
# – A maior nota
# – A menor nota
# – A média da turma
# – A situação (opcional)
def notas(*num, sit=False):
    """
    -> Função para analisar notas e situações de vários alunos.
    :param num: uma ou mais notas dos alunos (aceita várias).
    :param sit: valor opcional, indicando se deve ou não adicionar a situação.
    :return: dicionário com várias informações sobre a situação da turma.
    """
    soma = sum(num)
    media = soma / len(num)
    resposta = {'total': len(num), 'maior': max(num), 'menor': min(num), 'media': media}
    if sit:
        if resposta['media'] >= 7:
            resposta['sit'] = 'Boa'
        elif resposta['media'] >= 5:
            resposta['sit'] = 'Razoável'
        else:
            resposta['sit'] = 'Ruim'
    return resposta


# Programa principal
resp = notas(9, 10, 5.9, 6.5, 4.6, sit=True)
print(resp)
# help(notas)
