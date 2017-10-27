package me01.poo1;

/**
 * @aluno Miguel Silva
 * @curso Ciência da Computação
 * @matricula 1271106300
 */
public class Recepcionista extends Pessoa {

    private final String lattes;
    private final String email;
    private final String especialidade;
    private final String formacao;
    private Double salario;

    public Recepcionista(String lattes, String email, String especialidade, String formacao, Pessoa p) {
        super(p.nome, p.dtNasc, p.idade, p.rg, p.cpf, p.fone, p.endereco);
        this.lattes = lattes;
        this.email = email;
        this.especialidade = especialidade;
        this.formacao = formacao;
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

    public Double getSalario() {
        getResumoSalarial();
        return salario;
    }

    public String getResumoSalarial() {
        double salBruto = 1300, salLiquido, inss = 0, noInss = 0, impRenda = 0;

        String msg = "Salario Bruto: " + salBruto + "\n";
        if (salBruto <= 1556.94) {
            inss = salBruto / 100 * 8;
        } else if (salBruto > 1556.94 && salBruto <= 2594.92) {
            inss = salBruto / 100 * 9;
        } else if (salBruto > 2594.92 && salBruto <= 5189.82) {
            inss = salBruto / 100 * 11;
        } else if (salBruto > 5189.82) {
            inss = 5189.82 / 100 * 11;
        }
        noInss = salBruto - inss;
        if (noInss <= 1903.98) {
            impRenda = 0;
        } else if (noInss >= 1903.99 && noInss <= 2826.65) {
            impRenda = (noInss - 1903.99) / 100 * 7.5;
        } else if (noInss > 2826.65 && noInss <= 3751.05) {
            impRenda = (noInss - 1903.99) / 100 * 15;
        } else if (noInss > 3751.05 && noInss <= 4664.68) {
            impRenda = (noInss - 1903.99) / 100 * 22.5;
        } else if (noInss > 4664.68) {
            impRenda = (noInss - 1903.99) / 100 * 27.5;
        }
        salLiquido = noInss - impRenda;
        msg += "Impostos: " + inss + impRenda + "\nSalario Liquido: " + salLiquido;
        salario = salLiquido;
        return msg;
    }

}
