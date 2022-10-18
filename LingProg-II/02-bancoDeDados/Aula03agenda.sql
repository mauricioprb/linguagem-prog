/*
Uma empresa necessita criar um banco um sistema para agendamento de reuniõe/compromissos entre os colaboradores, em
que estes podem reservar algumas salas da empresa, em determinado dia e horários, para a realização de reuniões internas do grupo

Nome das tabelas: Funcionario e Agendamento
Funcionario (ID, nome, email, cargo)
Agendamento (ID, fk_funcionario, data, hora, local, tipo (reunião, comemoração, etc).
*/

create database Aula03agenda;
-- Exibindo banco
show databases;
-- Colocando banco em uso
use Aula03agenda; 
create table Funcionario (
	ID int auto_increment primary key,
    nome varchar(50),
    email varchar(60) unique,
    cargo varchar(50)
);
-- Exibe infos da tabela criada
desc Funcionario;
-- Corrigir info de uma coluna da tabela
alter table Funcionario modify column email varchar(70);

create table Agendamento (
	ID int auto_increment primary key,
    ID_funcionario int,
    data date,
    hora time,
    local varchar(50),
    tipo_compromisso varchar(50)
	# foreign key (ID_funcionario) references Funcionario (ID)
);
-- Inserindo chave estrangeira na tabela criada
alter table Agendamento
add foreign key (ID_funcionario) references Funcionario (ID);

-- Cadastrar 5 funcionários no banco
insert into Funcionario (nome, email, cargo)
values ('Jose da Silva', 'jose@gmail.com', 'Diretor');
insert into Funcionario (nome, email, cargo)
values ('Juca Pires', 'juca@gmail.com', 'Gerente');
insert into Funcionario (nome, email, cargo)
values ('Jimba Oliveira', 'jimba@gmail.com', 'Supervisor');
insert into Funcionario (nome, email, cargo)
values ('Zeca Guedes', 'zeca@gmail.com', 'Faxineiro');
insert into Funcionario (nome, email, cargo)
values ('Valdeovaldo', 'valdeovaldo@gmail.com', 'Estagiário');

-- Recuperando cadastros da tabela funcionários
select *from Funcionario;
select nome, email from Funcionario where id = 4;

-- Agendar 5 compromissos data (aaaa-mm-dd), hora (hh:mm)
insert into Agendamento (ID_funcionario, data, hora, local, tipo_compromisso)
values ('1', '2022-10-20', '17:37', 'Sala 809', 'Reunião'); 
insert into Agendamento (ID_funcionario, data, hora, local, tipo_compromisso)
values ('1', '2022-10-22', '16:39', 'Sala 809', 'Reunião'); 
insert into Agendamento (ID_funcionario, data, hora, local, tipo_compromisso)
values ('3', '2022-10-24', '14:30', 'Sala 809', 'Reunião'); 
insert into Agendamento (ID_funcionario, data, hora, local, tipo_compromisso)
values ('4', '2022-10-25', '19:30', 'Sala 809', 'Reunião'); 
insert into Agendamento (ID_funcionario, data, hora, local, tipo_compromisso)
values ('5', '2022-10-27', '12:30', 'Sala 809', 'Reunião'); 

-- Verificando agendamentos realizados
select *from Agendamento;
-- Recuperar infos de funcionario que possuem agendamento
select nome, cargo from Funcionario, Agendamento
where Funcionario.ID = Agendamento.ID_funcionario;
select nome, cargo, data, hora, local from Funcionario, Agendamento
where Funcionario.ID = Agendamento.ID_funcionario;

-- Nome dos funcionários que reservaram a sala 809
select nome, local from Funcionario, Agendamento
where Funcionario.ID = Agendamento.ID_funcionario and Agendamento.local = 'Sala 809';
-- Quais são os funcionarios que possuem reserva as 14:30
select Funcionario.nome from Funcionario, Agendamento
where Funcionario.ID = Agendamento.ID_funcionario and Agendamento.hora = '14:30';
-- Quais salas e o nome dos funcionarios que possuem alguma reserva na data 2022-10-25
select Agendamento.local, Funcionario.nome from Funcionario, Agendamento
where Funcionario.ID = Agendamento.ID_funcionario and Agendamento.data = '2022-10-25';