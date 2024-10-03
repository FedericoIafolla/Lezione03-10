package com.example.exercises;

import com.example.model.Product;
import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Esercizio7 {
    public static List<Product> leggiProdottiDaDisco(String filePath) throws IOException {
        List<Product> prodotti = new ArrayList<>();
        List<String> lines = FileUtils.readLines(new File(filePath), "UTF-8");

        for (String line : lines) {
            String[] parts = line.split("@|#");
            String name = parts[0];
            String category = parts[1];
            double price = Double.parseDouble(parts[2]);
            prodotti.add(new Product(name, category, price));
        }

        return prodotti;
    }
}
