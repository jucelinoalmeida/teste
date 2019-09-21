create database controleuser;
use controleuser;
CREATE TABLE usuario (
id BIGINT(10) AUTO_INCREMENT,
cpf VARCHAR(11),
nome VARCHAR(80),
email VARCHAR(255),
codcargo VARCHAR(10),
codorgao VARCHAR(10),
PRIMARY KEY (id) );


CREATE TABLE cargo(
id BIGINT(10) AUTO_INCREMENT,
codcargo VARCHAR(10),
nomecargo VARCHAR(50),
PRIMARY KEY (id) );


CREATE TABLE orgao(
id BIGINT(10) AUTO_INCREMENT,
codorgao VARCHAR(10),
nomeorgao VARCHAR(50),
PRIMARY KEY (id) );

CREATE TABLE sistema(
id BIGINT(10) AUTO_INCREMENT,
sistema VARCHAR(10),
cpf VARCHAR(11),
PRIMARY KEY (id) );