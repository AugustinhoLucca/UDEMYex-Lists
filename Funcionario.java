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

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double getValorAumento() {
        return valorAumento;
    }

    public Double aumento() {
        return salario += salario * (valorAumento / 100);
    }

    public int getId() {
        return id;
    }

    public void setValorAumento(double valorAumento) {
        this.valorAumento = valorAumento;
    }

    @Override
    public String toString() {
        return "ID: " + id + "| Nome: " + nome + "| Salário: R$" + salario;
    }
}

