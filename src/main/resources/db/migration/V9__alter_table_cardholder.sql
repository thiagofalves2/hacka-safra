ALTER TABLE hacka.tb_cardholder ADD tp_document numeric NULL;
ALTER TABLE hacka.tb_cardholder ADD CONSTRAINT tb_cardholder_un UNIQUE (ds_document);
