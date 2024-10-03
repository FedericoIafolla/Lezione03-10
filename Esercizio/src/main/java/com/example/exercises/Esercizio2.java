package com.example.exercises;

public class Esercizio2 {
    public static void esegui() {
        System.out.println("Esecuzione Esercizio 2");
        int fattoriale = 1;
        int numero = 5;
        for (int i = 1; i <= numero; i++) {
            fattoriale *= i;
        }
        System.out.println("Il fattoriale di " + numero + " è: " + fattoriale);
    }
}
