# Cores no terminal
# Nessa aula, vamos aprender como utilizar os códigos de escape sequence ANSI para
# configurar cores para os seus programas em Python. Veja como utilizar o código
# \033[m com todas as suas principais possibilidades.
# ANSI - Escape sequence \033[m

# \033[ESTILO;COR DO TEXTO; COR DE FUNDO

# Estilos
# 0 (nome) sem cor
# 1 (old) Negrito
# 4 (underline) Sublinhado
# 7 (Negative) Inverte Letra e Fundo

# Cor Texto

print('\033[30mOlá Mundo!') # Preto
print('\033[31mOlá Mundo!') # vermelho
print('\033[32mOlá Mundo!') # verde
print('\033[33mOlá Mundo!') # amarelo
print('\033[34mOlá Mundo!') # azul
print('\033[35mOlá Mundo!') # magenta
print('\033[36mOlá Mundo!') # Cyan (azul claro)
print('\033[37mOlá Mundo!') # Cinza
print('\033[38mOlá Mundo!\033[m') # Branco

# Cor Fundo

print('\033[0;31;40mOlá Mundo!') # Fundo Preto
print('\033[0;32;41mOlá Mundo!') # Fundo Vermelho
print('\033[0;31;42mOlá Mundo!') # Fundo Verde
print('\033[0;31;43mOlá Mundo!') # Fundo Amarelo
print('\033[0;31;44mOlá Mundo!') # Fundo Azul
print('\033[0;31;45mOlá Mundo!') # Fundo Magenta
print('\033[0;31;46mOlá Mundo!') # Fundo Cyan (azul claro)
print('\033[0;31;47mOlá Mundo!') # Fundo Cinza

