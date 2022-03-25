package br.com.mercadinho;

import br.com.mercadinho.Objetos.Carrinho;
import br.com.mercadinho.Objetos.Produto;
import br.com.mercadinho.Objetos.ProdutoGranel;

public class Main {
    public static void main(String[] args) {
        var biscoito = new Produto("Biscoito", "Biscoito de Cholocate", 2.50);
        var toalha = new Produto("Toalha de Banho", "Toalha de Banho Azul", 13.99);
        var banana = new ProdutoGranel("banana", "fruta simples amarela", 0.500, 1.15);

        var lista = new Carrinho();
        lista.adicionar(biscoito, 3);
        lista.adicionar(toalha);
        lista.adicionar(banana);

        System.out.println("*************** Lista de Produtos ***************");
        System.out.println(lista.getItens());;
        System.out.println("Total : " + lista.getTotal());

        //testando o alterar e o remover
        lista.alterarQuantidade(toalha, 2);
        lista.remover(biscoito);

        System.out.println("*************** Lista de Produtos ***************");
        System.out.println(lista.getItens());;
        System.out.println("Total : " + lista.getTotal());


    }
}
