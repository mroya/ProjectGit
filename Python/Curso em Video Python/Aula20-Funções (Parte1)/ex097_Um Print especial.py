# Crie um programa que tenha uma função chamada escreva(), que receba um texto qualquer como parâmetro e mostre
# uma mensagem com tamanho adaptável.
def escreva(txt):
    tam = len(txt) + 4
    print('~' * tam)
    print(f'  {txt}')
    print('~' * tam)


escreva('Gustavo Guanabara')
escreva('Curso de Python no Youtube')
escreva('CeV')
