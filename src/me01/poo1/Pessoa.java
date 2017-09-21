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

     Pessoa(String nome, String dtNasc, short idade, String rg, String cpf, String fone) {
        this.nome = nome;
        this.dtNasc = dtNasc;
        this.idade = idade;
        this.rg = rg;
        this.cpf = cpf;
        this.fone = fone;
    }

    public String exibirPessoa(Pessoa p) {
        String msg
                = "Nome:" + p.nome + "\n"
                + "Data Nascimento:" + p.dtNasc + "\n"
                + "Idade:" + p.idade + "\n"
                + "RG:" + p.rg+ "\n"
                + "CPF:" + p.cpf+"\n"
                + "Telefone:" + p.fone+ "\n";
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
