package edu.interfaceMultifuncional.estabelecimento;

import edu.interfaceMultifuncional.equipamentos.copiadora.Copiadora;
import edu.interfaceMultifuncional.equipamentos.digitalizadora.Digitalizadora;
//import edu.interfaceMultifuncional.equipamentos.impressora.Deskjet;
import edu.interfaceMultifuncional.equipamentos.impressora.Impressora;
import edu.interfaceMultifuncional.equipamentos.multifuncional.Multifuncional;

public class Fabrica {
    public static void main(String[] args) {
        Multifuncional em = new Multifuncional();
        Impressora impressora= em;
        Copiadora copiadora = em;
        Digitalizadora digitalizadora = em;

        
        impressora.imprimir();
        digitalizadora.digitalizar();
        copiadora.copiar();

    }
}
