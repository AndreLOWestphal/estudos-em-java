public class PrimeirosPassos {
    
    public static void main (String [] args){

        String primeiroNome  = "André";
        String segundoNome = "Luis";
        String sobreNome = "de Oliveira";


        String nomeCompleto = nomeCompleto(primeiroNome, segundoNome, sobreNome);

        System.out.println(nomeCompleto);

    }

    public static String nomeCompleto ( String primeiroNome, String segundoNome, String sobreNome){
        return "O nome completo é: ".concat(primeiroNome).concat(" ").concat(segundoNome).concat(" ").concat(sobreNome);

    }

}
