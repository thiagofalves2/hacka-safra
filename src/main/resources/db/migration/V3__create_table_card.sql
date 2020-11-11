CREATE TABLE hacka.tb_card (
	id int8 NOT NULL,
	pan varchar(19) NULL,
	state int4 NOT NULL,
	startdate date NULL,
	enddate date NULL,
	cardholder int8 NULL,
	smart bpchar(1) NULL DEFAULT 'N'::bpchar,
	virtual bpchar(1) NULL DEFAULT 'N'::bpchar,
	CONSTRAINT card_pkey PRIMARY KEY (id)
);