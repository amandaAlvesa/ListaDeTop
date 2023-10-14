INSERT INTO tb_produto_list (name) VALUES ('Top Cores');
INSERT INTO tb_produto_list (name) VALUES ('Top Comida');
INSERT INTO tb_produto_list (name) VALUES ('Top Nomes');


INSERT INTO tb_produto (name, description, image) VALUES ('Preto','Cor que Combina com Tudo' , 'https://imagepng.org/wp-content/uploads/2017/10/quadrado-preto.png');
INSERT INTO tb_produto (name, description, image) VALUES ('Vermelho','Cor que Combina com Tudo' , 'https://greenpng.com/wp-content/uploads/2020/06/Fundo-vermelho-tom-vermelho-escuro-tijolo-fogo-768x768.png');
INSERT INTO tb_produto (name, description, image) VALUES ('Roxo','Cor que Combina com Tudo' , 'https://greenpng.com/wp-content/uploads/2020/07/untitleddesign_1_original-14-300x300.png');
INSERT INTO tb_produto (name, description, image) VALUES ('Cinza Escuro','Cor que Combina com Tudo' , 'https://greenpng.com/wp-content/uploads/2020/06/untitleddesign_1_original-103.png');
INSERT INTO tb_produto (name, description, image) VALUES ('Verde','Cor que Combina com Tudo' , 'https://barracha.pt/cdn/shop/products/F-1418_1024x1024@2x.png');
INSERT INTO tb_produto (name, description, image) VALUES ('Azul','Cor que Combina com Tudo' , 'https://images.squarespace-cdn.com/content/v1/57ec3ab629687fc3e83dc427/1480517615114-70M7IYIX0V2R9L2AEL75/FUNDO-COR-AZUL.png');

INSERT INTO tb_produto (name, description, image) VALUES ('Pizza','Sempre Bom' , 'https://img.cybercook.com.br/receitas/559/pizza-de-presunto-e-mussarela-2-840x480.jpeg');
INSERT INTO tb_produto (name, description, image) VALUES ('Feijoada','Sempre Bom' , 'https://www.comidaereceitas.com.br/wp-content/uploads/2016/07/Feijoada-de-boteco-freepik-780x519.jpg');
INSERT INTO tb_produto (name, description, image) VALUES ('Lasanha','Sempre Bom' , 'https://img.cybercook.com.br/receitas/731/lasanha-3-840x480.jpeg');
INSERT INTO tb_produto (name, description, image) VALUES ('Hamburger','Sempre Bom' , 'https://www.auau.com.br/image/cache/data/up_system/product-13702/MIGNON-HONEY-MUSTARD-1000x1000.jpg');

INSERT INTO tb_produto (name, description, image) VALUES ('Amanda','Teste Tabela 3' , 'https://www.auau.com.br/image/cache/data/up_system/product-13702/MIGNON-HONEY-MUSTARD-1000x1000.jpg');


INSERT INTO tb_belonging (list_id, produto_id, position) VALUES (1, 1, 0);
INSERT INTO tb_belonging (list_id, produto_id, position) VALUES (1, 2, 1);
INSERT INTO tb_belonging (list_id, produto_id, position) VALUES (1, 3, 2);
INSERT INTO tb_belonging (list_id, produto_id, position) VALUES (1, 4, 3);
INSERT INTO tb_belonging (list_id, produto_id, position) VALUES (1, 5, 4);
INSERT INTO tb_belonging (list_id, produto_id, position) VALUES (1, 6, 5);

INSERT INTO tb_belonging (list_id, produto_id, position) VALUES (2, 7, 0);
INSERT INTO tb_belonging (list_id, produto_id, position) VALUES (2, 8, 1);
INSERT INTO tb_belonging (list_id, produto_id, position) VALUES (2, 9, 2);
INSERT INTO tb_belonging (list_id, produto_id, position) VALUES (2, 10, 3);

INSERT INTO tb_belonging (list_id, produto_id, position) VALUES (3, 11, 0);

