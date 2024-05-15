package edu.basico;

import java.util.Scanner;

public class VerificadorNumeroConta { 

    public static void main(String[] args) { 
        Scanner scanner = new Scanner(System.in); 
        
        try {
            // TODO: Leia a entrada do usuário como uma string representando o número da conta:
            System.out.println("Digite o número da conta bancária:");
            String numeroConta = scanner.nextLine();
            
            // TODO: Chame o método verificarNumeroConta, passando o número da conta como argumento:
            verificarNumeroConta(numeroConta);
            
            // Imprime que o número de conta é válido:
            System.out.println("Numero de conta valido."); 
            
        // TODO: Capture a exceção do tipo IllegalArgumentException, que pode ser lançada pelo método verificarNumeroConta:
        } catch (IllegalArgumentException e) {
            // Aqui é impresso uma mensagem de erro, mostrando a mensagem associada à exceção:
            System.out.println("Erro: " + e.getMessage()); 
        } finally {
            scanner.close();
        }
    }

    // Declaração do método verificarNumeroConta, que verifica se o número de conta tem exatamente 8 dígitos:
    private static void verificarNumeroConta(String numeroConta) { 
        // TODO: Verifique se o número da conta tem exatamente 8 dígitos:
        if (numeroConta.length() != 8) {
            // TODO: Implemente uma exceção do tipo IllegalArgumentException, caso o número de conta não tenha 8 dígitos:
            throw new IllegalArgumentException("Numero de conta invalido. Digite exatamente 8 digitos.");
        }
    }
}


