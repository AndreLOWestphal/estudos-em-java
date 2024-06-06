package edu.basico;

public enum EstadoBrasileiro {
    SAO_PAULO ("SP", "São Paulo", 01),
    RIO_DE_JANEIRO ("RJ", "Rio de Janeiro",02),
    PIAUI ("PI", "Piauí",20),
    MARANHAO ("MA", "Maranhão",15),
    CEARA ("CE", "Ceará",45);

    private String nome;
    private String sigla;
    private int Ibge;

    //construtor
    private EstadoBrasileiro(String sigla, String nome, int Ibge) {
        this.nome = nome;
        this.sigla = sigla;
        this.Ibge = Ibge;
    }

    //gets
    public String getNome() {
        return nome;
    }
    public String getSigla() {
        return sigla;
    }

    public int getIbge(){
        return Ibge;
    }
    
    public String getNomeMaiusculo(){
        return nome.toUpperCase();
    }


}
