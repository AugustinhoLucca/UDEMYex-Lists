package programas;

import entidades.AlunosCurso;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class programa_alunos_cursos {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nome, matricula, curso;
        double nota1, nota2;

        System.out.println("Quantos alunos serão cadastrados? ");
        int qtdAlunos = sc.nextInt();
        sc.nextLine();

        List<AlunosCurso> listaAlunos = new ArrayList<>();

        for (int cont = 0; cont < qtdAlunos; cont++) {


            System.out.println("Deseja cadastrar: TODOS OS DADOS [1] APENAS NOME E MATRÍCULA [2]");
            int verificarCadastro = sc.nextInt();
            sc.nextLine();

            if (verificarCadastro == 1) {


                System.out.println("-=-=-ALUNO " + (cont + 1) + "-=-=-");
                System.out.println("Nome Completo: ");
                nome = sc.nextLine();
                System.out.println("Matrícula: ");
                matricula = sc.nextLine();
                System.out.println("Curso Atual:");
                curso = sc.nextLine();
                System.out.println("Nota / 1° Semestre: ");
                nota1 = sc.nextDouble();
                System.out.println("Nota / 2° Semestre: ");
                nota2 = sc.nextDouble();
                sc.nextLine();

                AlunosCurso alunos = new AlunosCurso(nome, matricula, curso, nota1, nota2);

                listaAlunos.add(alunos);

                System.out.println("Deseja alterar algum dado? [0] CONTINUAR [1] NOME [2] MATRÍCULA " +
                        "[3] CURSO [4] NOTAS");
                int verificarAlteracao = sc.nextInt();
                sc.nextLine();

                if (verificarAlteracao == 1) {
                    System.out.println("Novo Nome Completo: ");
                    alunos.setNome(sc.nextLine());
                    System.out.println("Nome Atualizado: " + alunos.getNome());
                } else if (verificarAlteracao == 2) {
                    System.out.println("Nova Matrícula: ");
                    alunos.setMatricula(sc.nextLine());
                    System.out.println("Matrícula Atualizada: " + alunos.getMatricula());
                } else if (verificarAlteracao == 3) {
                    System.out.println("Novo Curso: ");
                    alunos.setCurso(sc.nextLine());
                    System.out.println("Curso Atualizado: " + alunos.getCurso());
                } else if (verificarAlteracao == 4) {

                    System.out.println("Qual nota deseja alterar? AMBAS AS NOTAS [0] NOTA 1 [1] NOTA 2 [2] ");
                    int verificarAltercaoNotas = sc.nextInt();
                    sc.nextLine();

                    if (verificarAltercaoNotas == 0) {
                        System.out.println("Alteração da Nota 1: ");
                        alunos.setNota1(sc.nextDouble());
                        System.out.println("Alteração Nota 2: ");
                        alunos.setNota2(sc.nextDouble());
                        sc.nextLine();
                        System.out.println("Nota 1 Alterada: " + alunos.getNota1());
                        System.out.println("Nota 2 Alterada: " + alunos.getNota2());
                    } else if (verificarAltercaoNotas == 1) {
                        System.out.println("Alteração da Nota 1: ");
                        alunos.setNota1(sc.nextDouble());
                        System.out.println("Nota 1 Alterada: " + alunos.getNota1());
                    } else if (verificarAltercaoNotas == 2) {
                        System.out.println("Alteração Nota 2: ");
                        alunos.setNota2(sc.nextDouble());
                        System.out.println("Nota 2 Alterada: " + alunos.getNota2());
                    } else {

                    }


                }
                else if (verificarAlteracao == 0) {
                    continue;
                }
                else {
                    System.out.println("-=-=-NÚMERO INVÁLIDO!-=-REINICIE-=-=-");
                    break;
                }
            }
            else if (verificarCadastro == 2) {
                System.out.println("-=-=-ALUNO " + (cont + 1) + "-=-=-");
                System.out.println("Nome Completo: ");
                nome = sc.nextLine();
                System.out.println("Matrícula: ");
                matricula = sc.nextLine();

                AlunosCurso alunos = new AlunosCurso(nome, matricula);

                listaAlunos.add(alunos);

                System.out.println("Deseja alterar algum dado? [0] CONTINUAR [1] NOME [2] MATRÍCULA");
                int verificarAlteracao = sc.nextInt();

                if (verificarAlteracao == 1) {
                    System.out.println("Novo Nome Completo: ");
                    alunos.setNome(sc.nextLine());
                    System.out.println("Nome Atualizado: " + alunos.getNome());
                }
                else if (verificarAlteracao == 2) {
                    System.out.println("Nova Matrícula: ");
                    alunos.setMatricula(sc.nextLine());
                    System.out.println("Matrícula Atualizada: " + alunos.getMatricula());
                }
            }

            System.out.println("-=-=-=-ALUNOS-CADASTRADOS-=-=-=-");


        }
        for (AlunosCurso a : listaAlunos) {
            int index = 0;
            index++;

            if (a.getNota2() > 0.0) {
                System.out.println("Aluno " + index + ":");
                System.out.println("Nome Completo: " + a.getNome());
                System.out.println("Matrícula: " + a.getMatricula());
                System.out.println("Curso: " + a.getCurso());
                System.out.println("Nota 1° Semestre: " + a.getNota1());
                System.out.println("Nota 2° Semestre: " + a.getNota2());
                System.out.println("Média Final: " + a.calcularMedia());
                System.out.println("Resultado: " + a.passouDeAno());
                System.out.println("-=-=-=-=-=-=-=-=-=-=-=-");
            }
            else {
                System.out.println("Aluno " + index + ":");
                System.out.println("Nome Completo: " + a.getNome());
                System.out.println("Matrícula: " + a.getMatricula());
                System.out.println("Curso: Desconhecido");
                System.out.println("Nota 1° Semestre: Desconhecida");
                System.out.println("Nota 2° Semestre: Desconhecida");
                System.out.println("Média Final: Desconhecida");
                System.out.println("Resultado: Desconhecido");
                System.out.println("-=-=-=-=-=-=-=-=-=-=-=-");
            }
        }
    }
}
