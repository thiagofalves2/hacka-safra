CREATE SCHEMA IF NOT EXISTS hacka;

CREATE TABLE tb_user (
id numeric(15) not null,
full_name varchar(255) not null,
ds_email varchar(255) not null,
ds_document varchar(14) not null,
nu_cel_phone varchar(20) not null,
dt_last_login timestamp,
dt_block timestamp,
primary key (id),
constraint uk_nu_cel_phone unique (nu_cel_phone)
);
create sequence seq_id_user increment 1 minvalue 0 maxvalue 999999999999999 start 0 no cycle;
