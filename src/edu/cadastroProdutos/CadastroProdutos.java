package edu.cadastroProdutos;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CadastroProdutos {
    private Set<Produto> produtoSet;

    public CadastroProdutos() {
        this.produtoSet = new HashSet<>();
    }

    public void adicionarProduto(int cod, String nome, double preco, int quantidade){
        produtoSet.add(new Produto(nome, cod, preco, quantidade));
    }

    public Set<Produto> exibirProdutoPorNome(){
        Set<Produto> exibeProdutoPorNome = new TreeSet<>(produtoSet);
        return exibeProdutoPorNome;
    }

    public Set<Produto> exibirProdutoPorPreco(){
        Set<Produto> produtoPorPreco = new TreeSet<>(new ComparatorPorPreco());
        produtoPorPreco.addAll(produtoSet);
        return produtoPorPreco;
    }

    public static void main(String[] args) {
        CadastroProdutos cadastroProdutos = new CadastroProdutos();

        cadastroProdutos.adicionarProduto(1, "Laranja", 4.99d, 1);
        cadastroProdutos.adicionarProduto(2, "Goiaba", 10.99d, 1);
        cadastroProdutos.adicionarProduto(3, "Pera", 15.99d, 1);
        cadastroProdutos.adicionarProduto(4, "Abacaxi", 5.79d, 1);
        cadastroProdutos.adicionarProduto(5, "Feijao", 8.99d, 1);
        cadastroProdutos.adicionarProduto(6, "Melão", 5.99d, 1);
        cadastroProdutos.adicionarProduto(7, "Maça", 9.99d, 1);

        System.out.println(cadastroProdutos.produtoSet);

        System.out.println(cadastroProdutos.exibirProdutoPorNome());

        System.out.println(cadastroProdutos.exibirProdutoPorPreco());
    }
    
}
