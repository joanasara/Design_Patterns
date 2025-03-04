package com.algaworks.maladireta.csv;

import com.algaworks.contato.ContatoComDesignPattern;
import com.algaworks.maladireta.MalaDiretoComDesignPatterns;

public class MalaDiretaCSV extends MalaDiretoComDesignPatterns {

    private final String nomeArquivo;

    public MalaDiretaCSV(String nomeArquivo) {
        this.nomeArquivo = nomeArquivo;
    }

    @Override
    protected ContatoComDesignPattern criarContato() {
        return new ContatosCSV(nomeArquivo);
    }
}
