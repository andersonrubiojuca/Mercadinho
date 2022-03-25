package br.com.mercadinho.Objetos;


import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Collectors;

public class Carrinho {
    //um o produto e outro a quantidade
    private Map<Produto, Integer> itens = new LinkedHashMap<>();

    public void adicionar(Produto produto, int quantidade){
        itens.put(produto, quantidade);
    }

    public void adicionar(Produto produto){
        itens.put(produto, 1);
    }

    public void alterarQuantidade(Produto produto, int quantidade){
        itens.replace(produto, quantidade);
    }

    public void remover(Produto produto){
        itens.remove(produto);
    }

    public double getTotal(){
        double total = 0;
        for(Map.Entry<Produto, Integer> item : itens.entrySet() ){
            total += (item.getValue() * item.getKey().getPreco());
        }

        return total;
    }

    public Map<Produto, Integer> getItens() {
        return itens;
    }

    @Override
    public String toString() {
        return "Carrinho{" +
                "itens=" + itens +
                '}';
    }
}
