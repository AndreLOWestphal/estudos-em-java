package edu.basico;

public class UsuarioTV {
   
    public static void main(String[] args) {
        
        SmartTV smartTV = new SmartTV();

        smartTV.ligar();
        smartTV.aumentarCanal();
        smartTV.diminuirVolume();
        smartTV.diminuirVolume();
        smartTV.diminuirVolume();
        smartTV.diminuirVolume();

        System.out.println("A TV está ligada: " + smartTV.ligada);
        System.out.println("Canal " + smartTV.canal);
        System.out.println("Volume " + smartTV.volume);

        smartTV.mudarCanal(50);

        System.out.println("Canal " + smartTV.canal);


    }

}
