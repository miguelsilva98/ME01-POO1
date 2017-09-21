package me01.poo1;

/**
 * @aluno Miguel Silva
 * @curso Ciência da Computação
 * @matricula 1271106300
 */
public class Professor extends Pessoa {

    private final String lattes;
    private final String email;
    private final String especialidade;
    private final String formacao;
    private final String salario;

    public Professor(String lattes, String email, String especialidade, String formacao,String salario,Pessoa p) {
        super(p.nome, p.dtNasc, p.idade, p.rg, p.cpf, p.fone);
        this.lattes = lattes;
        this.email = email;
        this.especialidade = especialidade;
        this.formacao = formacao;
        this.salario = salario;
    }

    public String getLattes() {
        return lattes;
    }

    public String getEmail() {
        return email;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public String getFormacao() {
        return formacao;
    }

    public String getSalario() {
        return salario;
    }
}
