package Class;

public class Aluno {

    private String Matricula;

    private String Nome;

    private double nota;

    public String getMatricula() {
        return Matricula;
    }

    public void setMatricula(String matricula) {
        Matricula = matricula;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    public Aluno(String matricula, String nome, double nota) {
        Matricula = matricula;
        Nome = nome;
        this.nota = nota;
    }

    @Override
    public String toString() {
        return "Aluno [Matricula=" + Matricula + ", Nome=" + Nome + ", nota=" + nota + "]";
    }

}
