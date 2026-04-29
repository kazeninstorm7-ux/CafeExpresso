public class ItemPedido {

    private final Produto produto;
    private final int quantidade;

    public ItemPedido(Produto produto, int quantidade) {

        this.produto = produto;
        this.quantidade = corrigirQuantidadeSeNecessario(quantidade);
    }

    private int corrigirQuantidadeSeNecessario(int quantidadeInformada) {

        if (quantidadeInformada <= 0) {
            return 1;
        }

        return quantidadeInformada;
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
