INSERT INTO empresas
    (nome, cnpj)
VALUES
    ('Bradesco', 99645123467854),
    ('Vale', 64521342654216),
    ('Cielo', 34512465434216);

ALTER TABLE empresas MODIFY cnpj VARCHAR(20);

DESC empresas;
DESC prefeitos;
SELECT * FROM empresas;
SELECT * FROM cidades;

INSERT INTO empresas_unidades
    (empresa_id, cidade_id, sede)
VALUES
    (1, 1, 1),
    (1, 2, 0),
    (2, 1, 0),
    (2, 2, 1)