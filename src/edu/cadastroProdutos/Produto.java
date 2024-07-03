package edu.cadastroProdutos;

import java.util.Comparator;

public class Produto implements Comparable<Produto>{
    private String nome;
    private int codigo;
    private double preco;
    private int quantidade;


    @Override
    public int compareTo(Produto p) {
        
        return nome.compareToIgnoreCase(p.getNome());
    }
    @Override
    public String toString() {
        return "{Nome=" + nome + ", Codigo=" + codigo + ", Preço=" + preco + ", Quantidade=" + quantidade + "}";
    }
    public Produto(String nome, int codigo, double preco, int quantidade) {
        this.nome = nome;
        this.codigo = codigo;
        this.preco = preco;
        this.quantidade = quantidade;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getCodigo() {
        return codigo;
    }
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    public double getPreco() {
        return preco;
    }
    public void setPreco(double preco) {
        this.preco = preco;
    }
    public int getQuantidade() {
        return quantidade;
    }
    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }


}

class ComparatorPorPreco implements Comparator<Produto>{

    @Override
    public int compare(Produto p1, Produto p2) {
        return Double.compare(p1.getPreco(), p2.getPreco());
    }

}
