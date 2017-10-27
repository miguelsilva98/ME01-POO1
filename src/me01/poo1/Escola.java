package me01.poo1;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 * @aluno Miguel Silva
 * @curso Ciência da Computação
 * @matricula 1271106300
 */
public class Escola {

    private static Pessoa cadastrarPessoa() {
        JOptionPane.showMessageDialog(null, "Dados Pessoais");
        String nome = JOptionPane.showInputDialog("Nome:");
        String dtNasc = JOptionPane.showInputDialog("Data de Nascimento (dd/mm/aaaa):");
        short idade = Short.parseShort(JOptionPane.showInputDialog("Idade:"));
        String rg = JOptionPane.showInputDialog("RG:");
        String cpf = JOptionPane.showInputDialog("CPF:");
        String fone = JOptionPane.showInputDialog("Tel:");
        JOptionPane.showMessageDialog(null, "Dados Referente a Endereço");
        String logradouro = JOptionPane.showInputDialog("Logradouro:");
        int numero = Integer.parseInt(JOptionPane.showInputDialog("Numero:"));
        String complemento = JOptionPane.showInputDialog("Complemento:");
        String cep = JOptionPane.showInputDialog("CEP:");
        String bairro = JOptionPane.showInputDialog("Bairro:");
        String cidade = JOptionPane.showInputDialog("Cidade");
        String uf = JOptionPane.showInputDialog("UF");
        return new Pessoa(nome, dtNasc, idade, rg, cpf, fone, new Endereco(logradouro, numero, complemento, bairro, cidade, uf, cep));
    }

    public static String verAluno(List<Aluno> listaAlunos, String nome) {
        String msg = "";
        for (Aluno aluno : listaAlunos) {
            if (aluno.getNome().equals(nome) || nome == null) {
                msg += "----Dados do Aluno----\n";
                msg += "Matricula: " + aluno.getMatricula() + "\n";
                msg += "Celular: " + aluno.getCelular() + "\n\n";
                msg += aluno.exibirPessoa(aluno);
            }
        }
        return msg;
    }

    public static String verCurso(List<Curso> listaCurso, String nome) {
        String msg = "";
        for (Curso curso : listaCurso) {
            if (curso.getNome().equals(nome)) {
                msg += "----Dados do Curso----\n";
                msg += "Nome:" + curso.getNome() + "\n";
                msg += "Carga Horaria:" + curso.getCargaHoraria() + "\n";
                msg += "Valor:" + curso.getValor() + "\n";
                msg += "Descricao:" + curso.getDescricao() + "\n\n";

                msg += "----Financeiro----\n";
                msg += "Valor do curso:" + curso.getValor() + "\n";
                msg += "Custo: " + curso.getCustos() + "\n";
                msg += "Valor Arrecadado:" + curso.getArrecadado() + "\n";
                msg += "Mensalidade: " + curso.getCustos() / curso.getNumAlunos() + "\n";
                msg += "Valor total do curso:" + curso.getCustos() + "\n\n";

                msg += "----Informações extra----\n";
                msg += "Minimo de Alunos:" + (curso.getCustos() / curso.getValor()) + "\n";
                msg += "Nº atual de Alunos:" + curso.getNumAlunos() + "\n";
                msg += "Nº atual de Professores:" + curso.getNumProf() + "\n";

            }
        }
        return msg;
    }

