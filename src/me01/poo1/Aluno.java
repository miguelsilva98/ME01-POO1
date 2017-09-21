package me01.poo1;

import javax.swing.JOptionPane;

/**
 * @aluno Miguel Silva
 * @curso Ciência da Computação
 * @matricula 1271106300
 */
public class Aluno extends Pessoa {

    private final int matricula;
    private final String celular;

    public Aluno(int matricula, String celular, Pessoa p) {
        super(p.nome, p.dtNasc, p.idade, p.rg, p.cpf, p.fone,p.endereco);
        this.matricula = matricula;
        this.celular = celular;
    }

    public int getMatricula() {
        return matricula;
    }

    public String getCelular() {
        return celular;
    }
}
