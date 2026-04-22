import java.util.ArrayList;

public class Pedido {

    private ArrayList<ItemPedido> itens;
    private StatusPedido status;

    public Pedido() {
        itens = new ArrayList<>();
        status = StatusPedido.PENDENTE;
    }

    public void adicionarItem(ItemPedido item) {
        itens.add(item);
    }

    public double calcularTotal() {
        double total = 0;

        for (int i = 0; i < itens.size(); i++) {
            total += itens.get(i).getSubtotal();
        }

        return total;
    }

    public void mudarStatus(StatusPedido novoStatus) {

        // controle simples (sem exagero)
        if (status == StatusPedido.PENDENTE && novoStatus == StatusPedido.PAGO) {
            status = novoStatus;

        } else if (status == StatusPedido.PAGO && novoStatus == StatusPedido.EM_PREPARO) {
            status = novoStatus;

        } else if (status == StatusPedido.EM_PREPARO && novoStatus == StatusPedido.FINALIZADO) {
            status = novoStatus;

        } else {
            System.out.println("Não pode mudar de " + status + " para " + novoStatus);
        }
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