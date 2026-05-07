package com.cafeexpresso;

import java.util.ArrayList;

public class Pedido {

    ArrayList<ItemPedido> itens = new ArrayList<>(); // agora com generics
    StatusPedido status = StatusPedido.PENDENTE;

    public void adicionarItem(ItemPedido item) {
        itens.add(item);
    }

    public double calcularTotal() {

        double total = 0;

        for (int i = 0; i < itens.size(); i++) {

            ItemPedido item = itens.get(i); // sem cast

            total = total + item.getSubtotal();
        }

        return total;
    }

    public void mudarStatus(StatusPedido novoStatus) {

        status = novoStatus; // simplificado
    }

    public void mostrarPedido() {

        System.out.println("Pedido");

        for (int i = 0; i < itens.size(); i++) {

            ItemPedido item = itens.get(i);

            System.out.println("Nome: " + item.getProduto().getNome());
            System.out.println("Qtd: " + item.getQuantidade());
            System.out.println("Valor: " + item.getSubtotal());
        }

        System.out.println("Total: " + calcularTotal());
        System.out.println("Status: " + status.name());
    }
}
