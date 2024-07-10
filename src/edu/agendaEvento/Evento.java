package edu.agendaEvento;

public class Evento {
    private String nome;

    private String atracao;
    

    @Override
    public String toString() {
        return "Evento nome = " + nome + ", atração = " + atracao +".";
    }

    public Evento(String nome, String atracao) {
        this.nome = nome;
        this.atracao = atracao;
    }

    public String getNome() {
        return nome;
    }

    public String getAtracao() {
        return atracao;
    }

    
}
