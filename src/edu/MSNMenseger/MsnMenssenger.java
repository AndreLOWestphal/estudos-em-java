package edu.MSNMenseger;

public class MsnMenssenger {
    
    public void enviarMensagem(){
        validarConectadoInternet();
        System.out.println("Enviando mensagem...");
        salvarHistoricoMensagem();
    }

    
    public void receberMensagem(){
        System.out.println("Recebendo mensagem...");
    }
    
    private void validarConectadoInternet(){
        System.out.println("Validando conexão...");
    }
    
    private void salvarHistoricoMensagem(){
        System.out.println("Salvando historico de mensagem...");
    }
}
