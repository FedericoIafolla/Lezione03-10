package com.example.exercises;

import org.apache.commons.io.FileUtils;
import com.example.model.Product;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Esercizio6 {
    public static void esegui() {
        System.out.println("Esecuzione Esercizio 6");
        List<Product> prodotti = new ArrayList<>();
        prodotti.add(new Product("nomeprodotto1", "categoria1", 100.0));
        prodotti.add(new Product("nomeprodotto2", "categoria2", 200.0));

        salvaProdottiSuDisco(prodotti);
    }

    private static void salvaProdottiSuDisco(List<Product> prodotti) {
        File file = new File("prodotti.txt");
        List<String> lines = new ArrayList<>();
        for (Product prodotto : prodotti) {
            lines.add(prodotto.getName() + "@" + prodotto.getCategory() + "@" + prodotto.getPrice());
        }
        try {
            FileUtils.writeLines(file, lines);
            System.out.println("Prodotti salvati su disco in " + file.getAbsolutePath());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
