package edu.basico;

public class ResultadoEscolar {
    
    public static void main(String[] args) {
        //podemos trocar tudo isso por operador ternário logo abaixo
        /*int nota = 6;

        if(nota >= 7)
            System.out.println("Aprovado");
        else if( nota >=5 && nota < 7)
            System.out.println("Prova de Recuperação");
        else
            System.out.println("Reprovado");*/

        int nota = 2;
        String resultado = (nota > 7) ? "Aprovado" : (nota >= 6 && nota <= 7) ? "Prova de Recuperação" : "Reprovado";
        System.out.println(resultado);

    }
}
