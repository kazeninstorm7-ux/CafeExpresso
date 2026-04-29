@Test
void deveCalcularTotalCorretamente() {
    Pedido pedido = new Pedido();

    Produto p = new Produto("Café", 10.0);
    pedido.adicionarItem(new ItemPedido(p, 2));

    assertEquals(20.0, pedido.calcularTotal());
}
