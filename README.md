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

Página inicial com Navbar e Home
<div align="center">
<img src="https://github.com/amandaAlvesa/ListaDeTop/assets/108950028/fe24d83b-7ce2-45b8-96fe-897d732b7037" width="550px">
</div>

Página de Adicionar novo Produto com AddProduto
<div align="center">
<img src="https://github.com/amandaAlvesa/Cadastro/assets/108950028/9baf2e44-0a71-414c-8c01-f40373199270)" width="550px">
</div>

Página de Detalhes do Produto com ViewProduto
<div align="center">
<img src="https://github.com/amandaAlvesa/Cardapio/assets/108950028/96c85eba-d486-47be-a539-46207424e04b" width="550px">
</div>

Página de Editar o Produto com EditProduto
<div align="center">
<img src="https://github.com/amandaAlvesa/Cardapio/assets/108950028/de4b5aa3-7ed5-48cb-b316-fa69584c928f)" width="550px">
</div>

-------
Voltando Pro Back para mudar posições dos produtos

Criar ProdutoList para agrupar os produtos
      Belonging para saber a posição do produto
      e BelongingPk para juntar os id's de Produto e ProdutoList, -> Source -> Generate HashCode() and Equals() -> Marcar produto e list;
Configurar como tabelas
      
