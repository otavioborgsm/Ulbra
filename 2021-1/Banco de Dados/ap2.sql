create schema AP2_BD;
use AP2_BD;

SET SQL_SAFE_UPDATES = 0;

create table centros_custos(
	id int not null auto_increment primary key,
    nome varchar(50) not null,
    endereco varchar(200) not null,
    cidade varchar(50) not null,
    status_obra varchar(50) not null
);

insert into centros_custos(nome, endereco, cidade, status_obra)
	  values('casa itapeva','rua sao marcos','torres','andamento'),
			('pousada serra','estrada geral','praia grande','andamento'),
			('edificio reserva','rua joão velinho','passo de torres','andamento');
            
create table cargos(
	id int not null auto_increment primary key,
    descricao varchar(50) not null
);

insert into cargos(descricao)
	  values('almoxarife'),
			('mestre de orbra'),
			('servente'),
            ('pedreiro'),
            ('compras');

create table funcionarios(
	id int not null auto_increment primary key,
    nome varchar(50) not null,
    telefone int not null,
    cpf char(11) unique not null,
    id_cargo int not null,
	CONSTRAINT funcionario_cargo
        FOREIGN KEY (id_cargo)
            REFERENCES cargos(id)
            on update cascade on delete restrict
);

insert into funcionarios(nome, telefone, cpf, id_cargo)
	  values('pedro',982663428,03291003004,1),
			('joao',985673228,03291003664,1),
            ('fernando',992683728,03291003544,1),
            ('roberto',999453438,03291003034,5),
            ('paulo',982484798,03291003015,2),
            ('otavio',982673498,03291003016,2),
            ('gabriel',982843498,03291003017,2),
            ('bernardo',982873498,03291003213,4),
            ('mateus',987633498,03291004512,4),
            ('diego',982433438,03291004912,4),
            ('henrique',982432498,03291023412,3),
            ('bruno',982412498,02341003012,3),
            ('daniel',982431098,03293453012,3);

create table almoxarifes(
	id int not null auto_increment primary key,
    nome varchar(50) not null,
    telefone int not null,
    cpf char(11) unique not null
);

insert into almoxarifes(nome, telefone, cpf)
	  values('pedro',982663428,03291003004),
			('joao',985673228,03291003664),
            ('fernando',992683728,03291003544);
            
create table saidas(
	id int not null auto_increment primary key,
    comentario varchar(200) default null,
    data_movimento date not null,
    id_centro_custo int not null,
    id_funcionario int not null,
    id_almoxarife int not null,
	CONSTRAINT saida_centro_custo
        FOREIGN KEY (id_centro_custo)
            REFERENCES centros_custos(id)
            on update cascade on delete restrict,
	CONSTRAINT saida_funcionario
        FOREIGN KEY (id_funcionario)
            REFERENCES funcionarios(id)
            on update cascade on delete restrict,
	CONSTRAINT saida_almoxarife
        FOREIGN KEY (id_almoxarife)
            REFERENCES almoxarifes(id)
            on update cascade on delete restrict
);

insert into saidas(data_movimento,id_centro_custo,id_funcionario,id_almoxarife)
	  values('2021-10-8',1,10,1),
			('2021-06-17',2,12,2),
            ('2020-07-12',3,9,3);

create table transferencias(
	id int not null auto_increment primary key,
    comentario varchar(200) default null,
    data_movimento date not null,
    id_centro_custo int not null,
	id_centro_custo_destino int not null,
    id_almoxarife int not null,
	id_almoxarife_destino int null,
	CONSTRAINT tranferencia_centro_custo
        FOREIGN KEY (id_centro_custo)
            REFERENCES centros_custos(id)
            on update cascade on delete restrict,
	CONSTRAINT tranferencia_centro_custo_destino
        FOREIGN KEY (id_centro_custo_destino)
            REFERENCES centros_custos(id)
            on update cascade on delete restrict,
	CONSTRAINT tranferencia_almoxarife
        FOREIGN KEY (id_almoxarife)
            REFERENCES almoxarifes(id)
            on update cascade on delete restrict,
	CONSTRAINT tranferencia_almoxarife_destino
        FOREIGN KEY (id_almoxarife_destino)
            REFERENCES almoxarifes(id)
            on update cascade on delete restrict
);

