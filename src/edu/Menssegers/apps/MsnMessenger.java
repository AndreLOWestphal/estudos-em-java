package edu.Menssegers.apps;

public class MsnMessenger extends ServicoMensagemInstantanea{

    public void enviarMensagem() {
        validarConectadoInternet();
        System.out.println("Enviando mensagem pelo MSN...");
        
    }

    public void receberMensagem() {
        System.out.println("Recebemdo mensagem pelo MSN...");
        
    }
    
    
}
