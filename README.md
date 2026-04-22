**Sistema de Pedidos – Café Expresso**

**Sobre o Projeto**
O Café Expresso é um sistema simples de autoatendimento desenvolvido com o objetivo de simular o funcionamento de uma cafeteria moderna, onde o próprio cliente pode montar seu pedido sem a necessidade de interação direta com o caixa.
A ideia principal é tornar o processo mais rápido, organizado e com menos chances de erro, permitindo que o pedido seja feito, calculado e acompanhado de forma automática.

**Objetivo**
Este projeto foi desenvolvido com foco em aplicar conceitos de Programação Orientada a Objetos (POO), utilizando a linguagem Java.
Entre os principais objetivos estão:
    • Organizar o sistema em classes bem definidas
    • Simular um fluxo real de pedidos
    • Aplicar regras básicas de negócio
    • Trabalhar com entrada de dados via teclado

**Funcionalidades**
O sistema permite:
    • Cadastro de produtos com nome e preço
    • Adição de múltiplos itens a um pedido
    • Cálculo automático do valor total
    • Controle de status do pedido:
        ◦ Pendente
        ◦ Pago
        ◦ Em preparo
        ◦ Finalizado
        
Além disso, o sistema possui um menu interativo no console, permitindo que o usuário realize todas as operações manualmente.

**Estrutura do Projeto**
O sistema foi dividido em 5 classes principais:
    • Produto - representa os itens do cardápio
    • ItemPedido - relaciona produto e quantidade
    • Pedido - gerencia os itens e o valor total
    • StatusPedido - define os estados do pedido
    • Main - responsável pela execução e interação com o usuário

**Fluxo do Sistema**
O funcionamento segue uma sequência lógica:
    1. O usuário adiciona produtos ao pedido
    2. O sistema calcula automaticamente o total
    3. O pedido começa como Pendente
    4. Pode ser atualizado para:
        ◦ Pago
        ◦ Em preparo
        ◦ Finalizado
O sistema impede mudanças de status fora dessa ordem, garantindo consistência no processo.

**Tecnologias Utilizadas**
    • Java
    • Programação Orientada a Objetos (POO)
    • Scanner (entrada de dados via teclado)

**Como Executar**
    1. Compile os arquivos:
javac *.java
    2. Execute o sistema:
java Main
    3. Utilize o menu exibido no console para interagir com o sistema.
**Autor**
Edinei Pinho

**Considerações Finais**

Este projeto representa uma implementação simples, porém funcional, de um sistema de pedidos, sendo útil para consolidar conceitos fundamentais de programação em Java.
Apesar de básico, ele pode ser expandido futuramente com:
    • Interface gráfica
    • Banco de dados
    • Integração com sistemas reais

**Desenvolvido para fins acadêmicos.**
