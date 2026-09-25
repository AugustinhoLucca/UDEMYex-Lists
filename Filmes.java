package entidades;

public class Filmes {

    private String titulo;
    private String genero;
    private int classIndicativa;
    private int anoDeLancamento;
    private double nota;

    public Filmes(String titulo) {
        this.titulo = titulo;
    }

    public Filmes(String titulo, String genero) {
        this.titulo = titulo;
        this.genero = genero;
    }

    public Filmes(String titulo, String genero, int classIndicativa, int anoDeLancamento, double nota) {
        this.titulo = titulo;
        this.genero = genero;
        this.classIndicativa = classIndicativa;
        this.anoDeLancamento = anoDeLancamento;
        this.nota = nota;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getClassIndicativa() {
        return classIndicativa;
    }

    public void setClassIndicativa(int classIndicativa) {
        this.classIndicativa = classIndicativa;
    }

    public int getAnoDeLancamento() {
        return anoDeLancamento;
    }

    public void setAnoDeLancamento(int anoDeLancamento) {
        this.anoDeLancamento = anoDeLancamento;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    public String verificarNota () {
        if (nota < 2.0) {
            return "Péssimo";
        }
        else if (nota < 4.0) {
            return "Ruim";
        }
        else if (nota < 5.5) {
            return "Regular";
        }
        else if (nota < 7.0) {
            return "Bom";
        }
        else if (nota < 8.5) {
            return "Muito Bom";
        }
        else {
            return "Excelente";
        }
    }

    public String verificarEpoca() {
        if (anoDeLancamento < 1970) {
            return "Antigo (anterior à 1970)";
        }
        else if (anoDeLancamento < 1980) {
            return "Anos 70";
        }
        else if (anoDeLancamento < 1990) {
            return "Anos 80";
        }
        else if (anoDeLancamento < 2000) {
            return "Anos 90";
        }
        else if (anoDeLancamento < 2010) {
            return "Anos 2000";
        }
        else if (anoDeLancamento < 2020) {
            return "Era Digital (Década de 2010)";
        }
        else {
            return "Moderno (Pós Pandemia)";
        }
    }

    
    public String verifClassificacaoIndicativa() {
        if (classIndicativa < 13) {
            return "Livre para todas as idades";
        }
        else if (classIndicativa < 16) {
            return "Maiores de 13 anos";
        }
        else if (classIndicativa < 18) {
            return "Maiores de 16 anos";
        }
        else {
            return "Maiores de Idade (+18)";
        }
    }

}
