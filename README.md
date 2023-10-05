# ListaDeTop
PPP - Primeiro Projeto Pessoal

Ordene uma lista do assunto desejado em top 1, top 2....



### configurações do h2

```
# H2 Connection
spring.datasource.url=jdbc:h2:mem:testdb
spring.datasource.username=sa
spring.datasource.password=

# H2 Client
spring.h2.console.enabled=true
spring.h2.console.path=/h2-console

# Show SQL
spring.jpa.show-sql=true
spring.jpa.properties.hibernate.format_sql=true
```

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
