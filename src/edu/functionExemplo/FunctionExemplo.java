package edu.functionExemplo;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FunctionExemplo {
    public static void main(String[] args) {
        //criar lista de intervalo inteiro
        List<Integer> numeros = Arrays.asList(1,2,3,4,5,6,7,8,9);

        //Usar Function com expressão lambda para dobrar todos os numeros
        Function<Integer, Integer> dobrar = numero -> numero * 2;

        //Usar a função para dobrar todos os numeros no stram e armazena los em outra lista
        List<Integer> numerosDobrados = numeros.stream()
        .map(n -> n*2)
        .toList();

        //Imprimir lista de números dobrados
        numerosDobrados.forEach(System.out::println);

    }
}
