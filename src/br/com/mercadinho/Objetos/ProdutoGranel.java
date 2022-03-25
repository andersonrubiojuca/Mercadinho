package br.com.mercadinho.Objetos;

import java.util.Objects;

public class ProdutoGranel extends Produto{
    protected TipoDeQuantidade tipo = TipoDeQuantidade.PESO;
    // 1 = 1 quilo
    protected double peso;

    public ProdutoGranel(String nome, String descricao, double peso, double preco) {
        super(nome, descricao, preco);
        this.peso = peso;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    @Override
    public double getPreco() {
        return super.getPreco() * this.getPeso();
    }

    @Override
    public TipoDeQuantidade getTipo() {
        return tipo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ProdutoGranel that)) return false;
        if (!super.equals(o)) return false;
        return Double.compare(that.getPeso(), getPeso()) == 0 && getTipo() == that.getTipo();
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getTipo(), getPeso());
    }
}
