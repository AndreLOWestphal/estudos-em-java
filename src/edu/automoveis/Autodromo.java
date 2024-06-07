package edu.automoveis;

public class Autodromo {
    public static void main(String[] args) {
        Carro jeep = new Carro();
        jeep.ligar();
        jeep.setChassi("123456");

        Moto z400 = new Moto();
        z400.setChassi("654321");
        z400.ligar();

    }
    
}
