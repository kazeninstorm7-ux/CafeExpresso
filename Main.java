import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Pedido pedido = new Pedido();

        int opcao = -1;

        while (opcao != 0) {

            System.out.println("1 - Adicionar");
            System.out.println("2 - Mostrar");
            System.out.println("3 - Pagar");
            System.out.println("4 - Preparar");
            System.out.println("5 - Finalizar");
            System.out.println("0 - Sair");

            System.out.print("Opcao: ");
            opcao = sc.nextInt();
            sc.nextLine();

            if (opcao == 1) {

                System.out.print("Nome: ");
                String nome = sc.nextLine();

                System.out.print("Preco: ");
                double preco = sc.nextDouble();

                System.out.print("Qtd: ");
                int qtd = sc.nextInt();
                sc.nextLine();

                Produto p = new Produto(nome, preco);
                ItemPedido item = new ItemPedido(p, qtd);

                pedido.adicionarItem(item);

                System.out.println("Adicionado");

            } else if (opcao == 2) {

                pedido.mostrarPedido();

            } else if (opcao == 3) {

                pedido.mudarStatus(StatusPedido.PAGO);

            } else if (opcao == 4) {

                pedido.mudarStatus(StatusPedido.EM_PREPARO);

            } else if (opcao == 5) {

                pedido.mudarStatus(StatusPedido.FINALIZADO);

            } else if (opcao == 0) {

                System.out.println("Saindo");

            } else {

                System.out.println("Opcao invalida");
            }
        }

        sc.close();
    }
}
