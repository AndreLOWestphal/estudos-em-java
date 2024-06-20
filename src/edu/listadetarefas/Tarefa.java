package edu.listadetarefas;

public class Tarefa {
    //atributos
    private String descricao;

    public String getDescricao() {
        return descricao;
    }

    public Tarefa(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public String toString() {
        return descricao;
    }

    
}
