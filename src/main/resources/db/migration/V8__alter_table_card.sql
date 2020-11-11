ALTER TABLE hacka.tb_card ADD CONSTRAINT tb_card_fk FOREIGN KEY (cardholder) REFERENCES hacka.tb_cardholder(id);
