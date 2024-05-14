package edu.basico;

import java.util.Scanner;

public class CalculadoraMediaTurma {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       String[] alunos = {"Camila","Lucas", "Bruna", "Pedro"};
       
       double media = calcularMediaTurma(alunos, scanner);
       System.out.printf("Média da turma %.2f", media);
    }

    static double calcularMediaTurma(String[] alunos, Scanner scanner){
        double soma = 0;

        for(String aluno : alunos){
            System.out.printf("Nota do aluno %s: ", aluno);
            double nota = scanner.nextDouble();
            soma += nota;
        }
        return soma/alunos.length;
    }
}
