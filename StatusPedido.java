public enum StatusPedido {

    PENDENTE("Pedido criado e aguardando pagamento"),
    PAGO("Pagamento confirmado"),
    EM_PREPARO("Pedido sendo preparado"),
    FINALIZADO("Pedido concluído");

    private final String descricao;

    StatusPedido(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }
}
