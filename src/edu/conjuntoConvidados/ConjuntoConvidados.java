package edu.conjuntoConvidados;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {
    private Set<Convidado> convidadoSet;

    public ConjuntoConvidados() {
        this.convidadoSet = new HashSet<>();
    }

    public void adidicionarConvidado(String nome, int codigoConvidado){
        convidadoSet.add(new Convidado(nome, codigoConvidado));
    }

    public void removerConvidadoPorCodigoConvite(int codigoConvite){
        Convidado convidadoParaRemover = null;
        for(Convidado c : convidadoSet){
            if(c.getCodigoConvite() == codigoConvite){
                convidadoParaRemover = c;
                break;
            }
        }
        convidadoSet.remove(convidadoParaRemover);
    }

    public int contarConvidados(){
        return convidadoSet.size();
    }

    public void exibirConvidados(){
        System.out.println(convidadoSet);
    }

    public static void main(String[] args) {
        ConjuntoConvidados conjuntoConvidados = new ConjuntoConvidados();
        System.out.println("Exixtem " +conjuntoConvidados.contarConvidados()+ " dentro do Set de Convidados.");

        conjuntoConvidados.adidicionarConvidado("Andre", 1);
        conjuntoConvidados.adidicionarConvidado("Jessica", 2);
        conjuntoConvidados.adidicionarConvidado("Sophia", 3);
        conjuntoConvidados.adidicionarConvidado("Henzo", 4);
        conjuntoConvidados.adidicionarConvidado("Evaldo", 4);

        conjuntoConvidados.exibirConvidados();
        System.out.println("Exixtem " +conjuntoConvidados.contarConvidados()+ " dentro do Set de Convidados.");

        conjuntoConvidados.removerConvidadoPorCodigoConvite(5);
        System.out.println("Exixtem " +conjuntoConvidados.contarConvidados()+ " dentro do Set de Convidados.");

        conjuntoConvidados.exibirConvidados();


    }

}
