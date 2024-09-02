package edu.supplierExemplo;

import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SupplierExemplo {
    
    public static void main(String[] args) {
        //Usando Supplier com expressão lambda para fornecer uma saudação personalizada
        Supplier<String> saudacao = () -> "Olá, seja bem vindo!";

        //Usnado Supplier para obter uma lista com 5 saudações
        List<String> listaSaudacoes = Stream.generate(() -> "Olá, seja bem vindo!")
            .limit(5)
            .toList();

        //Imprimir as saudações geradas
        listaSaudacoes.forEach(System.out::println);

    }
}
