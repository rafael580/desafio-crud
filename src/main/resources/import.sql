-- TABELA PESSOA
INSERT INTO pessoa (nome, cpf, data_nascimento) VALUES ('haru neves', '12345678911', DATE '1990-05-15');
INSERT INTO pessoa (nome, cpf, data_nascimento) VALUES ('Carlos Oliveira', '23456789112', DATE '1985-08-22');
INSERT INTO pessoa (nome, cpf, data_nascimento) VALUES ('Ana Rodrigues', '34567891123', DATE '1992-03-10');
INSERT INTO pessoa (nome, cpf, data_nascimento) VALUES ('Pedro Santos', '45678911234', DATE '1978-11-05');
INSERT INTO pessoa (nome, cpf, data_nascimento) VALUES ('Mariana Costa', '56789112345', DATE '1995-07-18');
INSERT INTO pessoa (nome, cpf, data_nascimento) VALUES ('Lucas Pereira', '67891123456', DATE '1982-09-30');


-- TABELA ENDERECO

-- Endereços para Haru Neves (id=1)
-- Endereços para Haru Neves (id=1)
INSERT INTO endereco (rua, numero, bairro, cidade, estado, cep, pessoa_id) VALUES ('Rua das Acácias', 123, 'Jardim Primavera', 'São Paulo', 'SP', '01234-567', 1);
INSERT INTO endereco (rua, numero, bairro, cidade, estado, cep, pessoa_id) VALUES ('Avenida Brasil', 456, 'Centro', 'São Paulo', 'SP', '01234-568', 1);

-- Endereços para Carlos Oliveira (id=2)
INSERT INTO endereco (rua, numero, bairro, cidade, estado, cep, pessoa_id) VALUES ('Rua das Flores', 789, 'Jardim América', 'Rio de Janeiro', 'RJ', '22345-678', 2);
INSERT INTO endereco (rua, numero, bairro, cidade, estado, cep, pessoa_id) VALUES ('Avenida Paulista', 1011, 'Bela Vista', 'São Paulo', 'SP', '01311-200', 2);
INSERT INTO endereco (rua, numero, bairro, cidade, estado, cep, pessoa_id) VALUES ('Rua XV de Novembro', 1213, 'Centro', 'Curitiba', 'PR', '80020-310', 2);

-- Endereços para Ana Rodrigues (id=3)
INSERT INTO endereco (rua, numero, bairro, cidade, estado, cep, pessoa_id) VALUES ('Rua das Palmeiras', 1415, 'Jardim Botânico', 'Belo Horizonte', 'MG', '30150-001', 3);
INSERT INTO endereco (rua, numero, bairro, cidade, estado, cep, pessoa_id) VALUES ('Avenida Afonso Pena', 1617, 'Centro', 'Belo Horizonte', 'MG', '30130-007', 3);

-- Endereços para Pedro Santos (id=4)
INSERT INTO endereco (rua, numero, bairro, cidade, estado, cep, pessoa_id) VALUES ('Rua da Praia', 1819, 'Beira Mar', 'Fortaleza', 'CE', '60165-000', 4);
INSERT INTO endereco (rua, numero, bairro, cidade, estado, cep, pessoa_id) VALUES ('Avenida Beira Mar', 2021, 'Meireles', 'Fortaleza', 'CE', '60170-000', 4);
INSERT INTO endereco (rua, numero, bairro, cidade, estado, cep, pessoa_id) VALUES ('Rua Ildefonso Albano', 2223, 'Aldeota', 'Fortaleza', 'CE', '60135-000', 4);

-- Endereços para Mariana Costa (id=5)
INSERT INTO endereco (rua, numero, bairro, cidade, estado, cep, pessoa_id) VALUES ('Rua das Orquídeas', 2425, 'Jardim Europa', 'Porto Alegre', 'RS', '90450-001', 5);
INSERT INTO endereco (rua, numero, bairro, cidade, estado, cep, pessoa_id) VALUES ('Avenida Farrapos', 2627, 'São João', 'Porto Alegre', 'RS', '90220-005', 5);

-- Endereços para Lucas Pereira (id=6)
INSERT INTO endereco (rua, numero, bairro, cidade, estado, cep, pessoa_id) VALUES ('Rua das Margaridas', 2829, 'Jardim das Flores', 'Salvador', 'BA', '40120-010', 6);
INSERT INTO endereco (rua, numero, bairro, cidade, estado, cep, pessoa_id) VALUES ('Avenida Sete de Setembro', 3031, 'Centro', 'Salvador', 'BA', '40060-001', 6);
INSERT INTO endereco (rua, numero, bairro, cidade, estado, cep, pessoa_id) VALUES ('Rua Chile', 3233, 'Centro', 'Salvador', 'BA', '40020-000', 6);


