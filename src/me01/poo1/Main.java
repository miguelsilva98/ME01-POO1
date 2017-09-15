package me01.poo1;

import javax.swing.JOptionPane;

/**
 * @aluno Miguel Silva
 * @curso Ciência da Computação
 * @matricula 1271106300
 */
public class Main {

    private static Pessoa cadastrarPessoa() {
        String nome = JOptionPane.showInputDialog("Nome:");
        String dtNasc = JOptionPane.showInputDialog("Data de Nascimento (dd/mm/aaaa):");
        short idade = Short.parseShort(JOptionPane.showInputDialog("Idade:"));
        String rg = JOptionPane.showInputDialog("RG:");
        String cpf = JOptionPane.showInputDialog("CPF:");
        String fone = JOptionPane.showInputDialog("Tel:");
        return new Pessoa(nome, dtNasc, idade, rg, cpf, fone);
    }

    public static void main(String[] args) {
        int op, numPessoas = 0;
        Pessoa listaPessoas[] = new Pessoa[30];
        Aluno aluno = null;
        do {
            op = Integer.parseInt(JOptionPane.showInputDialog(""
                    + "XYZ Tecnologia - MENU PRINCIPAL"
                    + "\n1 - Menu de Cursos"
                    + "\n2 - Menu de Alunos"
                    + "\n5 - Sair"));

            switch (op) {
                case 1:
                    int opCurso;
                    do {
                        opCurso = Integer.parseInt(JOptionPane.showInputDialog(""
                                + "XYZ Tecnologia - MENU DE CURSOS"
                                + "\n1 - Cadastrar Curso"
                                + "\n2 - Consultar Curso"
                                + "\n3 - Consultar Todos os Cursos"
                                + "\n4 - Voltar"));

                        switch (opCurso) {
                            case 1: //Cadastrar Curso                               
                                break;
                            case 2://Consultar Curso
                                break;
                            case 3: //Consultar Todos os Cursos                              
                                break;
                            default:
                        }

                    } while (opCurso != 4);
                    break;
                case 2:
                    int opAluno;
                    do {
                        opAluno = Integer.parseInt(JOptionPane.showInputDialog(""
                                + "XYZ Tecnologia - MENU DE CURSOS"
                                + "\n1 - Cadastrar Aluno"
                                + "\n2 - Consultar Aluno"
                                + "\n3 - Consultar Todos os Alunos"
                                + "\n5 - Voltar"));

                        switch (opAluno) {
                            case 1: //Cadastrar Aluno
                                numPessoas++;
                                int matricula = Integer.parseInt(JOptionPane.showInputDialog("Matricula:"));
                                String celular = JOptionPane.showInputDialog("Celular:");
                                for (int i = 0; i < numPessoas; i++) {
                                    if (listaPessoas[i] == null) {
                                        aluno = new Aluno(matricula, celular, cadastrarPessoa());
                                        listaPessoas[i] = aluno;
                                        break;
                                    }
                                }

                                break;
                            case 2: //Consultar Aluno      
                                aluno.exibirAluno(listaPessoas, JOptionPane.showInputDialog("Informe o nome do aluno"));

                                break;
                            case 3: //Consultar todos os Alunos
                                break;
                            case 4: //voltar
                                break;
                            default:
                                JOptionPane.showMessageDialog(null, "Informe uma opção válida");
                        }

                    } while (opAluno != 4);

                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                default:
            }

        } while (op != 5);

    }

}
