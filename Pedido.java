import java.util.ArrayList;

public class Pedido {

    private final ArrayList<ItemPedido> itens = new ArrayList<>();
    private StatusPedido status = StatusPedido.PENDENTE;

    public void adicionarItem(ItemPedido item) {
        itens.add(item);
    }

    public double calcularTotal() {

        double total = 0;

        for (ItemPedido item : itens) {
            total += item.getSubtotal();
        }

        return total;
    }

    public void mudarStatus(StatusPedido novoStatus) {

        if (podeMudarPara(novoStatus)) {
            status = novoStatus;
            return;
        }

        throw new IllegalStateException(
            "Não é possível mudar de " + status + " para " + novoStatus
        );
    }

    private boolean podeMudarPara(StatusPedido novoStatus) {

        return (status == StatusPedido.PENDENTE && novoStatus == StatusPedido.PAGO)
            || (status == StatusPedido.PAGO && novoStatus == StatusPedido.EM_PREPARO)
            || (status == StatusPedido.EM_PREPARO && novoStatus == StatusPedido.FINALIZADO);
    }

    public void mostrarPedido() {

        System.out.println("---- Pedido ----");

        for (ItemPedido item : itens) {
            System.out.println(
                item.getProduto().getNome() +
                " | qtd: " + item.getQuantidade() +
                " | subtotal: R$ " + item.getSubtotal()
            );
        }

        System.out.println("Total: R$ " + calcularTotal());
        System.out.println("Status: " + status);
    }
}
