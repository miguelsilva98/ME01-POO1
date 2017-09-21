/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package me01.poo1;

import javax.swing.JOptionPane;

/**
 *
 * @author 10361
 */
public class Endereco {

    private String logradouro;
    private int numero;
    private String complemento;
    private String bairro;
    private String cidade;
    private String uf;
    private String cep;

    public Endereco(String logradouro, int numero, String complemento, String bairro, String cidade, String uf, String cep) {
        this.logradouro = logradouro;
        this.numero = numero;
        this.complemento = complemento;
        this.bairro = bairro;
        this.cidade = cidade;
        this.uf = uf;
        this.cep = cep;
    }
    

    public String getLogradouro() {
        return logradouro;
    }


    public String getComplemento() {
        return complemento;
    }

    public String getBairro() {
        return bairro;
    }

    public int getNumero() {
        return numero;
    }
    
    public String getCidade() {
        return cidade;
    }

    public String getUf() {
        return uf;
    }

    public String getCep() {
        return cep;
    }

  

    public String listarEndereco() {
        String dados = "\nEndereço: " + logradouro
                + "\nNumero: " + numero
                + "\nComplemento: " + complemento
                + "\nCEP: " + cep
                + "\nBairro: " + bairro
                + "\nCidade: " + cidade
                + "\nEstado: " + uf;
        return dados;
    }
}
