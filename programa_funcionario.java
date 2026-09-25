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

        List<Funcionario> list = new ArrayList<>();

        for (int cont = 0; cont < qtdFunc; cont++) {

            System.out.println("-=-=-FUNCIONÁRIO " + (cont += 1) + "-=-=-");
            System.out.println("ID: ");
            int id = sc.nextInt();
            sc.nextLine();
            System.out.println("Nome: ");
            String nome = sc.nextLine();
            System.out.println("Salário: ");
            double salario = sc.nextDouble();
            sc.nextLine();

            Funcionario funcionarioObj = new Funcionario(id, nome, salario);

            list.add(funcionarioObj);


        }

        System.out.println("Digite o ID do funcionário à receber o aumento: ");
        int verifAumento = sc.nextInt();



    }
}
