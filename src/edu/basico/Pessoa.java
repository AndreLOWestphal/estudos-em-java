package edu.basico;

public class Pessoa {
    private String nome;
    private String cpf;
    private String endereço;


    public Pessoa(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }
    public Pessoa(String nome) {
        this.nome = nome;
    }

    //Getters and Setters
    public String getNome() {
        return nome;
    }


    public String getCpf() {
        return cpf;
    }

    public String getEndereço() {
        return endereço;
    }
    public void setEndereço(String endereço) {
        this.endereço = endereço;
    }

}
