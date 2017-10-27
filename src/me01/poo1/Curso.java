package me01.poo1;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
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
    private List<Professor> listaProf;
    private List<Aluno> listaAlunos;

    public Curso(String nome, int cargaHoraria, double valor, String descricao) {
        this.nome = nome;
        this.cargaHoraria = cargaHoraria;
        this.valor = valor;
        this.descricao = descricao;
        this.listaProf = new ArrayList<>();
        this.listaAlunos = new ArrayList<>();

    }

    public String getNome() {
        return nome;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public double getValor() {
        return valor;
    }

    public String getDescricao() {
        return descricao;
    }

    public int getNumAlunos() {
        if (listaAlunos == null) {
            return 0;
        }
        return listaAlunos.size();
    }

    public int getNumProf() {
       if(listaProf == null){
           return 0;
       }
        return listaProf.size();
    }

    public Double getArrecadado() {
        return getNumAlunos() * valor;
    }

    public double getCustos() {
        double pagamento = 0;
        for (Professor p : listaProf) {
            pagamento += p.getSalario();
        }
        pagamento = (pagamento * 18 / 100) + (pagamento * 20 / 100) + (pagamento * 33 / 100);
        return pagamento;
    }

    public void setProfessor(Professor p) {
        listaProf.add(p);
    }

    public void setAluno(Aluno a) {
        listaAlunos.add(a);
    }

}
