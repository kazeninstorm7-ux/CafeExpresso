package com.cafeexpresso;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class ProdutoTeste {

@Test
void teste() {

    Produto p = new Produto("Cafe", 10.0);

    ItemPedido i = new ItemPedido(p, 0);

    int r = i.getQuantidade();

    assertEquals(1, r);
}
