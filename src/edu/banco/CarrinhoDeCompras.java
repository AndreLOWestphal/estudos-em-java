package edu.banco;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
    private List<Item> itemList;

    public CarrinhoDeCompras() {
        this.itemList = new ArrayList<>();
    }

    public void adicionarItem(String nome, double preco, int quantidade){
        Item item = new Item(nome, preco, quantidade);
        this.itemList.add(item);
    }

    public void removerItem(String nome){
        List<Item> itensRemover = new ArrayList<>();
        if(!itemList.isEmpty()){
            for(Item i : itemList){
                if(i.getNome().equalsIgnoreCase(nome)){
                    itensRemover.add(i);
                }
            }itemList.removeAll(itensRemover);
        }else{
            System.out.println("A lista está vazia!");
        }
    }

    public double calcularValorTotal(){
        double valorTotal = 0d;
        if(!itemList.isEmpty()){
            for(Item item : itemList){
                double valorItem = item.getPreco() * item.getQuantidade();
                valorTotal += valorItem;
            }
            return valorTotal;
        }else{
            throw new RuntimeException("A lista está vazia!");
        }
    }

    public void exibirItens(){
        if(!itemList.isEmpty()){
            System.out.println(this.itemList);
        }else{
            System.out.println("A lista está vazia.");
        }
    }

    @Override
    public String toString() {
        return "CarrinhoDeCompras [itens=" + itemList + "]";
    }   

    public static void main(String[] args) {
        CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();

        carrinhoDeCompras.adicionarItem("Caderno", 15d, 1);
        carrinhoDeCompras.adicionarItem("Caneta", 1d, 10);
        carrinhoDeCompras.adicionarItem("Lápis", 0.5d, 15);
        carrinhoDeCompras.adicionarItem("Borracha", 0.3d, 5);
        carrinhoDeCompras.adicionarItem("Lapiseira", 30d, 1);

        carrinhoDeCompras.exibirItens();

        //carrinhoDeCompras.removerItem("Borracha");

        carrinhoDeCompras.exibirItens();

        System.out.println("O valor total da compra é = " + carrinhoDeCompras.calcularValorTotal());

    }

}
