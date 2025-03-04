package com.algaworks.maladireta.csv;

import au.com.bytecode.opencsv.CSVReader;
import com.algaworks.contato.ContatoComDesignPattern;
import com.algaworks.contato.ContatoComDesignPatterns;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.net.URI;
import java.util.ArrayList;
import java.util.List;

public class ContatosCSV implements ContatoComDesignPattern {

    private final String nomeArquivo;

    public ContatosCSV(String nomeArquivo) {
        this.nomeArquivo = nomeArquivo;
    }

    @Override
    public List<ContatoComDesignPatterns> todos() {
        List<ContatoComDesignPatterns> contatos = new ArrayList<>();
        CSVReader csvReader = null;

        try {
            URI uri = this.getClass().getResource("/" + nomeArquivo).toURI();
            File arquivoCsv = new File(uri);
            FileReader fileReader = new FileReader(arquivoCsv);
            csvReader = new CSVReader(fileReader);
            String [] nextLine;

            while ((nextLine = csvReader.readNext()) != null) {
                contatos.add(new ContatoComDesignPatterns(nextLine[0].trim(), nextLine[1].trim()));
            }
        } catch (Exception e) {
            throw new RuntimeException("Erro lendo arquivo csv", e);
        } finally {
            try {
                csvReader.close();
            } catch (IOException e) { }
        }

        return contatos;
    }
}
