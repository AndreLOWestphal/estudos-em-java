package edu.basico;
public class PrimeirosPassos {

    // na clase principal estamos dando valor ao atributos, variaveis, e chamando o metodo, função e imprimindo-o
    public static void main (String [] args){

        String primeiroNome  = "André";
        String segundoNome = "Luis";
        String sobreNome = "de Oliveira";


        String nomeCompleto = nomeCompleto(primeiroNome, segundoNome, sobreNome);

        System.out.println(nomeCompleto);

    }

    // Este metodo foi criado com o intuito de retornar uma String somando os nomes e sobrenomes, concatenando sendo mais tecnico
    public static String nomeCompleto ( String primeiroNome, String segundoNome, String sobreNome){
        return "O nome completo é: ".concat(primeiroNome).concat(" ").concat(segundoNome).concat(" ").concat(sobreNome);

    }

}
