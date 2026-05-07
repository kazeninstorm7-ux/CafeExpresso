package com.cafeexpresso;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class ProdutoTeste {

@Test
void teste() {
// teste
    Pedido p = new Pedido();

    Produto prod = new Produto("Cafe", 10.0);

    p.adicionarItem(new ItemPedido(prod, 2));

    double r = p.calcularTotal();

    assertEquals(20.0, r);
}
