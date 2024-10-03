package com.example.exercises;

public class Esercizio3 {
    public static void esegui() {
        System.out.println("Esecuzione Esercizio 3");
        String parola = "casa";
        String parolaInvertita = new StringBuilder(parola).reverse().toString();
        System.out.println("La parola '" + parola + "' invertita è: " + parolaInvertita);
    }
}
