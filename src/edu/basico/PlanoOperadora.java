package edu.basico;

public class PlanoOperadora {
    public static void main(String[] args) {
        String plano = "TURBO";

        switch (plano) {
            case "TURBO":
                System.out.println("5Gb YT");
                
            case "MEDIO":
                System.out.println("Wzap e Instagram");
                
            case "BASIC":
                System.out.println("100 Minutos de ligação");
                break;
            default:
                System.out.println("Não possuimos o Plano");
                break;
        }
    }
}
