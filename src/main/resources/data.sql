INSERT INTO USUARIO(nome, email, senha) VALUES('Aluno', 'aluno@email.com', '123456');
INSERT INTO USUARIO(nome, email, senha) VALUES('Professosr', 'professor@email.com', '123456');

INSERT INTO RESTAURANTE(nome, categoria) VALUES('PIZZARIA DO LUID', 'pizza');
INSERT INTO RESTAURANTE(nome, categoria) VALUES('HAMBURGER DO MARIO', 'lanche');

INSERT INTO ITEM(nome) VALUES('PIZZA QUATRO QUEIJOS');
INSERT INTO ITEM(nome) VALUES('PIZZA NAPOLITANA');
INSERT INTO ITEM(nome) VALUES('HAMBURGUER DE CARNE');
INSERT INTO ITEM(nome) VALUES('HAMBURGUER DE FRANGO');


INSERT INTO PEDIDO(numero, item_id, mensagem, data_criacao, status, usuario_id, restaurante_id) VALUES('10001', 2, 'Sem Borda', '2021-04-19 18:00:00', 'ABERTO', 1, 1);
INSERT INTO PEDIDO(numero, item_id, mensagem, data_criacao, status, usuario_id, restaurante_id) VALUES('10002', 1, 'Sem Alho', '2021-04-19 19:00:00', 'ABERTO', 1, 1);
INSERT INTO PEDIDO(numero, item_id, mensagem, data_criacao, status, usuario_id, restaurante_id) VALUES('10003', 3, 'Mal Passado', '2021-04-19 20:00:00', 'ABERTO', 1, 2);
