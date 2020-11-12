ALTER TABLE hacka.tb_authorization DROP CONSTRAINT tb_authorization_fk;
ALTER TABLE hacka.tb_authorization ADD CONSTRAINT tb_authorization_fk FOREIGN KEY (card) REFERENCES hacka.tb_card(id);