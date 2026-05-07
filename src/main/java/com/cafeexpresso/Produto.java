package com.cafeexpresso;

public class Produto {

    String nome;
    double preco;

    public Produto(String n, double p) {
        nome = n;
        preco = p;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }
}
