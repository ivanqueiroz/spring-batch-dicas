DROP TABLE pessoa IF EXISTS;

CREATE TABLE pessoa
(
    id_pessoa  int(11) NOT NULL AUTO_INCREMENT,
    primeiro_nome VARCHAR(20),
    ultimo_nome  VARCHAR(20)
);
