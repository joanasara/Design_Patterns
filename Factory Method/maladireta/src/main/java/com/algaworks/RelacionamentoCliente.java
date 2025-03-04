package com.algaworks;

import com.algaworks.maladireta.MalaDiretoComDesignPatterns;
import com.algaworks.maladireta.csv.MalaDiretaCSV;

import javax.swing.*;

public class RelacionamentoCliente {
    public static void main(String[] args) {
        MalaDiretoComDesignPatterns malaDireta = new MalaDiretaCSV("contatos.csv");
        String mensagem = JOptionPane.showInputDialog(null, "Digite a mensagem do Cliente");

        boolean status = malaDireta.enviarEmail(mensagem);

        JOptionPane.showInputDialog(null, "email enviados" + status);

    }
}
