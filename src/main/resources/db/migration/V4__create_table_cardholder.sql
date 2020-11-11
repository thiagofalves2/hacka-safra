CREATE TABLE hacka.tb_cardholder (
	id int8 NOT NULL,
	active bpchar(1) NULL,
	fullname varchar(110) NULL,
	email varchar(255) NULL,
	documenttype numeric(1) NULL,
	documentvalue varchar(14) NULL,
	address1 varchar(150) NULL,
	address2 varchar(150) NULL,
	city varchar(40) NULL,
	state varchar(2) NULL,
	zip varchar(10) NULL,
	CONSTRAINT cardholder_pkey PRIMARY KEY (id)
);