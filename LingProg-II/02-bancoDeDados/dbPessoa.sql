-- Criando base de dados
CREATE database aulaDB;
-- Selecionar para o uso o banco utilizado 
USE aulaDB;
-- Exibir as tabelas existentes no banco
SHOW tables;
-- Criar uma tabela no banco
CREATE table Pessoa (
	ID int not null auto_increment primary key,
    Nome varchar(50),
    Email varchar(60) unique,
    DataNascimento date, 
    Matricula int unique
);
-- Mostrar descritivo da tabela
DESC Pessoa;
-- Inserir campo na tabela
ALTER table Pessoa add Cidade varchar(30) after Email;
-- Inserir registros na tabela
INSERT INTO Pessoa VALUES (NULL,'Mauricio','mauprb@gmail.com','Santa Maria','2002-3-5','9875643');
-- Consultar todos dados da tabela
SELECT * FROM Pessoa;
-- Consulta customizada
SELECT Nome, Cidade FROM Pessoa;
SELECT Nome FROM Pessoa WHERE id = 3;