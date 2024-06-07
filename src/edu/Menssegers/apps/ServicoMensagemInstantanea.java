package edu.Menssegers.apps;

public abstract class ServicoMensagemInstantanea {
    
    public abstract void enviarMensagem();
    public abstract void receberMensagem();
    //protected abstract void salvarHistoricoMensagem();
    
    protected void validarConectadoInternet(){
        System.err.println("Validando conexão com internet.");
    }
}
