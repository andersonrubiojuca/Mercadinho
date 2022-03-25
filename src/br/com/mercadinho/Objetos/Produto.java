package br.com.mercadinho.Objetos;

import java.util.Objects;

public class Produto {
    protected String nome;
    protected String descricao;
    protected final TipoDeQuantidade tipo = TipoDeQuantidade.UNIDADE;
    protected double preco;

    public Produto(String nome, String descricao, double preco) {
        this.nome = nome;
        this.descricao = descricao;
        this.preco = preco;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public TipoDeQuantidade getTipo() {
        return tipo;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    @Override
    public String toString() {
        return "Produto{" +
                "nome='" + nome + '\'' +
                ", descricao='" + descricao + '\'' +
                ", tipo=" + tipo +
                ", preco=" + preco +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Produto)) return false;
        Produto produto = (Produto) o;
        return Double.compare(produto.getPreco(), getPreco()) == 0 && Objects.equals(getNome(), produto.getNome()) && Objects.equals(getDescricao(), produto.getDescricao()) && getTipo() == produto.getTipo();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNome(), getDescricao(), getTipo(), getPreco());
    }
}
