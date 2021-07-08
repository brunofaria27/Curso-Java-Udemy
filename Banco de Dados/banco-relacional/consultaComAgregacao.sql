SELECT
    regiao AS 'Região',
    sum(populacao) AS total
FROM `estados`
GROUP BY regiao
ORDER BY total DESC

SELECT
    sum(populacao) AS total
FROM estados

SELECT
    avg(populacao) AS total -- Média soma de todas dividido pelo numero de linhas
FROM estados