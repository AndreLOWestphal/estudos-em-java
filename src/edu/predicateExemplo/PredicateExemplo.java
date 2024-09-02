package edu.predicateExemplo;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateExemplo {
    public static void main(String[] args) {
        //Criar lista de palavras
        List<String> palavras = Arrays.asList("JavaScript", "Java", "Python", "Kotlin","c", "go", "ruby");

        //Criar uim Predicate que verifica se a palavra tem mais de 5 caravteres
        Predicate<String> maisDeCincoCaracteres = palavra -> palavra.length() > 5;

        //Usar Stream para filtrar as palavras com mais de 5 caracteres e, em seguida, imprimir cada palavra que passou no filtro
        palavras.stream()
        .filter(s -> s.length() < 5)
        .forEach(System.out::println);
    }
}
