@Test
void naoDeveCriarProdutoComNomeVazio() {
    assertThrows(IllegalArgumentException.class, () -> {
        new Produto("", 10.0);
    });
}
