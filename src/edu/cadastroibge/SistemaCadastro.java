package edu.cadastroibge;

public class SistemaCadastro {
    public static void main(String[] args) {
        
    
    //criando pessoa no sistema
    Pessoa marcos = new Pessoa("Marcos Vinicius", "028.978.653-15");

    //definindo endereço
    marcos.setEndereço("Rua das Marias");


    //imprimindo
    System.out.println(marcos.getNome()+ " - " + marcos.getCpf());
}
}