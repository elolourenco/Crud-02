package org.example;

import java.sql.Connection;
import java.sql.DriverManager;


public class FabricaDeConexao {

        // URL para banco em memória (ideal para testes rápidos)
        private static final String URL = "jdbc:h2:mem:crud_db;DB_CLOSE_DELAY=-1";
        // Para salvar em arquivo, use: "jdbc:h2:./dados/meubanco"

        private static final String USER = "sa"; // Usuário padrão do H2
        private static final String PASS = "";   // Senha padrão é vazia

        public static Connection criarConexao() throws Exception {
        return DriverManager.getConnection(URL, USER, PASS);
    }

}
