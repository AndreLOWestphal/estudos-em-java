package edu.Menssegers.apps;

public class FacebookMessenger extends ServicoMensagemInstantanea{

    public void enviarMensagem() {
        validarConectadoInternet();
        System.out.println("Enviando mensagem pelo Fecebook...");
        
    }

    public void receberMensagem() {
        System.out.println("Recebendo mensagem pelo Fecebook...");
        
    }
    
}
