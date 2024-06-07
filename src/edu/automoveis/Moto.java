package edu.automoveis;

public class Moto extends Veiculo{
    
    public void ligar(){
        conferirCombustivel();
        conferirCambioMoto();
        System.out.println("Moto ligada");
    }
    
}
