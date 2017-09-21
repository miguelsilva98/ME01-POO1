package me01.poo1;

import java.util.ArrayList;
import java.util.List;
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

    public static String verAluno(List<Aluno> listaAlunos, String nome) {
        String msg = null;
        for (Aluno aluno : listaAlunos) {
            if (aluno.nome.equals(nome) || nome == null) {
                msg = "Matricula: " + aluno.getMatricula() + "\n";
                msg += aluno.exibirPessoa(aluno);
                msg += "Celular: " + aluno.getCelular() + "\n";
            }
        }
        return msg;
    }

    public static String verProf(List<Professor> listaProf, String nome) {
        String msg = null;
        for (Professor prof : listaProf) {
            if (prof.nome.equals(nome) || nome == null) {
                msg = prof.exibirPessoa(prof);
                msg += "Lattes:" + prof.getLattes() + "\n";
                msg += "Email:" + prof.getEmail() + "\n";
                msg += "Especialidade:" + prof.getEspecialidade() + "\n";
                msg += "Formação:" + prof.getFormacao() + "\n";
                msg += "Salario:" + prof.getSalario() + "\n";
            }
        }
        return msg;
    }

    public static void main(String[] args) {
        int op;
        String exibir;
        List<Aluno> listaAlunos = new ArrayList<>();
        List<Professor> listaProf = new ArrayList<>();

        do {
            op = Integer.parseInt(JOptionPane.showInputDialog(""
                    + "XYZ Tecnologia - MENU PRINCIPAL"
                    + "\n1 - Menu de Cursos"
                    + "\n2 - Menu de Alunos"
                    + "\n3 - Menu de Professores"
                    + "\n5 - Sair"));

            switch (op) {
                case 1: //Menu Curso
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
                case 2://Menu Aluno
                    int opAluno;
                    do {
                        opAluno = Integer.parseInt(JOptionPane.showInputDialog(""
                                + "XYZ Tecnologia - MENU DE ALUNOS"
                                + "\n1 - Cadastrar Aluno"
                                + "\n2 - Consultar Aluno"
                                + "\n3 - Consultar Todos os Alunos"
                                + "\n4 - Voltar"));

                        switch (opAluno) {
                            case 1: //Cadastrar Aluno
                                int matricula = Integer.parseInt(JOptionPane.showInputDialog("Matricula:"));
                                String celular = JOptionPane.showInputDialog("Celular:");
                                Aluno aluno = new Aluno(matricula, celular, cadastrarPessoa());
                                listaAlunos.add(aluno);
                                break;
                            case 2: //Consultar Aluno    
                                if (!listaAlunos.isEmpty()) {
                                    exibir = verAluno(listaAlunos, JOptionPane.showInputDialog("Informe o nome do aluno"));
                                    if (exibir == null) {
                                        JOptionPane.showMessageDialog(null, "Nenhum aluno encontrado");
                                    } else {
                                        JOptionPane.showMessageDialog(null, exibir);
                                        exibir = null;
                                    }
                                } else {
                                    JOptionPane.showMessageDialog(null, "Não possui alunos cadastrados");
                                }
                                break;
                            case 3: //Consultar todos os Alunos
                                if (!listaAlunos.isEmpty()) {
                                    exibir = verAluno(listaAlunos, null);
                                    if (exibir == null) {
                                        JOptionPane.showMessageDialog(null, "Nenhum aluno encontrado");
                                    } else {
                                        JOptionPane.showMessageDialog(null, exibir);
                                        exibir = null;
                                    }
                                } else {
                                    JOptionPane.showMessageDialog(null, "Não possui alunos cadastrados");
                                }
                                break;
                            case 4: //voltar
                                break;
                            default:
                                JOptionPane.showMessageDialog(null, "Informe uma opção válida");
                        }

                    } while (opAluno != 4);

                    break;
                case 3://Menu Professor
                    int opProf;
                    do {
                        opProf = Integer.parseInt(JOptionPane.showInputDialog(""
                                + "XYZ Tecnologia - MENU DE PROFESSORES"
                                + "\n1 - Cadastrar Professor"
                                + "\n2 - Consultar Professor"
                                + "\n3 - Consultar Todos os Professor"
                                + "\n4 - Voltar"));

                        switch (opProf) {
                            case 1: //Cadastrar Professor
                                String lattes = JOptionPane.showInputDialog("Link CV:");
                                String email = JOptionPane.showInputDialog("Celular:");
                                String especialidade = JOptionPane.showInputDialog("Especialidade:");
                                String formacao = JOptionPane.showInputDialog("Formação:");
                                String salario = JOptionPane.showInputDialog("Salario:");
                                Professor prof = new Professor(lattes, email, especialidade, formacao, salario, cadastrarPessoa());
                                listaProf.add(prof);
                                break;
                            case 2: //Consultar Professor    
                                if (!listaProf.isEmpty()) {
                                    exibir = verProf(listaProf,JOptionPane.showInputDialog("Informe o nome do Professor"));
                                    if (exibir == null) {
                                        JOptionPane.showMessageDialog(null, "Nenhum Professor encontrado");
                                    } else {
                                        JOptionPane.showMessageDialog(null, exibir);
                                        exibir = null;
                                    }
                                } else {
                                    JOptionPane.showMessageDialog(null, "Não possui Professor cadastrados");
                                }
                                break;
                            case 3: //Consultar todos os Alunos
                                if (!listaAlunos.isEmpty()) {
                                    exibir = verAluno(listaAlunos, null);
                                    if (exibir == null) {
                                        JOptionPane.showMessageDialog(null, "Nenhum aluno encontrado");
                                    } else {
                                        JOptionPane.showMessageDialog(null, exibir);
                                        exibir = null;
                                    }
                                } else {
                                    JOptionPane.showMessageDialog(null, "Não possui alunos cadastrados");
                                }
                                break;
                            case 4: //voltar
                                break;
                            default:
                                JOptionPane.showMessageDialog(null, "Informe uma opção válida");
                        }

                    } while (opProf != 4);

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
