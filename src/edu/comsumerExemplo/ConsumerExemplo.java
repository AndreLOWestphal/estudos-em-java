package edu.comsumerExemplo;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerExemplo {
    
    public static void main(String[] args) {
        // Criar lista de numeros inteiros
        List<Integer> numeros = Arrays.asList(1,2,3,4,5,6,7,8,9,10);

        //Usando o Consumer co expressão lamdba para imprimir números pares
        Consumer<Integer> imprimirNumeroPar = numero -> {
            if(numero % 2 == 0){
                System.out.print(numero + " ");
            }
        };

        //Usando comsumer para imprimir números pares + o metodo stream
        numeros.stream()
        .filter(n -> n % 2 == 0)
        .forEach(System.out::println);            
        }
    }