insert into transferencias(data_movimento,id_centro_custo,id_centro_custo_destino,id_almoxarife,id_almoxarife_destino)
	  values('2021-04-8',3,1,3,1),
			('2021-04-17',3,2,3,2),
            ('2021-04-12',3,2,3,2);

create table fornecedores(
	id int not null auto_increment primary key,
    nome varchar(50) not null,
    endereco varchar(200) not null,
    cidade varchar(50) not null,
    cnpj char(14) unique not null
);

insert into fornecedores(nome,endereco,cidade,cnpj)
	  values('casa das pedras','avenida padre reus','portao',12536542375698),
			('madereira silva','avenida padre reus','passo de torres',12536542375632),
            ('bomagg redemac','avenida castelo branco','torres',12536542375610);

create table contas_pagar(
	id int not null auto_increment primary key,
    codigo_doc varchar(50) not null,
    data_doc date not null,
    data_vencimento date not null,
    valor decimal (12,2) not null,
    id_fornecedor int not null,
	CONSTRAINT contas_pagar_fornecedor
        FOREIGN KEY (id_fornecedor)
            REFERENCES fornecedores(id)
            on update cascade on delete restrict
  );
  
  insert into contas_pagar(codigo_doc,data_doc,data_vencimento,valor,id_fornecedor)
	  values('102030','2020-10-20','2020-11-20',1000.00,1),
			('102040','2020-05-20','2020-06-20',1250.00,2),
            ('102050','2020-09-20','2020-10-20',860.00,3);
            
create table nf_entradas(
	id int not null auto_increment primary key,
    data_emissao date not null,
    data_entrada date not null,
    quant_total_produtos int not null,
    valor decimal (12,2) not null,
    volumes int not null,
    id_fornecedor int not null,
	id_centro_custo int not null,
	CONSTRAINT nf_entrada_fornecedor
        FOREIGN KEY (id_fornecedor)
            REFERENCES fornecedores(id)
            on update cascade on delete restrict,
	CONSTRAINT nf_entrada_centro_custo
        FOREIGN KEY (id_centro_custo)
            REFERENCES centros_custos(id)
            on update cascade on delete restrict
);

insert into nf_entradas(data_emissao,data_entrada,quant_total_produtos,valor,volumes,id_fornecedor,id_centro_custo)
	  values('2020-10-20','2020-10-25',1,1000.00,2,1,1),
			('2020-05-20','2020-05-25',2,1250.00,7,2,2),
            ('2020-09-20','2020-09-25',1,860.00,28,3,3);

create table categorias_produtos(
	id int not null auto_increment primary key,
    nome varchar(50) not null
);

insert into categorias_produtos(nome)
	  values('cimento'),
			('tijolo'),
			('ferro'),
			('areia');

create table produtos(
	id int not null auto_increment primary key,
    nome varchar(50) not null,
    valor decimal (12,2) default 0,
    id_categoria int not null,
	CONSTRAINT produto_categoria
        FOREIGN KEY (id_categoria)
            REFERENCES categorias_produtos(id)
            on update cascade on delete restrict
);

insert into produtos(nome,valor,id_categoria)
	  values('tijolo 6 furo',2.00,2),
			('cimento 20kg',50.00,1),
            ('ferro 8',30.00,3),
            ('areia reboco',500.00,4);

create table pro_notas(
	id int not null auto_increment primary key,
    quant_produto int not null,
	id_produto int not null,
	id_nf_entrada int not null,
	CONSTRAINT pro_nota_produto
        FOREIGN KEY (id_produto)
            REFERENCES produtos(id)
            on update cascade on delete restrict,
	CONSTRAINT pro_notas_nf_entrada
        FOREIGN KEY (id_nf_entrada)
            REFERENCES nf_entradas(id)
            on update cascade on delete restrict
);

