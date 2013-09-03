DROP DATABASE IF EXISTS projeto;
CREATE DATABASE projeto;
USE projeto;


CREATE TABLE Pessoa ( 
  id int PRIMARY KEY NOT NULL AUTO_INCREMENT,
  nome varchar(100) NOT NULL,
  saldo double ,
  senha varchar(20) NOT NULL,
  email varchar(50))
ENGINE = InnoDB;

CREATE TABLE Aluno( 
ra int NOT NULL
)
ENGINE = InnoDB;

CREATE TABLE Professor ( 
siape int NOT NULL
)
ENGINE = InnoDB;

CREATE TABLE Funcionario( 
siape int NOT NULL
)
ENGINE = InnoDB;


select * from Pessoa