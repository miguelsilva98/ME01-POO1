package me01.poo1;

import javax.swing.JOptionPane;

/**
 * @aluno Miguel Silva
 * @curso Ciência da Computação
 * @matricula 1271106300
 */
public class Pessoa {

    private String nome;
    private String dtNasc;
    private short idade;
    private String rg;
    private String cpf;
    private String cel;

    public void cadastrarPessoa() {
        String nome = JOptionPane.showInputDialog("Nome:");
        String dtNasc = JOptionPane.showInputDialog("Data de Nascimento (dd/mm/aaaa):");
        short idade = Short.parseShort(JOptionPane.showInputDialog("Idade:"));
        String rg = JOptionPane.showInputDialog("RG:");
        String cpf = JOptionPane.showInputDialog("CPF:");
    }

}
