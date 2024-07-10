package edu.estoqueProdutosPreco;

import java.util.HashMap;
import java.util.Map;

public class EstoqueProdutos {
    private Map<Long, Produto> estoqueProdutosMap;

    public EstoqueProdutos() {
        this.estoqueProdutosMap = new HashMap<>();
    }
    
    public void adicionarProduto(long cod, String nome, int quantidade, double preco){
        estoqueProdutosMap.put(cod, new Produto(nome, preco, quantidade));
    }

    public void exibirProdutos(){
        System.out.println(estoqueProdutosMap);
    }

    public double calcularValorTotalEstoque(){
        double valorTotalEstoque = 0;
        if(!estoqueProdutosMap.isEmpty()){
            for(Produto p : estoqueProdutosMap.values()){
                valorTotalEstoque += p.getQuantidade() * p.getPreco();
            }
        }
        return valorTotalEstoque;
    }

    public Produto obterProdutoMaisCaro(){
        Produto produtoMaisCaro = null;
        double maiorPreco = Double.MIN_VALUE;
        if(!estoqueProdutosMap.isEmpty()){
            for(Produto p : estoqueProdutosMap.values()){
                if(p.getPreco() > maiorPreco){
                    produtoMaisCaro = p;
                }
            }
        }
        return produtoMaisCaro;
    }

    public static void main(String[] args) {
        EstoqueProdutos estoqueProdutos = new EstoqueProdutos();

        estoqueProdutos.adicionarProduto(10001, "Arroz", 10, 24.99);
        estoqueProdutos.adicionarProduto(10002, "Feijão", 20, 4.99);
        estoqueProdutos.adicionarProduto(10003, "Oleo", 150, 4.99);
        estoqueProdutos.adicionarProduto(10004, "Macarrão", 1000, 0.99);
        estoqueProdutos.adicionarProduto(10005, "Sal", 500, 0.79);

        estoqueProdutos.exibirProdutos();

        System.out.println("O valor total em R$ " +estoqueProdutos.calcularValorTotalEstoque()+ " no estoque.");

        System.out.println(estoqueProdutos.obterProdutoMaisCaro());
    }
    
}
