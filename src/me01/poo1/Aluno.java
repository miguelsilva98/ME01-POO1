package me01.poo1;

import javax.swing.JOptionPane;

/**
 * @aluno Miguel Silva
 * @curso Ciência da Computação
 * @matricula 1271106300
 */
public class Aluno extends Pessoa {

    private int matricula;
    private String celular;

    public void cadastrarAluno() {
        JOptionPane.showMessageDialog(null, "Informe os dados referente ao aluno");
        super.cadastrarPessoa();
         matricula = Integer.parseInt(JOptionPane.showInputDialog("Matricula:"));
         celular = JOptionPane.showInputDialog("Celular:");

    }
}
