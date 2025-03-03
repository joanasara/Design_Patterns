package com.algaworks.maladireta;

import com.algaworks.contato.Contato;
import com.algaworks.contato.ContatoComDesignPattern;
import com.algaworks.contato.ContatoComDesignPatterns;

import java.util.List;

public abstract class MalaDiretoComDesignPatterns {

    protected abstract ContatoComDesignPattern criarContato();

    public boolean enviarEmail(String mensagem) {
        List<ContatoComDesignPatterns> contatos = criarContato().todos();

        System.out.println("Conectando no servidor SMTP...");
        System.out.println("Mensagem a ser enviada: " + mensagem);
        System.out.println();

        for (ContatoComDesignPatterns contato : contatos) {
            System.out.println("From: <contato@algaworks.com>");
            System.out.printf("To: [%s] <%s>\n", contato.getNome(), contato.getEmail());
            System.out.println(mensagem);
            System.out.println();
        }
        return true;

    }
}
