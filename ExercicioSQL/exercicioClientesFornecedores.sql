create database EmpresaDeCredito
use EmpresaDeCredito

create table Clientes(
	ClienteId int primary key identity(1,1),
	Nome varchar(50),
	DataNascimento varchar(50),
	CPF bigint,
	RG bigint,
	CEP int,
	Telefone varchar(50),
	Email varchar(50)
)

insert into Clientes values('Luan Braz', '06/11/1995', 84465714698, 789148972, 14458796,  '(12) 97070-7070', 'luan@email.com')
insert into Clientes values('João da Silva', '05/1/1985', 78945789785, 458971456, 14587965, '(12) 98080-7070', 'joao@email.com')

select * from Clientes

create table Fornecedor(
	FornecedorId int primary key identity(1,1),
	NomeFornecedor varchar(50),
	CEP int,
	CNPJ bigint,
	Telefone varchar(50),
	Email varchar(50)
)

insert into Fornecedor values('Mercadinho Brasil', 47898789, 45789878945, '(12) 99999-9999', 'mb@email.com')
insert into Fornecedor values('Mercadinho EUA', 44444444, 47898748789, '(12) 8999-9999', 'meua@email.com')

select * from Fornecedor