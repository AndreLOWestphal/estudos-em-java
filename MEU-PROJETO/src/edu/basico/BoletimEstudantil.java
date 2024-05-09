package edu.basico;
public class BoletimEstudantil {

    // podemos identificar na main e metodo que se alterarmos para inteiros provavelmente o fulano estará de recuperação
    public static void main(String[] args) {
        
        double nota1 = 6;
        double nota2 = 7;

        String mediaFinal = calcularMediaFinal(nota1, nota2);

        System.out.println(mediaFinal);
    }

    public static String calcularMediaFinal(double nota1, double nota2){
        double media = (nota1 + nota2)/2;
        
        if ((media) > 6)
            return  "APROVADO";
        else if ((media == 6))
            return "RECUPERAÇÃO";
        else 
            return "REPROVADO";
    }
    
}
