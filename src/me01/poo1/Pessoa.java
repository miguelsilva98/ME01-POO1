package me01.poo1;

import javax.swing.JOptionPane;

/**
 * @aluno Miguel Silva
 * @curso Ciência da Computação
 * @matricula 1271106300
 */
public class Pessoa {

    protected String nome;
    protected String dtNasc;
    protected short idade;
    protected String rg;
    protected String cpf;
    protected String fone;
    protected Endereco endereco;

    Pessoa(String nome, String dtNasc, short idade, String rg, String cpf, String fone, Endereco endereco) {
        this.nome = nome;
        this.dtNasc = dtNasc;
        this.idade = idade;
        this.rg = rg;
        this.cpf = cpf;
        this.fone = fone;
        this.endereco = endereco;
    }

    public String exibirPessoa(Pessoa p) {
        String msg
                = "----Dados Pessoais----\n"
                + "Nome:" + p.nome + "\n"
                + "Data Nascimento:" + p.dtNasc + "\n"
                + "Idade:" + p.idade + "\n"
                + "RG:" + p.rg + "\n"
                + "CPF:" + p.cpf + "\n"
                + "Telefone:" + p.fone + "\n\n"
                + "------Endereco------\n"
                + "Logradouro: " + endereco.getLogradouro() + "\n"
                + "Numero: " + endereco.getNumero() + "\n"
                + "Complemento: " + endereco.getComplemento() + "\n"
                + "CEP: " + endereco.getCep() + "\n"
                + "Bairro: " + endereco.getBairro() + "\n"
                + "Cidade: " + endereco.getCidade() + "\n"
                + "Estado: " + endereco.getUf() + "\n\n";
        return msg;
    }

    public String getNome() {
        return nome;
    }

    public String getDtNasc() {
        return dtNasc;
    }

    public short getIdade() {
        return idade;
    }

    public String getRg() {
        return rg;
    }

    public String getCpf() {
        return cpf;
    }

    public String getFone() {
        return fone;
    }

}
