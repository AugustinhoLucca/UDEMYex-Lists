package entidades;

public class Funcionario {

    private int id;
    private String nome;
    private double salario;
    private double valorAumento;

    public Funcionario(int id) {
        this.id = id;
    }

    public Funcionario(int id, String nome, Double salario) {
        this.id = id;
        this.nome = nome;
        this.salario = salario;
    }

    public Double aumento () {
        return salario * (valorAumento / 100);
    }
}
