UPDATE estados
SET nome = 'Maranhão' WHERE sigla = 'MA'

SELECT nome FROM estados WHERE sigla = 'MA'



UPDATE estados
SET nome = 'Paraná',
    populacao = 11.31
WHERE sigla = 'PR'

SELECT nome, sigla, populacao FROM estados WHERE sigla = 'PR'