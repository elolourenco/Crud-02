//novo comentário//

package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // 1. Instanciamos o DAO para ter acesso aos métodos do banco
        ProdutoDAO dao = new ProdutoDAO();

        // 2. Criamos a tabela no H2 (Importante para banco em memória)
        inicializarBanco();

        System.out.println("--- Iniciando CRUD com H2 ---\n");

        // 3. OPERAÇÃO: CREATE (Salvar produtos)
        System.out.println("Salvando produtos...");
        Produto p1 = new Produto("Notebook", 3500.00, 10);
        Produto p2 = new Produto("Mouse Gamer", 150.00, 50);

        dao.salvar(p1);
        dao.salvar(p2);
        System.out.println("Produtos salvos com sucesso!\n");

        // 4. OPERAÇÃO: READ (Listar todos)
        System.out.println("Listando produtos cadastrados:");
        List<Produto> lista = dao.listarTodos();

        for (Produto p : lista) {
            System.out.println("ID: " + p.getId() +
                    " | Nome: " + p.getNome() +
                    " | Preço: R$ " + p.getPreco() +
                    " | Estoque: " + p.getQuantidade());
        }
    }

    // Método auxiliar para criar a tabela caso ela não exista
    private static void inicializarBanco() {
        try (java.sql.Connection conn = FabricaDeConexao.criarConexao();
             java.sql.Statement stmt = conn.createStatement()) {

            String sql = "CREATE TABLE IF NOT EXISTS produtos (" +
                    "id INT AUTO_INCREMENT PRIMARY KEY, " +
                    "nome VARCHAR(100), " +
                    "preco DOUBLE, " +
                    "quantidade INT)";

            stmt.execute(sql);
        } catch (Exception e) {
            System.err.println("Erro ao inicializar banco: " + e.getMessage());
        }
    }
}