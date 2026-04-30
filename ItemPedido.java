public class ItemPedido {

    Produto produto;
    int quantidade;

    public ItemPedido(Produto produto, int quantidade) {

        this.produto = produto;

        if (quantidade <= 0) {
            this.quantidade = 1;
        } else {
            this.quantidade = quantidade;
        }
    }

    public double getSubtotal() {
        double subtotal = produto.getPreco() * quantidade;
        return subtotal;
    }

    public Produto getProduto() {
        return produto;
    }

    public int getQuantidade() {
        return quantidade;
    }
}
