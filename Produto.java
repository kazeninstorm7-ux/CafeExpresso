public class Produto {

    private String nome;
    private double preco;

    public Produto(String nome, double preco) {
        if (nome == null || nome.equals("")) {
            System.out.println("Nome do produto não pode ser vazio");
        }

        if (preco < 0) {
            System.out.println("Preço inválido");
        }

        this.nome = nome;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }
}