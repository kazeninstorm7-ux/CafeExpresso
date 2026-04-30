import java.util.ArrayList;

public class Pedido {

    ArrayList itens = new ArrayList(); // sem generics
    String status = "PENDENTE";

    public void adicionarItem(ItemPedido item) {
        itens.add(item);
    }

    public double calcularTotal() {

        double total = 0;

        for (int i = 0; i < itens.size(); i++) {

            ItemPedido item = (ItemPedido) itens.get(i); // cast manual

            total = total + item.getSubtotal();
        }

        return total;
    }

    public void mudarStatus(String novoStatus) {

        if (status.equals("PENDENTE") && novoStatus.equals("PAGO")) {
            status = novoStatus;
        } else if (status.equals("PAGO") && novoStatus.equals("EM_PREPARO")) {
            status = novoStatus;
        } else if (status.equals("EM_PREPARO") && novoStatus.equals("FINALIZADO")) {
            status = novoStatus;
        } else {
            System.out.println("Nao pode mudar status");
        }
    }

    public void mostrarPedido() {

        System.out.println("Pedido");

        for (int i = 0; i < itens.size(); i++) {

            ItemPedido item = (ItemPedido) itens.get(i);

            System.out.println("Nome: " + item.getProduto().getNome());
            System.out.println("Qtd: " + item.getQuantidade());
            System.out.println("Valor: " + item.getSubtotal());
        }

        System.out.println("Total: " + calcularTotal());
        System.out.println("Status: " + status);
    }
}
