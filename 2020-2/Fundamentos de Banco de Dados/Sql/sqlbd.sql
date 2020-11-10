CREATE DATABASE teste_ddl;

CREATE TABLE departamentos(

    id int not null,
    nome char(35) not null
    valor_orcamento DECIMAL(12,2),
    PRIMARY KEY(id),

);

CREATE TABLE empregados(

    id int AUTO_INCREMENT not null, 
    matricula VARCHAR(50) not null,
    cpf VARCHAR(14),
    nome VARCHAR(50) not null,
    cargo VARCHAR(30) not null,
    salario decimal(18,2) default 0,
    sigla char(2),
    data_nascimento DATE,
    id_departamento int not null,
    primary key(id),

    CONSTRAINT esta_alocado
        FOREIGN KEY id_departamento
            REFERENCES departamentos(id)

);