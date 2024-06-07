package edu.televisao;

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

/*  A linha de comando a baixo gerará uma documentação para estudo e pesquisa.
 *  javadoc -encoding UTF-8 -docencoding ISO-8859-1 -d ./docs src/edu/basico/*.java **MUITO IMPORTANTE**
 */