package edu.pesquisa;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {

    private List<Livro> livroList;

    public CatalogoLivros() {
        this.livroList = new ArrayList<>();
    }


    public void adicionarLivro(String titulo, String autor,int anoPublicacao){
        livroList.add(new Livro(titulo, autor, anoPublicacao));
    }

    public List<Livro> pesquisarPorAutor(String autor){
        List<Livro> livroPorAutor = new ArrayList<>();
        if(!livroList.isEmpty()){
            for(Livro l : livroList){
                if(l.getAutor().equalsIgnoreCase(autor)){
                    livroPorAutor.add(l);
                }
            }
        }
        return livroPorAutor;
    }

    public List<Livro> pesquisarPorIntervaloAnos(int anoInicial, int anoFinal){
        List<Livro> livroPorIntervalosAnos = new ArrayList<>();
        if(!livroList.isEmpty()){
            for(Livro l : livroList){
                if(l.getAnoPublicacao() >= anoInicial && l.getAnoPublicacao() <= anoFinal){
                   livroPorIntervalosAnos.add(l); 
                }
            }
        }
        return livroPorIntervalosAnos;
    }

    public Livro pesquisarPorTitulo(String titulo){
        Livro livroPorTitulo = null;
        if(!livroList.isEmpty()){
            for(Livro l : livroList){
                if(l.getTitulo().equalsIgnoreCase(titulo)){
                    livroPorTitulo = l;
                    break;
                }
            }
        }
        return livroPorTitulo;

    }

    public static void main(String[] args) {
        CatalogoLivros catalogoLivros = new CatalogoLivros();
        catalogoLivros.adicionarLivro("Titulo 1", "Autor 1", 2020);
        catalogoLivros.adicionarLivro("Titulo 1", "Autor 2", 2021);
        catalogoLivros.adicionarLivro("Titulo 2", "Autor 3", 2023);
        catalogoLivros.adicionarLivro("Titulo 3", "Autor 4", 2021);
        catalogoLivros.adicionarLivro("Titulo 4", "Autor 5", 2024);
        catalogoLivros.adicionarLivro("Titulo 5", "Autor 1", 2019);
        catalogoLivros.adicionarLivro("Titulo 5", "Autor 3", 2018);

        System.out.println(catalogoLivros.pesquisarPorTitulo("Titulo 5"));

        
    }
    
}
