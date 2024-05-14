package edu.basico;
import java.util.Scanner;
import java.util.Locale;
import java.util.InputMismatchException;


public class NovoFormulario {
    
    public static void main(String[] args) { 
    try{
    Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

    System.out.println("Digite seu nome");
    String nome = scanner.next();

    System.out.println("Digite seu sobrenome");
    String sobrenome = scanner.next();

    System.out.println("Digite sua idade");
    int idade = scanner.nextInt();

    System.out.println("Digite sua altura");
    double altura = scanner.nextDouble();

    System.out.println("Olá meu nome é " + nome + " " + sobrenome + ".");
    System.out.println("Tenho " + idade + " anos.");
    System.out.println("Minha altura é " + altura + " cm.");
    scanner.close();
    }
    catch (InputMismatchException e){
        System.err.println("A idade e altura devem ser preenchidos por numeros, e ao invés de usar virgula use ponto.");
    }
}
}  