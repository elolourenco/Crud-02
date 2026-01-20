# CRUD Java com Banco de Dados H2

Este é um projeto simples em Java que implementa as operações básicas de um CRUD (Create, Read, Update, Delete) utilizando o banco de dados **H2** e o padrão de projeto **DAO (Data Access Object)**.

O projeto demonstra como:
1.  Configurar uma conexão com o banco H2.
2.  Criar tabelas automaticamente via código (`CREATE TABLE IF NOT EXISTS`).
3.  Inserir registros no banco de dados.
4.  Listar todos os registros cadastrados.

O código está organizado no pacote `org.example`:
* `Main.java`: Ponto de entrada da aplicação e inicialização do banco.
* `Produto.java`: Classe de entidade (modelo).
* `ProdutoDAO.java`: Classe responsável pela lógica de acesso aos dados (SQL).
* `FabricaDeConexao.java`: Gerencia a conexão com o banco de dados.

## 🔧 Como executar

1.  **Pré-requisitos**:
    * Java JDK 11 ou superior instalado.
    * O arquivo JAR do driver H2 adicionado ao seu classpath (ou via Maven).
