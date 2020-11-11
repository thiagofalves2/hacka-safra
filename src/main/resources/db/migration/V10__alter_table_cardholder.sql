ALTER TABLE hacka.tb_token DROP CONSTRAINT tb_token_fk;
ALTER TABLE hacka.tb_cardholder ALTER COLUMN id TYPE int8 USING id::int8;
ALTER TABLE hacka.tb_token RENAME COLUMN iduser TO cardholder;
