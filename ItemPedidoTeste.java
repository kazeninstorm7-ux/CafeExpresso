@Test
void testeQuantidade() {
    Produto produto = new Produto("Cafe", 10.0);

    ItemPedido item = new ItemPedido(produto, 0);

    int resultado = item.getQuantidade();

    assertEquals(1, resultado);
}