insert into pro_notas(quant_produto,id_produto,id_nf_entrada)
	  values(2,4,1),
			(2,4,2),
            (5,2,2),
            (28,3,3);

create table pro_centros_custos(
	id int not null auto_increment primary key,
    quant_produto int not null,
	id_produto int not null,
	id_centro_custo int not null,
	CONSTRAINT pro_centro_custo_produto
        FOREIGN KEY (id_produto)
            REFERENCES produtos(id)
            on update cascade on delete restrict,
	CONSTRAINT pro_centro_custo_centro_custo
        FOREIGN KEY (id_centro_custo)
            REFERENCES centros_custos(id)
            on update cascade on delete restrict
);

insert into pro_centros_custos(quant_produto,id_produto,id_centro_custo)
	  values(2,4,1),
			(2,4,2),
            (5,2,2),
            (28,3,3);

create table pro_mov_saidas(
	id int not null auto_increment primary key,
    quant_produto int not null,
	id_produto int not null,
	id_saida int not null,
	CONSTRAINT pro_mov_saida_produto
        FOREIGN KEY (id_produto)
            REFERENCES produtos(id)
            on update cascade on delete restrict,
	CONSTRAINT pro_mov_saida_saida
        FOREIGN KEY (id_saida)
            REFERENCES saidas(id)
            on update cascade on delete restrict
);

insert into pro_mov_saidas(quant_produto,id_produto,id_saida)
	  values(1,4,1),
			(2,2,2),
            (1,4,2),
            (5,4,3);

create table pro_mov_transferencias(
	id int not null auto_increment primary key,
    quant_produto int not null,
	id_produto int not null,
	id_tranferencia int not null,
	CONSTRAINT pro_mov_tranferencia_produto
        FOREIGN KEY (id_produto)
            REFERENCES produtos(id)
            on update cascade on delete restrict,
	CONSTRAINT pro_mov_tranferencia_tranferencia
        FOREIGN KEY (id_tranferencia)
            REFERENCES transferencias(id)
            on update cascade on delete restrict
);

insert into pro_mov_tranferencias(quant_produto,id_produto,id_tranferencia)
	  values(3,3,1),
			(5,3,2),
            (10,3,3);


create view produtos_cadastrados
as
select produtos.nome as produto,  produtos.valor as valor_produto, categorias_produtos.nome as categoria
	from produtos inner join categorias_produtos on categorias_produtos.id = produtos.id_categoria
    order by produto;

SELECT * FROM ap2_bd.produtos_cadastrados;

create view relatorio_saida
as
select saidas.data_movimento as data_saida,  pro_mov_saidas.quant_produto as quantidade, 
	   produtos.nome as produto, centros_custos.nome as centro_custo
	from centros_custos inner join saidas on centros_custos.id = saidas.id_centro_custo
					   inner join pro_mov_saidas on pro_mov_saidas.id_saida = saidas.id 
					   inner join produtos on pro_mov_saidas.id_produto = produtos.id
    order by produto;

SELECT * FROM ap2_bd.relatorio_saida;

create view consulta_estoque
as
select pro_centros_custos.quant_produto as quantidade, produtos.nome as produto, centros_custos.nome as centro_custo, 
centros_custos.status_obra, centros_custos.cidade 
	from centros_custos inner join pro_centros_custos on centros_custos.id = pro_centros_custos.id_centro_custo
					   inner join produtos on pro_centros_custos.id_produto = produtos.id
    order by produto;

SELECT * FROM ap2_bd.consulta_estoque;

