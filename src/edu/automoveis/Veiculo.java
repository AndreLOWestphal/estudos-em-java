package edu.automoveis;

public abstract class Veiculo {
    //atributos
    private String chassi;

    //gets sets
    public String getChassi() {
        return chassi;
    }

    public void setChassi(String chassi) {
        this.chassi = chassi;
    }
    
    //metodos
    public abstract void ligar();

    public void conferirCambioMoto(){
        System.out.println("Conferindo marcha lenta");
    }
    public void conferirCombustivel(){
        System.out.println("Conferindo combustivel");
    }
}
