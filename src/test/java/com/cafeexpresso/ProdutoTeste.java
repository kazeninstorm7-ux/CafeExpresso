package com.cafeexpresso;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class ProdutoTeste {

@Test
void teste() {

    Produto p = new Produto("", 10.0);

    assertEquals("", p.getNome());
}