    public static String verProf(List<Professor> listaProf, String nome) {
        String msg = "";
        for (Professor prof : listaProf) {
            if (prof.getNome().equals(nome) || nome == null) {
                msg += "----Dados do Professor----\n";
                msg += "Lattes:" + prof.getLattes() + "\n";
                msg += "Email:" + prof.getEmail() + "\n";
                msg += "Especialidade:" + prof.getEspecialidade() + "\n";
                msg += "Formação:" + prof.getFormacao() + "\n";

                msg += "----Resumo Salarial----\n";
                msg += prof.getResumoSalarial() + "\n\n";
                msg += prof.exibirPessoa(prof);

            }
        }
        return msg;
    }

    
     public static String verRecp(List<Recepcionista> listaRecp, String nome) {
        String msg = "";
        for (Recepcionista recp : listaRecp) {
            if (recp.getNome().equals(nome) || nome == null) {
                msg += "----Dados do Professor----\n";
                msg += "Lattes:" + recp.getLattes() + "\n";
                msg += "Email:" + recp.getEmail() + "\n";
                msg += "Especialidade:" + recp.getEspecialidade() + "\n";
                msg += "Formação:" + recp.getFormacao() + "\n";

                msg += "----Resumo Salarial----\n";
                msg += recp.getResumoSalarial() + "\n\n";
                msg += recp.exibirPessoa(recp);

            }
        }
        return msg;
    }
    public static void main(String[] args) {
        int op;
        String exibir;
        List<Aluno> listaAlunos = new ArrayList<>();
        List<Professor> listaProf = new ArrayList<>();
        List<Recepcionista> listaRecp = new ArrayList<>();
        List<Curso> listaCurso = new ArrayList<>();

        do {
            op = Integer.parseInt(JOptionPane.showInputDialog(""
                    + "XYZ Tecnologia - MENU PRINCIPAL"
                    + "\n1 - Menu de Cursos"
                    + "\n2 - Menu de Alunos"
                    + "\n3 - Menu de Professores"
                    + "\n4 - Menu Recepcionista, "
                    + "\n5 - Sair"));

            switch (op) {
                case 1: //Menu Curso
                    int opCurso;
                    do {
                        opCurso = Integer.parseInt(JOptionPane.showInputDialog(""
                                + "XYZ Tecnologia - MENU DE CURSOS"
                                + "\n1 - Cadastrar Curso"
                                + "\n2 - Consultar Curso"
                                + "\n3 - Inserir Aluno ao Curso"
                                + "\n4 - Inserir Professor ao Curso"
                                + "\n5 - Voltar"));

                        switch (opCurso) {
                            case 1: //Cadastrar Curso      
                                String nome = JOptionPane.showInputDialog("Nome:");
                                int cargaHoraria = Integer.parseInt(JOptionPane.showInputDialog("Carga:"));
                                double valor = Double.parseDouble(JOptionPane.showInputDialog("Valor:"));
                                String descricao = JOptionPane.showInputDialog("Descrição:");
                                listaCurso.add(new Curso(nome, cargaHoraria, valor, descricao));
                                break;
                            case 2://Consultar Curso
                                if (!listaCurso.isEmpty()) {
                                    exibir = verCurso(listaCurso, JOptionPane.showInputDialog("Informe o nome do curso"));
                                    if (exibir == null) {
                                        JOptionPane.showMessageDialog(null, "Nenhum curso encontrado");
                                    } else {
                                        JOptionPane.showMessageDialog(null, exibir);
                                        exibir = null;
                                    }
                                } else {
                                    JOptionPane.showMessageDialog(null, "Não possui curso cadastrados");
                                }

                                break;
                            case 3: // Inserir Aluno ao Curso
                                if (!listaAlunos.isEmpty()) {
                                    String nomeAluno = JOptionPane.showInputDialog("Informe o nome do aluno ou aperte enter para cadastrar todos os alunos");
                                    for (Aluno aluno : listaAlunos) {
                                        if (aluno.getNome().equals(nomeAluno) || nomeAluno == null) {
                                            JOptionPane.showMessageDialog(null, "Aluno Encontrado: " + aluno.getNome());
                                            String nomeCurso = JOptionPane.showInputDialog("Nome do Curso:");
                                            for (Curso curso : listaCurso) {
                                                if (curso.getNome().equals(nomeCurso)) {
                                                    curso.setAluno(aluno);
                                                }
                                            }

                                        }
                                    }

                                } else {
                                    JOptionPane.showMessageDialog(null, "Não possui alunos cadastrados");
                                }
                                break;
                            case 4:// Inserir Professor ao Curso
                                if (!listaAlunos.isEmpty()) {
                                    String nomeAluno = JOptionPane.showInputDialog("Informe o nome do Professor ou aperte enter para cadastrar todos os alunos");
                                    for (Professor prof : listaProf) {
                                        if (prof.getNome().equals(nomeAluno) || nomeAluno == null) {
                                            JOptionPane.showMessageDialog(null, "Professor Encontrado: " + prof.getNome());
                                            String nomeCurso = JOptionPane.showInputDialog("Nome do Curso:");
                                            for (Curso curso : listaCurso) {
                                                if (curso.getNome().equals(nomeCurso)) {
                                                    curso.setProfessor(prof);
                                                }
                                            }

                                        }
                                    }

                                } else {
                                    JOptionPane.showMessageDialog(null, "Não possui professores cadastrados");
                                }
                                break;
                            case 5: //sair
                                break;

                        }

                    } while (opCurso != 5);
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
                                JOptionPane.showMessageDialog(null, "Dados do Aluno");
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
                                JOptionPane.showMessageDialog(null, "Dados do Professor");
                                String lattes = JOptionPane.showInputDialog("Link CV:");
                                String email = JOptionPane.showInputDialog("Celular:");
                                String especialidade = JOptionPane.showInputDialog("Especialidade:");
                                String formacao = JOptionPane.showInputDialog("Formação:");
                                int salario = Integer.parseInt(JOptionPane.showInputDialog("Tipo Salarial \n1 - 3200; \n2 - 5000; \n3 - 7000:"));
                                Professor prof = new Professor(lattes, email, especialidade, formacao, salario, cadastrarPessoa());
                                listaProf.add(prof);
                                break;
                            case 2: //Consultar Professor    
                                if (!listaProf.isEmpty()) {
                                    exibir = verProf(listaProf, JOptionPane.showInputDialog("Informe o nome do Professor"));
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
                            case 3: //Consultar todos os Professores
                                if (!listaProf.isEmpty()) {
                                    exibir = verProf(listaProf, null);
                                    if (exibir == null) {
                                        JOptionPane.showMessageDialog(null, "Nenhum Professor encontrado");
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

                        }

                    } while (opProf != 4);

                    break;

                case 4://Menu Recp
                    int opRecp;
                    do {
                        opProf = Integer.parseInt(JOptionPane.showInputDialog(""
                                + "XYZ Tecnologia - MENU DE RECEPCIONISTA"
                                + "\n1 - Cadastrar Recepcionista"
                                + "\n2 - Consultar Recepcionista"
                                + "\n3 - Consultar Todos os Recepcionista"
                                + "\n4 - Voltar"));

                        switch (opProf) {
                            case 1: //Cadastrar recp
                                JOptionPane.showMessageDialog(null, "Dados do Recepcionista");
                                String lattes = JOptionPane.showInputDialog("Link CV:");
                                String email = JOptionPane.showInputDialog("Celular:");
                                String especialidade = JOptionPane.showInputDialog("Especialidade:");
                                String formacao = JOptionPane.showInputDialog("Formação:");
                                Recepcionista rec = new Recepcionista(lattes, email, especialidade, formacao, cadastrarPessoa());
                                listaRecp.add(rec);
                                break;
                            case 2: //Consultar Professor    
                                if (!listaRecp.isEmpty()) {
                                    exibir = verRecp(listaRecp, JOptionPane.showInputDialog("Informe o nome da Recepcionista"));
                                    if (exibir == null) {
                                        JOptionPane.showMessageDialog(null, "Nenhum Recepcionista encontrado");
                                    } else {
                                        JOptionPane.showMessageDialog(null, exibir);
                                        exibir = null;
                                    }
                                } else {
                                    JOptionPane.showMessageDialog(null, "Não possui Recepcionista cadastrados");
                                }
                                break;
                            case 3: //Consultar todos os Professores
                                if (!listaRecp.isEmpty()) {
                                    exibir = verRecp(listaRecp, null);
                                    if (exibir == null) {
                                        JOptionPane.showMessageDialog(null, "Nenhum Recepcionista encontrado");
                                    } else {
                                        JOptionPane.showMessageDialog(null, exibir);
                                        exibir = null;
                                    }
                                } else {
                                    JOptionPane.showMessageDialog(null, "Não possui Recepcionista cadastrados");
                                }
                                break;
                            case 4: //voltar
                                break;

                        }

                    } while (opProf != 4);

                    break;
                case 5:
                    break;
            }

        } while (op != 5);

    }

}
