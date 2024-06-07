package edu.televisao;

public class SmartTV {
    boolean ligada = false;
    int canal = 4;
    int volume = 20;

    public void ligar(){
        ligada = true;
    }
    public void desligar(){
        ligada = false;
    }

    public void aumentarVolume(){
        volume++;
        System.out.println("Volume: " + volume);
    }
    
    public void diminuirVolume(){
        volume--;
        System.out.println("Volume: " + volume);
    }

    public void aumentarCanal(){
        canal += 2;
    }

    public void mudarCanal(int novoCanal){
        canal = novoCanal;
    }

    public void diminuirCanal(){
        canal -= 2;
    }
}
