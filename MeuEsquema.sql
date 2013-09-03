
    create table Categoria (
        id integer not null auto_increment,
        RA integer,
        SIAPE integer,
        cargo varchar(100),
        primary key (id)
    )

    create table Compra (
        id integer not null auto_increment,
        dataCompra date,
        refeicao float not null,
        pessoa_id integer,
        primary key (id)
    )

    create table Pessoa (
        id integer not null auto_increment,
        email varchar(100),
        nome varchar(100),
        saldo varchar(100),
        senha varchar(100),
        categoria_id integer,
        primary key (id)
    )

    create table Produto (
        codigo bigint not null auto_increment,
        especificacoes varchar(100),
        habilitadoVendas bit not null,
        nome varchar(100),
        precoCusto float,
        precoVenda float,
        primary key (codigo)
    )

    create table Produto_Compra (
        Produtos_codigo bigint not null,
        compras_id integer not null,
        primary key (Produtos_codigo, compras_id)
    )

    alter table Compra 
        add index FK78A4219E44F41207 (pessoa_id), 
        add constraint FK78A4219E44F41207 
        foreign key (pessoa_id) 
        references Pessoa (id)

    alter table Pessoa 
        add index FK8E48FBC7B46700D (categoria_id), 
        add constraint FK8E48FBC7B46700D 
        foreign key (categoria_id) 
        references Categoria (id)

    alter table Produto_Compra 
        add index FK444E01C4331D5CCA (Produtos_codigo), 
        add constraint FK444E01C4331D5CCA 
        foreign key (Produtos_codigo) 
        references Produto (codigo)

    alter table Produto_Compra 
        add index FK444E01C4B1564A10 (compras_id), 
        add constraint FK444E01C4B1564A10 
        foreign key (compras_id) 
        references Compra (id)
