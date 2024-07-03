package edu.pesquisaSet;

import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {
    private Set<Contato> contatoSet;

    public AgendaContatos() {
        this.contatoSet = new HashSet<>();
    }

    public void adicionarContato(String nome, int NumeroTlefone){
        contatoSet.add(new Contato(nome, NumeroTlefone));
    }

    public void exibirContatos(){
        System.out.println(contatoSet);
    }

    public Set<Contato> pesquisarPorNome(String nome){
        Set<Contato> pesquisaPorNome = new HashSet<>();
            for(Contato c : contatoSet){
                if(c.getNome().startsWith(nome)){
                    pesquisaPorNome.add(c);
                    break;
                }
            }
        return pesquisaPorNome;
    }

    public Contato atualizarNumeroContato(String nome, int numero){
        Contato contatoAtualizado = null;    
        for(Contato c : contatoSet){
            if(c.getNome().equalsIgnoreCase(nome)){
                c.setNumeroTelefone(numero);
                contatoAtualizado = c;
                break;
            }
        }
        return contatoAtualizado;
    }


    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();
        agendaContatos.exibirContatos();

        agendaContatos.adicionarContato("Andre", 82007733);
        agendaContatos.adicionarContato("Jessica", 83018332);
        agendaContatos.adicionarContato("Sophia", 86054466);
        agendaContatos.adicionarContato("Henzo", 81546235);

        agendaContatos.exibirContatos();

        agendaContatos.atualizarNumeroContato("Henzo", 99521212);

        agendaContatos.exibirContatos();

        System.out.println(agendaContatos.pesquisarPorNome("Jessica"));
        
    }
}
