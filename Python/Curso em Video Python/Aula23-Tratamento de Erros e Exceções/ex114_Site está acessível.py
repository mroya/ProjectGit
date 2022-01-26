# Crie um programa que teste se o site pudim está acessível pelo computador usado.
from urllib import error
import urllib.request

site = str(input('Digite o site que queres acessar: '))
if site not in 'http://':
    site = f'http://{site}'
try:
    conf = urllib.request.urlopen(f'{site}')
except urllib.error.URLError:
    print(f'O site {site} não está online!')
else:
    print(f'Site {site} está online!')
