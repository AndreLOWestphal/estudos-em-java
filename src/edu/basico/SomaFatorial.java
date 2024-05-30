package edu.basico;

public class SomaFatorial {
    public static void main(String[] args) {
        int N = 2;
        int F = 0;

        for (int i = 1; i <= N; i++) {
            F *= i;
        }

        System.out.println(F);
    }
}
