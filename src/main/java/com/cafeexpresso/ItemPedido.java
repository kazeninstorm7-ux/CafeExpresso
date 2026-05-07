package com.cafeexpresso;

public class ItemPedido {

    Produto produto;
    int quantidade;

    public ItemPedido(Produto p, int q) {

        produto = p;

        if (q <= 0) {
            quantidade = 1;
        } else {
            quantidade = q;
        }
    }

    public double getSubtotal() {
        return produto.getPreco() * quantidade;
    }

    public Produto getProduto() {
        return produto;
    }

    public int getQuantidade() {
        return quantidade;
    }
}