DELIMITER $$
CREATE PROCEDURE insert_produtos(p_nome varchar(50), p_valor decimal (12,2), p_id_categoria int)
BEGIN
	
    insert into produtos (nome, valor, id_categoria)
		values (p_nome, p_valor, p_id_categoria);
        
	select id, nome, valor, id_categoria, 'DADO INSERIDO' as status
    from	produtos
    order by id desc
    limit 1;
	
END $$
DELIMITER ;

call insert_produtos ('tijolo 9 furos', 6.00,2);

DELIMITER $$
CREATE PROCEDURE update_funcionarios(p_id int, p_nome varchar(50), p_telefone int, p_cpf char(11), p_id_cargo int)
BEGIN
	
	update funcionarios set nome=p_nome, telefone=p_telefone, cpf=p_cpf, id_cargo=p_id_cargo
	where id = p_id;
        
	select id, nome, telefone, cpf, id_cargo, 'DADO ALTERADO' as status
    from	funcionarios
    where id = p_id;
	
END $$
DELIMITER ;

call update_funcionarios (9,'mateus', 966611111,'3291004512',4);


DELIMITER $$
CREATE PROCEDURE almoxarife_destino(p_id int, p_id_almoxarife_destino int)
BEGIN
	
	update transferencias set id_almoxarife_destino = p_id_almoxarife_destino
	where id = p_id;
        
	select id_almoxarife_destino, 'ALMOXARIFE ATUALIZADO' as status
    from transferencias
    where id = p_id;
	
END $$
DELIMITER ;


call almoxarife_destino (1,3);


DELIMITER $$
CREATE PROCEDURE crud_centros_custo(p_oper char(1), p_nome varchar(50), p_endereco varchar(200), p_cidade varchar(50), p_status_obra varchar(50))
BEGIN
	
	IF(p_oper = 'I') THEN
    
		insert into centros_custos (nome, endereco, cidade, status_obra)
			values (p_nome, p_endereco, p_cidade, p_status_obra);
		
        select id, nome, endereco, cidade, status_obra, 'CENTRO DE CUSTO ADD' as status
        from	centros_custos 
		order by id desc
		limit 1;	
		
	ELSEIF(p_oper = 'U') THEN
		update centros_custos set nome = p_nome, endereco = p_endereco, cidade = p_cidade, status_obra = p_status_obra 
        where nome = p_nome;
        
        select id, nome, endereco, cidade, status_obra, 'CENTRO DE CUSTO ATUALIZADO' as status
        from	centros_custos 
		order by id desc
		limit 1;
        
	ELSE
		select 'use: I para inserir e U para atualizar' as status;
        
	END IF;

END $$
DELIMITER ;

call crud_centros_custo ('I','geminado da lagoa','barao rio branco','torres','andamento');
call crud_centros_custo ('U','geminado da lagoa','joaquim porto','torres','andamento');

-- Atualizar tabela pro_centros_custos quando acontece uma saida
DELIMITER $$
	CREATE TRIGGER atualiza_quantidade_estoque
		after insert on  pro_mov_saidas
			for each row
begin
	DECLARE centroDeCustoSaida int;
	set centroDeCustoSaida = id_centro_custo.saidas;
    
	update pro_centros_custos set quant_produto = quant_produto - new.quant_produto
       
	where new.id_saida = id.saidas and id_centro_custo = centroDeCustoSaida; 
end $$
drop trigger atualiza_quantidade_estoque;

insert into pro_mov_saidas(quant_produto,id_produto,id_saida)
	  values (5,4,3);
-- select * from  cargos;
-- select * from  funcionarios;
-- select * from  almoxarifes;
-- select * from  fornecedores;
-- select * from  contas_pagar;
-- select * from  categorias_produtos;
 select * from  saidas;
 -- select * from  pro_notas;
 -- select * from  nf_entradas;
select * from  centros_custos;
-- select * from  produtos;
 select * from  pro_centros_custos;
 select * from  pro_mov_saidas;
select * from  saidas;
-- select * from  centros_custos;
-- select * from  pro_mov_transferencias;
-- select * from  transferencias;
-- select * from  produtos;