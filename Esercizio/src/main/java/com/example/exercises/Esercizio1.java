package com.example.exercises;

public class Esercizio1 {
    public static void esegui() {
        System.out.println("Esecuzione Esercizio 1");
        int somma = 0;
        for (int i = 1; i <= 10; i++) {
            somma += i;
        }
        System.out.println("La somma dei primi 10 numeri è: " + somma);
    }
}
