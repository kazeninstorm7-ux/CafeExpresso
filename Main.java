import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Pedido pedido = new Pedido();

        System.out.println("=== Sistema Café Expresso ===");

        int opcao;

        do {
            mostrarMenu();

            System.out.print("Escolha: ");
            opcao = sc.nextInt();
            sc.nextLine();

            processarOpcao(opcao, sc, pedido);

        } while (opcao != 0);

        System.out.println("Encerrando sistema...");
        sc.close();
    }

    private static void mostrarMenu() {
        System.out.println("\n1 - Adicionar produto ao pedido");
        System.out.println("2 - Mostrar pedido");
        System.out.println("3 - Pagar pedido");
        System.out.println("4 - Iniciar preparo");
        System.out.println("5 - Finalizar pedido");
        System.out.println("0 - Sair");
    }

    private static void processarOpcao(int opcao, Scanner sc, Pedido pedido) {

        if (opcao == 1) {
            adicionarItem(sc, pedido);

        } else if (opcao == 2) {
            pedido.mostrarPedido();

        } else if (opcao == 3) {
            pedido.mudarStatus(StatusPedido.PAGO);

        } else if (opcao == 4) {
            pedido.mudarStatus(StatusPedido.EM_PREPARO);

        } else if (opcao == 5) {
            pedido.mudarStatus(StatusPedido.FINALIZADO);
        }
    }

    private static void adicionarItem(Scanner sc, Pedido pedido) {

        System.out.print("Nome do produto: ");
        String nome = sc.nextLine();

        System.out.print("Preço: ");
        double preco = sc.nextDouble();

        System.out.print("Quantidade: ");
        int qtd = sc.nextInt();
        sc.nextLine();

        Produto p = new Produto(nome, preco);
        ItemPedido item = new ItemPedido(p, qtd);

        pedido.adicionarItem(item);

        System.out.println("Item adicionado!");
    }
}
