package edu.basico;

import java.util.Scanner;

public class SimulacaoBancaria {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 
        double saldo = 0; 
        // Loop infinito para manter o programa em execução até que o usuário decida sair
        while (true) { 
            System.out.println("Escolha a opção: 1-Depositar, 2-Sacar, 3-Saldo e 4 Encerrar");
            int opcao = scanner.nextInt(); 
        // TODO: Implemente as condições necessárias para avaliaa a opção escolhida:
        // Dica: Utilze o switch/case para o programa realizar as operações escolhidas pelo usuário.
            switch(opcao){
              case 1:
                saldo = depositar(scanner, saldo);
                break;
              case 2:
                saldo = sacar(scanner, saldo);
                break;
              case 3:
                exibirSaldo(saldo);
                break;
              case 4:
                encerrar();
                scanner.close();
                return;       
        // Exibe mensagem de opção inválida se o usuário escolher uma opção inválida:    
                default:
                    System.out.println("Opção inválida. Tente novamente."); 
                
            }
        }
    }        

            static double depositar(Scanner scanner, double saldo){
              System.out.println("Qual o valor do deposito: ");
              double deposito = scanner.nextDouble();
              saldo += deposito;
              System.out.printf("Saldo atual: %.1f%n", saldo);
              return saldo;
            }
        
            
            static double sacar(Scanner scanner, double saldo){
              System.out.println("Qual o valor do saque: ");
              double saque = scanner.nextDouble();
              if(saque > saldo){
                System.out.println("Saldo insuficiente.");
              }else{
                saldo -= saque;
                System.out.printf("Saldo atual: %.1f%n", saldo);
              }
              return saldo;
            }
            
            static void exibirSaldo(double saldo){
                System.out.printf("Saldo atual: %.1f%n", saldo); 
            }
            
            static void encerrar(){
              System.out.println("Programa encerrado.");
            }
}
    

