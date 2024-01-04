create table if not exists client
(
    id                 bigint not null
        constraint client_pkey
            primary key,
    created_by         varchar(255),
    created_date        timestamp,
    last_modified_date timestamp,
    updated_by         varchar(255),
    first_name         varchar(255),
    full_name          varchar(255),
    gender             integer,
    last_name          varchar(255),
    surname            varchar(255)
);

alter table client
    owner to crm;

create table if not exists client_order
(
    id                 bigserial not null
        constraint client_order_pkey
            primary key,
    created_by         varchar(255),
    created_date       timestamp,
    last_modified_date timestamp,
    updated_by         varchar(255),
    count              integer,
    order_state        varchar(255),
    client_id          bigint
        constraint fkcggjtc9f3otuprl7takbttwuk
            references client
);

alter table client_order
    owner to crm;

create table if not exists contact_type
(
    id                 bigint not null
        constraint contact_type_pkey
            primary key,
    created_by         varchar(255),
    created_date       timestamp,
    last_modified_date timestamp,
    updated_by         varchar(255),
    active             boolean,
    type_name          varchar(255)
);

alter table contact_type
    owner to crm;

create table if not exists contact
(
    id                 bigserial not null
        constraint contact_pkey
            primary key,
    created_by         varchar(255),
    created_date       timestamp,
    last_modified_date timestamp,
    updated_by         varchar(255),
    active             boolean,
    contact            varchar(255),
    contact_type_id    bigint
        constraint fk6dfda2c1owl8p09s48oeqsevo
            references contact_type,
    client_id          bigint
        constraint fkt0lxtgfimywi23cewqbmgdu62
            references client
);

alter table contact
    owner to crm;

create table if not exists region
(
    id                 bigint not null
        constraint region_pkey
            primary key,
    created_by         varchar(255),
    created_date       timestamp,
    last_modified_date timestamp,
    updated_by         varchar(255),
    region_code        integer,
    region_name        varchar(255)
);

alter table region
    owner to crm;

create table if not exists address
(
    id                 bigserial not null
        constraint address_pkey
            primary key,
    created_by         varchar(255),
    created_date       timestamp,
    last_modified_date timestamp,
    updated_by         varchar(255),
    full_address       varchar(255),
    house              varchar(255),
    street             varchar(255),
    region_id          bigint
        constraint fk4ljdc68rnke4txup1jlf1il4l
            references region,
    client_id          bigint
        constraint fk7156ty2o5atyuy9f6kuup9dna
            references client
);

alter table address
    owner to crm;

