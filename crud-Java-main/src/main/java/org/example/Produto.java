package org.example;

public class Produto {
    private int id;
    private String nome;
    private double preco;
    private int quantidade;

    // Construtor vazio (importante para algumas bibliotecas)
    public Produto() {}

    // Construtor completo
    public Produto(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    // --- GETTERS (Os métodos que o DAO está pedindo) ---
    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public int getId() {
        return id;
    }

    // --- SETTERS (Necessários para o método listarTodos) ---
    public void setId(int id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
}