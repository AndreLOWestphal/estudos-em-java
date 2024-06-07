package edu.automoveis;

public class Carro extends Veiculo{
    
    public void ligar(){
        conferirCombustivel();
        conferirCambio();
        System.out.println("Carro ligado");
    }

    private void conferirCambio(){
        System.out.println("Conferindo cambio em P");
    }
}
