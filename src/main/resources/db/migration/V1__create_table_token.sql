CREATE TABLE tb_token (
	iduser numeric(15) NULL,
	dt_send timestamp NULL,
	ds_token varchar(5) NULL,
	dt_validated timestamp NULL,
	CONSTRAINT tb_token_pk PRIMARY KEY (iduser),
	CONSTRAINT tb_token_fk FOREIGN KEY (iduser) REFERENCES tb_user(id)
);
