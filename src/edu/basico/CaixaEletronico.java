package edu.basico;

public class CaixaEletronico {

    public static void main(String[] args) {
        double saldo = 1000.78;
        double valorSolicitado = 500;

        if(valorSolicitado < saldo){
            saldo = saldo -valorSolicitado;
            System.out.println("Novo saldo R$ " + saldo);
        }else{
            System.out.println("Saldo insuficiente");
            System.out.println(saldo);
        }
    }
    
}
