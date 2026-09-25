package programas;

import entidades.Filmes;
import entidades.Funcionario;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class programa_filmes {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantos filmes serão cadastrados? ");
        int qtdFilmes = sc.nextInt();
        sc.nextLine();

        List<Filmes> list = new ArrayList<>();

        for (int cont = 0; cont < qtdFilmes; cont++) {

            System.out.println("Deseja cadastrar apenas Título e Gênero [1] ou Todas as Informações [2] do filme " + (cont + 1) + "?");
            int verifDados = sc.nextInt();
            sc.nextLine();

            if (verifDados == 2) {

                System.out.println("-=-=-FILME " + (cont + 1) + "-=-=-");
                System.out.println("Título: ");
                String titulo = sc.nextLine();
                System.out.println("Gênero: ");
                String genero = sc.nextLine();
                System.out.println("Classificação Indicativa: ");
                int classIndicativa = sc.nextInt();
                sc.nextLine();
                System.out.println("Ano de Lançamento: ");
                int anoDeLancamento = sc.nextInt();
                sc.nextLine();
                System.out.println("Nota: ");
                double nota = sc.nextDouble();
                sc.nextLine();

                Filmes filmes = new Filmes(titulo, genero, classIndicativa, anoDeLancamento, nota);

                list.add(filmes);

                System.out.println("Deseja alterar algum dado? CONTINUAR[0] - TÍTULO[1] - GÊNERO[2]" +
                        " - CLASS. INDICATIVA[3] - ANO DE LANÇAMENTO[4] - NOTA [5]");
                int verifAlteracao = sc.nextInt();
                sc.nextLine();

                if (verifAlteracao == 1) {

                    System.out.println("Novo Título: ");
                    filmes.setTitulo(sc.nextLine());
                    System.out.println("Título Atualizado: " + filmes.getTitulo());

                } else if (verifAlteracao == 2) {

                    System.out.println("Novo Gênero: ");
                    filmes.setGenero(sc.nextLine());
                    System.out.println("Gênero Atualizado: " + filmes.getGenero());
                    continue;
                } else if (verifAlteracao == 3) {

                    System.out.println("Nova Classificação Indicativa: ");
                    filmes.setClassIndicativa(sc.nextInt());
                    sc.nextLine();
                    System.out.println("Classificação Indicativa Atualizada: " + filmes.getClassIndicativa());
                } else if (verifAlteracao == 4) {

                    System.out.println("Novo Ano de Lançamento: ");
                    filmes.setAnoDeLancamento(sc.nextInt());
                    sc.nextLine();
                    System.out.println("Ano de Lançamento Atualizado: " + filmes.getAnoDeLancamento());
                } else if (verifAlteracao == 5) {

                    System.out.println("Nova Nota: ");
                    filmes.setNota(sc.nextDouble());
                    sc.nextLine();
                    System.out.println("Nota Atualizada: " + filmes.getNota());
                } else if (verifAlteracao == 0) {
                    continue;
                } else {

                    System.out.println("-=-=- NÚMERO INVÁLIDO! -=-=-=- REINICIE O PROGRAMA -=-=-");
                    sc.close();
                    break;
                }

            } else if (verifDados == 1) {

                System.out.println("-=-=-FILME " + (cont + 1) + "-=-=-");
                System.out.println("Título: ");
                String titulo = sc.nextLine();
                System.out.println("Gênero: ");
                String genero = sc.nextLine();

                Filmes filmes = new Filmes(titulo, genero);

                list.add(filmes);

                System.out.println("Deseja alterar algum dado? CONTINUAR[0] - TÍTULO[1] - GÊNERO[2]");
                int verifAlteracao = sc.nextInt();
                sc.nextLine();

                if (verifAlteracao == 1) {

                    System.out.println("Novo Título: ");
                    filmes.setTitulo(sc.nextLine());
                    System.out.println("Título Atualizado: " + filmes.getTitulo());

                } else if (verifAlteracao == 2) {

                    System.out.println("Novo Gênero: ");
                    filmes.setGenero(sc.nextLine());
                    System.out.println("Gênero Atualizado: " + filmes.getGenero());
                }
                else if (verifAlteracao == 0) {
                    continue;
                }
                else {

                    System.out.println("-=-=- NÚMERO INVÁLIDO! -=-=-=- REINICIE O PROGRAMA -=-=-");
                    sc.close();
                    break;
                }


            } else {

                System.out.println("-=-=- NÚMERO INVÁLIDO! -=-=-=- REINICIE O PROGRAMA -=-=-");
                sc.close();
                break;
            }



        }

        System.out.println(" ");
        System.out.println("-=-=-=-FILMES CADASTRADOS-=-=-=-");
        int indice = 0;

        for (Filmes f : list) {
            indice++;

            if (f.getNota() <= 0.0) {

                System.out.println("Filme " + indice + ":");
                System.out.println("Título: " + f.getTitulo());
                System.out.println("Gênero: " + f.getGenero());
                System.out.println("Classificação Indicativa: Desconhecida");
                System.out.println("Ano de Lançamento: Desconhecido");
                System.out.println("Avaliação da Crítica: Desconhecida");
                System.out.println(" ");

            }
            else {

                System.out.println("Filme " + indice + ":");
                System.out.println("Título: " + f.getTitulo());
                System.out.println("Gênero: " + f.getGenero());
                System.out.println("Classificação Indicativa: " + f.verifClassificacaoIndicativa());
                System.out.println("Ano de Lançamento: " + f.getAnoDeLancamento() + " - " + f.verificarEpoca());
                System.out.println("Avaliação da Crítica: " + f.getNota() + " - " + f.verificarNota());
                System.out.println(" ");

            }
        }
    }
}
