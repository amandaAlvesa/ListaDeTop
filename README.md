# ListaDeTop
PPP - Primeiro Projeto Pessoal

Ordene uma lista do assunto desejado em top 1, top 2....

Site (React e Bootstrap) sobre listas de tops coisas usando Java Spring Boot - H2 e Insomnia 

Configurar o Back para pegar(findAll) e salvar(save) novos produtos 
  como estou usando o banco H2 não está salvando os produtos

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
      
