package programas;
import entidades.Funcionario;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class programa_funcionario {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantos funcionários serão cadastrados? ");
        int qtdFunc = sc.nextInt();
        sc.nextLine();

        List<Funcionario> listaFuncionarios = new ArrayList<>();

        for (int cont = 0; cont < qtdFunc; cont++) {

            System.out.println("-=-=-FUNCIONÁRIO " + (cont + 1) + "-=-=-");
            System.out.println("ID: ");
            int id = sc.nextInt();
            sc.nextLine();
            System.out.println("Nome: ");
            String nome = sc.nextLine();
            System.out.println("Salário: ");
            double salario = sc.nextDouble();
            sc.nextLine();

            Funcionario funcionario = new Funcionario(id, nome, salario);

            listaFuncionarios.add(funcionario);

            System.out.println("Deseja alterar algum dado? [0] CONTINUAR | [1] ID | [2] NOME | [3] SALÁRIO");
            int verificarAlteracao = sc.nextInt();
            sc.nextLine();

            if (verificarAlteracao == 0) {
                continue;
            }
            else if (verificarAlteracao == 1) {
                System.out.println("Alteração de ID: ");
                listaFuncionarios.get(cont).setId(sc.nextInt());
                System.out.println("ID atualizado: " + listaFuncionarios.get(cont).getId());
            }
            else if (verificarAlteracao == 2) {
                System.out.println("Alteração de Nome: ");
                listaFuncionarios.get(cont).setNome(sc.nextLine());
                System.out.println("Nome atualizado: " + listaFuncionarios.get(cont).getNome());
            }
            else if (verificarAlteracao == 3) {
                System.out.println("Alteração de Salário: ");
                listaFuncionarios.get(cont).setSalario(sc.nextDouble());
                System.out.println("Salário atualizado: " + listaFuncionarios.get(cont).getSalario());
            }
            else {
                System.out.println("-=-=-INVÁLIDO REINICIE O PROGRAMA-=-=-");
                sc.close();
                break;
            }

        }

        System.out.println("-=-=-=-LISTA-DE-FUNCIONÁRIOS-=-=-=-");

        for (int cont = 0; cont < listaFuncionarios.size(); cont++) {

            System.out.println(listaFuncionarios.get(cont));
            System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
        }

        System.out.println("Digite o ID do funcionário à receber o aumento: ");
        int verifIdAumento = sc.nextInt();

        for (int cont = 0; cont < listaFuncionarios.size(); cont++) {

            if (verifIdAumento == listaFuncionarios.get(cont).getId()) {

                System.out.println("Qual será o valor do aumento em porcentagem: [Não digite '%']");
                int valorAumento = sc.nextInt();
                sc.nextLine();

                listaFuncionarios.get(cont).setValorAumento(valorAumento);

                System.out.println("Salário Atualizado: " + listaFuncionarios.get(cont).aumento());
                System.out.println(" ");
            }
        }

        System.out.println("Digite o ID do funcionário que será demitido:");
        int verifIdDemissao = sc.nextInt();

        boolean idEncontrado = false;

        for (int cont = 0; cont < listaFuncionarios.size(); cont++) {

            if (verifIdDemissao == listaFuncionarios.get(cont).getId()) {
                idEncontrado = true;
                listaFuncionarios.remove(cont);
                break;
            }
        }
        if (!idEncontrado){
            System.out.println("-=-=-INVÁLIDO REINICIE O PROGRAMA-=-=-");
        }

        System.out.println("-=-=-=-LISTA-ATUALIZADA-=-=-=-");

        for (int cont = 0; cont < listaFuncionarios.size(); cont++) {

            System.out.println(listaFuncionarios.get(cont));
            System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
        }

    }
}
