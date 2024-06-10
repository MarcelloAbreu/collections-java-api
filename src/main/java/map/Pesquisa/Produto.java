package main.java.map.Pesquisa;

public class Produto {

    // atributos
    private String nome;
    private Double preco;
    private int quantidade;

    // Construtor
    public Produto(String nome, Double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    // Getter e Setters
    public String getNome() {
        return nome;
    }

    public Double getPreco() {
        return preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    @Override
    public String toString() {
        return "{"
                + " nome='" + getNome() + "'"
                + ", preco='" + getPreco() + "'"
                + ", quantidade='" + getQuantidade() + "'"
                + "}";
    }
}
