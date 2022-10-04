/* 
Exercício

Crie um banco de dados chamado Aula01 que possua uma tabela chamada
Veículo. Essa tabela possui campos para: código de identificação (ID)
marca, modelo, cor, ano de fabricação, e valor (tipo de dado: REAL).

Assim, utilize a linguagem SQL para:
1 - Inserir 5 veículos na base de dados;
2 - Consultar os veículos cujo código > 3;
3 - Consultar o valor de todos os carros cadastrados;
4 - Consultar quais são  os veículos  da marca GM.
*/

CREATE database Aula01;
USE Aula01;
CREATE table Veiculo (
	ID int not null auto_increment primary key,
    marca varchar(50),
    modelo varchar(50),
    cor varchar(20),
    anoFab date,
    valor REAL
);
INSERT INTO Veiculo VALUES (NULL,'ford','fiesta','branco','2013-5-9', 23500.80),
	(NULL,'VW','fusca','preto','1967-6-7', 1000.78),
    (NULL,'GM','S10','cinza','2010-3-9', 200000.54),
    (NULL,'GM','corsa','preto','2000-8-1', 12200.78),
    (NULL,'VW','gol','branco','1967-4-9', 1000.78)
SELECT 