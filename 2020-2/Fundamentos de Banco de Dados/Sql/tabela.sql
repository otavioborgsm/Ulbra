CREATE DATABASE escola_fdb;
CREATE TABLE aluno(

    id int AUTO_INCREMENT,
    nome VARCHAR(50) not null,

    PRIMARY KEY (id)
);

CREATE TABLE departamento(

    id int AUTO_INCREMENT,
    nome VARCHAR(50) not null,

    PRIMARY KEY (id)

);

CREATE TABLE curso(

    id int AUTO_INCREMENT,
    nome VARCHAR(50) not null,
    id_departamento int not null,

    PRIMARY KEY (id),

    CONSTRAINT pertence_ao_depto
        FOREIGN KEY (id_departamento)
            REFERENCES departamentos(id)
    
);

CREATE TABLE professor(

    id int AUTO_INCREMENT,
    nome VARCHAR(50) not null,

    PRIMARY KEY (id)
 
);

CREATE TABLE disciplina(

    id int AUTO_INCREMENT
    nome VARCHAR(30) not null,
    id_professor int not null,

    PRIMARY KEY (id),

    CONSTRAINT eh_data_por_professor
        FOREIGN KEY (id_professor)
            REFERENCES professor(id)
);

CREATE TABLE matricula(

    id_professor
    id_disciplina
    
);