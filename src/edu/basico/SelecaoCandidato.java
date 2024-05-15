package edu.basico;

import java.util.Scanner;

public class SelecaoCandidato {
    public static void main(String[] args) {
        System.out.println("Processo Seletivo para cargo.");
        Scanner scan = new Scanner(System.in);
        String[] candidatos = {"Andre", "Luis","Pedro"};
        
        String status = selecionarCandidato(candidatos, scan);

        System.out.println(status);


    }

    static String selecionarCandidato (String[] nome, Scanner scanner){
        int salarioBase = 2000;
        for(int i = 0; i<nome.length; i++){
            System.out.println("Qual a pretensão salarial: " + nome[i]);
            int pretensao = scanner.nextInt(); 
            if(pretensao < salarioBase){
                System.out.println("Ligar para " + nome[i]);}
            else if (pretensao == salarioBase){
                System.out.println("Ligar para " + nome[i] + " com contra proposta.");}
            else{
                System.out.println("Aguardando resultado demais candidatos.");}
        }
        return "";
    }
}

