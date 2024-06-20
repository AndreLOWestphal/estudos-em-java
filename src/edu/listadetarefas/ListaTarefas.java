package edu.listadetarefas;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefas {
    
        private List<Tarefa> tarefaList;

        public ListaTarefas() {
            this.tarefaList = new ArrayList<>();
        }

        public void adicionarTarefa(String descricao){
            tarefaList.add(new Tarefa(descricao));
        }

        public void removerTarefa(String descricao){
            List<Tarefa> tarefasRemover = new ArrayList<>();
            for(Tarefa t : tarefaList){
                if(t.getDescricao().equalsIgnoreCase(descricao)){
                    tarefasRemover.add(t);
                }
            }
            tarefaList.removeAll(tarefasRemover);
        }

        public int obterNumeroTotalTarefas(){
            return tarefaList.size();
        }

        public void obterDescricoesTarefas(){
            System.err.println(tarefaList);
        }

        public static void main(String[] args) {
            ListaTarefas listaTarefas = new ListaTarefas();
            System.out.println("O número total de elementos na lista é: " + listaTarefas.obterNumeroTotalTarefas());

            listaTarefas.adicionarTarefa("Limpar fogão");
            listaTarefas.adicionarTarefa("Limpar chão");
            listaTarefas.adicionarTarefa("Limpar fogão");
            System.out.println("O número total de elementos na lista é: " + listaTarefas.obterNumeroTotalTarefas());

            //listaTarefas.removerTarefa("Limpar chão");
            //System.out.println("O número total de elementos na lista é: " + listaTarefas.obterNumeroTotalTarefas());

            listaTarefas.obterDescricoesTarefas();
        }
}
