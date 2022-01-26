# Tipos primitivos
# Nessa aula, vamos aprender como funcionam os tipos primitivos no Python e as
# peculiaridades do int() float() bool() e str(). Além disso, veremos como fazer as
# primeiras operações com a função print() do Python.
'''n1 = int(input('Digite um número: '))
n2 = int(input('Digite mais um número: '))
s = n1 + n2
print(f'A soma vale {s}')'''
'''
tipos:
int - números inteiros 1,2,3,-1,0 , etc
float - números de ponto flutuante 1.2 , 2.3, 4.2, -15.223, 7.0, etc
bool - True ou False
str - 'olá', '7.5', ''
'''
'''
n = bool(input('Digite um valor: '))
print(n)
# se não for digitado um valor ele irá sair False
# se for digitado ele irá sair True
'''
n = input('Digite algo: ')
print(n.isnumeric()) # diz se é um número ou se é possível converter este numero em "int"
print(n.isalpha()) # diz se é alphabetical ou se é possível que ele seja uma "str"
print(n.isalnum()) # diz se é alphanumerical se possui letra e números

#comandos is:
# isupper - verifica se a str esta em letras maiúsculas
#