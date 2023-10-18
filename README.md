# ListaDeTop
PPP - Primeiro Projeto Pessoal

Ordene uma lista do assunto desejado em top 1, top 2....

Site (React e Bootstrap) sobre listas de tops coisas usando Java Spring Boot - H2 e Insomnia 

^^^^^^^^^^^^^^

Back-end com Java Spring Boot:

-Configurar as dependecias no https://start.spring.io/ ou na IDE (IDE usada é a STS):
  1-spring-boot-starter-data-jpa,
  2-spring-boot-starter-web,
  3-spring-boot-devtools,
  4-projectlombok,
  5-h2database
  Colocar como projeto Maven;

-Criar pastas:
  1-DTO,
  2-entities,
  3-controller,
  4-exceptions,
  5-projections,
  6-repository,
  7-response,
  8-service;

Ver aqui no Git como cada pasta e classe está sendo usada;

Dentro do import.sql é conectado diretamente com o bd, tornando fixo os produtos
  `INSERT INTO tb_produto_list (name) VALUES ('Top Cores');` 
  instacia a tabela de lista de produtos

  `INSERT INTO tb_produto (name, description, image) VALUES ('Lasanha','Sempre Bom' , 'https://img.cybercook.com.br/receitas/731/lasanha-3-840x480.jpeg');`
  instacia o produto com carteristicas passadas diretamente

  `INSERT INTO tb_belonging (list_id, produto_id, position) VALUES (2, 7, 0);`
  instacia na lista de produtos instaciada em segundo o setimo produto criado na posição 0(ou primeira) da lista em que este produto esta;

-------
Criar com  ```npm vite@latest nomeDoProdjeto ``` o Front

Pastas para separação: Pages, Layouts e Produtos

Bibliotecas baixadas ```npm i axios```
                     ```npm i route-react-dom```

Página inicial com Navbar no IntialPage.jsx
<div align="center">
<img src="https://github.com/amandaAlvesa/ListaDeTop/assets/108950028/6638fa83-d0c2-4870-858e-384deee3c9b1" width="550px">
</div>

Página da Lista de Produtos CORES no Home(mudar nome).jsx
<div align="center">
<img src="https://github.com/amandaAlvesa/ListaDeTop/assets/108950028/4ec6cf8b-0e01-4658-9815-a712d2250c42" width="550px">
</div>

Final das paginas de com lista com  ação de Adicionar novo produto no AddProdutos.jsx
<div align="center">
<img src="https://github.com/amandaAlvesa/Cardapio/assets/108950028/96c85eba-d486-47be-a539-46207424e04b" width="550px">
</div>

Página de Editar o Produto no EditProduto.jsx
<div align="center">
<img src="https://github.com/amandaAlvesa/ListaDeTop/assets/108950028/6db09c58-3346-436c-ad50-57000a5e2312" width="550px">
</div>

Página para vizualizar produtos no ViewProduto.jsx
<div align="center">
<img src="https://github.com/amandaAlvesa/ListaDeTop/assets/108950028/7cb70f3d-9888-4c21-85f1-9c59fddc59a6" width="550px">
</div>

Página da segunda lista COMIDAS no Comidas.jsx 
<div align="center">
<img src="https://github.com/amandaAlvesa/ListaDeTop/assets/108950028/b56ebe9b-aa8c-4fc3-ad40-d905d7020bcf" width="550px">
</div>

^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^

Projeto feito com (muito) auxilio de: https://github.com/amandaAlvesa/Lista-Games
                                      https://github.com/amandaAlvesa/Cadast
conforme eu for aprendendo funcionalidades para serem colocas no front e back vou melhorando o projeto;
