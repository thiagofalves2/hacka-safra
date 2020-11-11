CREATE TABLE hacka.tb_authorization (
	id int8 NOT NULL,
	merchant_id varchar(15) NULL,
	terminal_id varchar(16) NULL,
	nsu bpchar(12) NULL,
	rrn varchar(20) NULL,
	ca_name varchar(255) NULL,
	ca_city varchar(255) NULL,
	ca_region varchar(255) NULL,
	ca_country varchar(255) NULL,
	ca_address varchar(255) NULL,
	ca_postalcode varchar(255) NULL,
	mcc varchar(4) NULL,
	responsecode varchar(4) NULL,
	approvalnumber varchar(6) NULL,
	displaymessage varchar(99) NULL,
	"date" timestamp NULL,
	transmissiondate timestamp NULL,
	localtransactiondate timestamp NULL,
	mti varchar(16) NULL,
	currencycode varchar(5) NULL,
	amount numeric(14,2) NULL DEFAULT 0,
	cardholder int8 NULL,
	card int8 NULL,
	CONSTRAINT tranlog_pkey PRIMARY KEY (id)
);