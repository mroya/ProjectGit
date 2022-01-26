# Funções em python São rotinas no programa
# Exemplo:
'''def mostralinha():
    print('-'*30)


mostralinha()
print('         Curso em Vídeo           ')
mostralinha()
print('         Aprenda Python        ')
mostralinha()'''

# Outro exemplo:
'''def título(txt):
    print('-'*30)
    print(txt)
    print('-'*30)


título('        Curso em Vídeo      ')
título('        Aprenda Python      ')'''
'''# Programa principal
def soma(a, b):
    print(f'A = {a} e B = {b}')
    s = a + b
    print(f'A soma A + b = {s}')


soma(4, 5)
soma(8, 9)
soma(2, 1)'''
# Empacotamento é o asterisco que tem
'''def contador(*num):
    for valor in num:
        print(f'{valor}', end=' ')
    print('Fim!')


contador(2, 1, 7)
contador(8, 0)
contador(4, 5, 6, 7, 8)'''

'''def contador(*num):
    tam = len(num)
    print(f'Recebi os valores {num} e são ao todo {tam} números.')


contador(2, 1, 7)
contador(8, 0)
contador(4, 5, 6, 7, 8)'''

# Empacotamento com lista
'''def dobra(lst):
    pos = 0
    while pos < len(lst):
        lst[pos] *= 2
        pos += 1


valores = [7, 2, 5, 0, 4]
dobra(valores)
print(valores)'''

# Desempacotamento
'''def soma(* valores):
    s = 0
    for num in valores:
      s += num
    print(f'Somando os valores {valores} temos {s}')


soma(5, 2)
soma(2, 9, 4)'''

