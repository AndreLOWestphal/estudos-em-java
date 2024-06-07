package edu.Menssegers.main;

import edu.Menssegers.apps.FacebookMessenger;
import edu.Menssegers.apps.MsnMessenger;
import edu.Menssegers.apps.ServicoMensagemInstantanea;
import edu.Menssegers.apps.Telegram;

public class ComputadorPedro {
    public static void main(String[] args) {  
    
        ServicoMensagemInstantanea smi = null;

        String appEscolhido = "fcb";

        if (appEscolhido.equals("msn")) {
            smi = new MsnMessenger();           
        } else if(appEscolhido.equals("fbm")){
            smi = new FacebookMessenger();
        } else{
            smi = new Telegram();
        }
        smi.enviarMensagem();
        smi.receberMensagem();
        
    }
}
