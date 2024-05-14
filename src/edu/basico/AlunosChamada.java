package edu.basico;

public class AlunosChamada {
    public static void main(String[] args) {
        String alunos [] = {"JOÃO","PEDRO","MATHEUS","ISAQUE","JOSÉ","ANDRE","MARCIO"};

        for( int x = 0; x < alunos.length; x++){
            System.out.println("O aluno no indice "+x+ " é o(a) " + alunos[x]);
        }
        System.out.println("Estes são todos os alunos. Organizados usando for.");

        for ( String aluno : alunos){
            System.out.println("O nome do aluno é " + aluno);
        }
        System.out.println("Estes são todos os alunos. Organizados usando for each.");
    }
}
