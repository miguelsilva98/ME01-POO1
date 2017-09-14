package me01.poo1;

import javax.swing.JOptionPane;

/**
 * @aluno Miguel Silva
 * @curso Ciência da Computação
 * @matricula 1271106300
 */
public class Main {

    public static void main(String[] args) {
        int op;
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
                                + "\n5 - Voltar"));

                        switch (opCurso) {
                            case 1:
                           //     curso.cadastrarCurso();
                                break;
                            case 2:
                               // curso.exibirCurso(JOptionPane.showInputDialog("Consultar por nome \n nome:"));
                                break;
                            case 3:
                              //  curso.exibirTodosCursos();
                                break;
                            case 4:
                                break;
                            case 5:
                                break;
                            default:
                        }

                    } while (opCurso != 5);
                    break;
                case 2:
                    
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
