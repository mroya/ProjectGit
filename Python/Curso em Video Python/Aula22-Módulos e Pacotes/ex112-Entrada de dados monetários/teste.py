# Exercício Python 112: Dentro do pacote utilidadesCeV que criamos no desafio 111, temos um módulo
# chamado dado. Crie uma função chamada leiaDinheiro() que seja capaz de funcionar como a função
# imputa(), mas com uma validação de dados para aceitar apenas valores que seja monetários.
from ex112.utilidadesCeV import moeda
from ex112.utilidadesCeV import dado


valor = dado.leiadinheiro('Digite um preço R$ ')
moeda.resumo(valor, 80, 35)
