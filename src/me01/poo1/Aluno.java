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

    public Aluno(int matricula, String celular, Pessoa p) {
        super(p.nome, p.dtNasc, p.idade, p.rg, p.cpf, p.fone);
        this.matricula = matricula;
        this.celular = celular;
    }

 

    public void cadastrarAluno() {
        JOptionPane.showMessageDialog(null, "Informe os dados referente ao aluno");
        // super.cadastrarPessoa();

    }

    public String exibirAluno(Pessoa p[], String nome) {
        String msg = null;
        for (Pessoa aluno : p) {
            if (aluno instanceof Aluno) {
                if (aluno.nome.equals(nome)) {
                    msg = "Matricula: " + ((Aluno) aluno).matricula + "\n";
                    msg += super.exibirPessoa(aluno);
                }
            }
        }
        return msg;
    }
}
