package edu.basico;

public class Boolean {
    
    public static void main(String[] args) {
        
        double valor1 = 50;
        double valor2 = 30;

        double resultado = somaValores(valor1, valor2);

        System.out.println(resultado);

        boolean par = verificarPar(resultado);
        String resultadoPar = " ";
        if(par)
            resultadoPar = "Verdadeiro";
        else
            resultadoPar = "Falso";
        
        System.out.println(resultadoPar);

    }

    public static double somaValores (double valor1, double valor2){
        return valor1 + valor2;

    }

    public static boolean verificarPar (double resultado){
        return resultado % 2 == 0;

    }

}
