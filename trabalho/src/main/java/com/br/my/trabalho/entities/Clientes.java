/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.br.my.trabalho.entities;

/*
    Aqui será de fato nossa Classe.
 */
public class Clientes {
    private String nome;
    private String cpf;
    private String produto;
    private double preco;

    
    // Nosso método construtor que vai receber nossos atributos.
    public Clientes(String nome, String cpf, String produto, double preco){
        // Aqui vamos repassar para o nosso objeto.
        this.nome = nome;
        this.cpf = cpf;
        this.produto = produto;
        this.preco = preco;
    }
    
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getProduto() {
        return produto;
    }

    public void setProduto(String produto) {
        this.produto = produto;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
}
