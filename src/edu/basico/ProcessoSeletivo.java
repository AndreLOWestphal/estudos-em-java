package edu.basico;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;


public class ProcessoSeletivo {
    public static void main(String[] args) {
        String[] candidatos = {"FELIPE", "MARCIA", "PEDRO", "SOPHIA", "PAULO", "AUGUSTO","JOÃO","JOSÉ","MARIA","JESSICA"};
        for(String candidato : candidatos){
            entrarContato(candidato);
        }
    }

    static void entrarContato(String candidato){
        int tentativasRealizadas = 0;
        boolean continuarTentando = true;
        boolean atendeu = false;

        do{
            atendeu = atender();
            continuarTentando = !atendeu;
            if(continuarTentando){
                tentativasRealizadas++;
            }else{
                System.out.println("Contato realizado com sucesso");
            }

        }while(continuarTentando && tentativasRealizadas<3);

        if(atendeu){
            System.out.println("Conseguimos contato com " +candidato+ ", na " +tentativasRealizadas+ " tentativa(s).");
        }else{
            System.out.println("Não conseguimos contato com " +candidato+ ", numero maximo de tentativas " +tentativasRealizadas+ " realizada(s).");
        }

        }

    static boolean atender(){
        return new Random().nextInt(3)==1;
    }

    static void imprimirSlecionados(){
        String[] candidatos = {"FELIPE", "MARCIA", "PEDRO", "SOPHIA", "PAULO", "AUGUSTO","JOÃO","JOSÉ","MARIA","JESSICA"};

        System.out.println("Imprimindo lista de candidatos informando o indice e o nome.");

        for(int x = 0; x < candidatos.length; x++){
            System.out.println("O candidato de nº " +(x+1)+ " e o " +candidatos[x]+ ".");
        }
    }

    static void selecionarCandidato(){
        String[] candidatos = {"FELIPE", "MARCIA", "PEDRO", "SOPHIA", "PAULO", "AUGUSTO","JOÃO","JOSÉ","MARIA","JESSICA"};

        int candidatosSelecionados = 0;
        int candidatosAtuais = 0;
        double salarioBase = 2000.0;
        while(candidatosSelecionados < 5 && candidatosAtuais < candidatos.length){
            String candidato = candidatos[candidatosAtuais];
            double salarioPretendido = valorPretendido();

            System.out.println("O candidato " +candidato+ " solicitou este valor de salário: "+ salarioPretendido+ ".");
            if(salarioBase>= salarioPretendido){
                System.out.println("O candidato " +candidato+ " foi selecionado para a vaga.");
                candidatosSelecionados++;
            }
            candidatosAtuais++;
        }

    }
    
    static void analisarCandidatos(double salarioPretendido){
        double salarioBase = 2000;
        if(salarioBase > salarioPretendido){
            System.out.println("Ligar para candidato.");
        }else if(salarioBase == salarioPretendido){
            System.out.println("Ligar para candidato com contra proposta.");
        }else{
            System.out.println("Aguardando o resultado dos demais candidatos.");
        }
    }

    static double valorPretendido(){
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }
}
