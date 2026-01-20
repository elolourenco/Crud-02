package org.example;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.List;

public class ProdutoDAO {

    // CREATE
    public void salvar(Produto produto) {
        String sql = "INSERT INTO produtos(nome, preco, quantidade) VALUES (?, ?, ?)";
        try (Connection conn = FabricaDeConexao.criarConexao();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, produto.getNome());
            stmt.setDouble(2, produto.getPreco());
            stmt.setInt(3, produto.getQuantidade());
            stmt.execute();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // READ
    public List<Produto> listarTodos() {
        String sql = "SELECT * FROM produtos";
        List<Produto> produtos = new ArrayList<>();
        // Lógica para percorrer o ResultSet e adicionar na lista...
        return produtos;
    }

    // UPDATE e DELETE seguem a mesma lógica mudando apenas o comando SQL
}
