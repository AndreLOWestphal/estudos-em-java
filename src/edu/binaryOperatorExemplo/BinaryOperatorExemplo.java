package edu.binaryOperatorExemplo;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

public class BinaryOperatorExemplo {
     public static void main(String[] args) {
    //Criar uma lista de numeros inteiros
    List<Integer> numeros = Arrays.asList(1,2,3,4,5,6,7,8,9,10);

    //Usar o BO com expressão lambda para somar dois numeros inteiros
    BinaryOperator<Integer> somar = (num1, num2) -> num1 + num2;

    //Usar o BO para somar todos os numeros no Stream
    @SuppressWarnings("unchecked")
    int resultado =numeros.stream()
    .reduce(0, (n1, n2) -> n1 + n2);

    //Imprimir o resultado da soma
    System.out.println("A soma dos números é: " + resultado);
    }   
}
