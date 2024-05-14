package edu.basico;

public class IlustrandoPilha {
    public static void main(String[] args) {
        System.out.println("Iniciou o metodo main.");
        a();
        System.out.println("Finalizou o metodo main.");

    }

    static void a(){
        System.out.println("Iniciou o metodo a.");
        b();
        System.out.println("Finalizou o metodo a.");
    }

    static void b(){
        System.out.println("Iniciou o metodo b.");
        for(int x = 0; x <= 7; x++){
            System.out.println(x);
        }
        c();
        System.out.println("Finalizou o metodo b.");
    }

    static void c(){
        System.out.println("Iniciou o metodo c.");
        Thread.dumpStack();
        System.out.println("Finalizou o metodo c.");
    }
}
