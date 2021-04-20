INSERT INTO USUARIO(nome, email, senha) VALUES('Aluno', 'aluno@email.com', '123456');

INSERT INTO RESTAURANTE(nome, categoria) VALUES('PIZZARIA DO LUID', 'pizza');
INSERT INTO RESTAURANTE(nome, categoria) VALUES('HAMBURGER DO MARIO', 'lanche');

INSERT INTO PEDIDO(titulo, mensagem, data_criacao, status, autor_id, restaurante_id) VALUES('Pedido 1', 'Sem Cebola', '2021-04-19 18:00:00', 'ABERTO', 1, 1);
INSERT INTO PEDIDO(titulo, mensagem, data_criacao, status, autor_id, restaurante_id) VALUES('Pedido 2', 'Sem Alho', '2021-04-19 19:00:00', 'ABERTO', 1, 1);
INSERT INTO PEDIDO(titulo, mensagem, data_criacao, status, autor_id, restaurante_id) VALUES('Pedido 3', 'Mal Passado', '2021-04-19 20:00:00', 'ABERTO', 1, 2);
