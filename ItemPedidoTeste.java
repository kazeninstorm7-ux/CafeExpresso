@Test
void deveAjustarQuantidadeMenorQueZero() {
    Produto p = new Produto("Café", 10.0);

    ItemPedido item = new ItemPedido(p, 0);

    assertEquals(1, item.getQuantidade());
}
