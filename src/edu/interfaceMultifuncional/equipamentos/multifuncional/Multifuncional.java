package edu.interfaceMultifuncional.equipamentos.multifuncional;

import edu.interfaceMultifuncional.equipamentos.copiadora.Copiadora;
import edu.interfaceMultifuncional.equipamentos.digitalizadora.Digitalizadora;
import edu.interfaceMultifuncional.equipamentos.impressora.Impressora;

public class Multifuncional implements Copiadora, Digitalizadora, Impressora{

    public void copiar() {
        System.out.println("Copiando... by Multifuncional.");        
    }

    public void digitalizar() {
        System.out.println("Digitalizando... by Multifuncional.");
        
    }

    public void imprimir() {
        System.out.println("Imprimindo... by Multifuncional.");
        
    }
    
}
