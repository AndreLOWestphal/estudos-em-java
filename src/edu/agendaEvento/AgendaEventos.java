package edu.agendaEvento;

import java.time.LocalDate;
import java.time.Month;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class AgendaEventos {
     private Map<LocalDate, Evento> eventoMap;

    public AgendaEventos() {
        this.eventoMap = new HashMap<>();
    }

    public void adicionarEvento(LocalDate data, String nome, String atracao){
        Evento evento = new Evento(nome, atracao);
        eventoMap.put(data, evento);
    }

    public void exibirAgenda(){
        Map<LocalDate, Evento> eventosTreeMap = new TreeMap<>(eventoMap);
        System.out.println(eventosTreeMap);
    }

    public void obterProximoEvento(){
        LocalDate proximaData = null;
        Evento proximoEvento = null;
        LocalDate dataAtual = LocalDate.now();
        Map<LocalDate, Evento> eventosTreeMap = new TreeMap<>(eventoMap);
        for(Map.Entry<LocalDate, Evento> entry : eventoMap.entrySet()){
            if(entry.getKey().isEqual(dataAtual) || entry.getKey().isAfter(dataAtual)){
                proximaData = entry.getKey();
                proximoEvento = entry.getValue();
                System.out.println("O proximo evento: " +proximoEvento+ " acontecerá na data " +proximaData);
                break;
            }
        }
    }

     

    public static void main(String[] args) {
        AgendaEventos agendaEventos = new AgendaEventos();

        agendaEventos.adicionarEvento(LocalDate.of(2024, Month.AUGUST, 30), "Festa do Pijama", "Música");
        agendaEventos.adicionarEvento(LocalDate.of(2024, Month.DECEMBER, 15), "Festa Sertaneja", "Música");
        agendaEventos.adicionarEvento(LocalDate.of(2024, Month.SEPTEMBER, 30), "Festa Hit", "Música");
        agendaEventos.adicionarEvento(LocalDate.of(2025, Month.JANUARY, 10), "Festa Dance", "Música");
        
        agendaEventos.exibirAgenda();

    }
}
