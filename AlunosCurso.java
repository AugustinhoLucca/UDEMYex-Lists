package entidades;

public class AlunosCurso {

    private String nome;
    private String matricula;
    private String curso;
    private double nota1;
    private double nota2;

    public AlunosCurso(String nome, String matricula) {
        this.nome = nome;
        this.matricula = matricula;
    }

    public AlunosCurso(String nome, String matricula, String curso, double nota1, double nota2) {
        this.nome = nome;
        this.matricula = matricula;
        this.curso = curso;
        this.nota1 = nota1;
        this.nota2 = nota2;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public double getNota1() {
        return nota1;
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public double getNota2() {
        return nota2;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }

    public double calcularMedia () {
        double media = (nota1 + nota2) / 2;
        return media;
    }

    public String passouDeAno () {

        if (calcularMedia() < 6.00) {
            return "REPROVADO";

        }
        else {
            return "APROVADO";
        }
    }

}
