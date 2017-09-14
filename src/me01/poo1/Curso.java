package me01.poo1;

import javax.swing.JOptionPane;

/**
 * @aluno Miguel Silva
 * @curso Ciência da Computação
 * @matricula 1271106300
 */
public class Curso {

    private String nome;
    private int cargaHoraria;
    private double valor;
    private String descricao;

    public void cadastrarCurso() {
        nome = JOptionPane.showInputDialog("Nome:");
        cargaHoraria = Integer.parseInt(JOptionPane.showInputDialog("Carga:"));
        valor = Double.parseDouble(JOptionPane.showInputDialog("Valor:"));
        descricao = JOptionPane.showInputDialog("Descrição:");
    }

}
