package Class;

public class InputModel {

    private int quantAlunos;

    private int quantAprovados;

    private int quantReprovados;

    private double menorNota;

    private double maiorNota;

    public InputModel(int quantAlunos, int quantAprovados, int quantReprovados, double menorNota, double maiorNota,
            double mediaGeral) {
        this.quantAlunos = quantAlunos;
        this.quantAprovados = quantAprovados;
        this.quantReprovados = quantReprovados;
        this.menorNota = menorNota;
        this.maiorNota = maiorNota;
        MediaGeral = mediaGeral;
    }

    private double MediaGeral;

    public int getQuantAlunos() {
        return quantAlunos;
    }

    public void setQuantAlunos(int quantAlunos) {
        this.quantAlunos = quantAlunos;
    }

    public int getQuantAprovados() {
        return quantAprovados;
    }

    public void setQuantAprovados(int quantAprovados) {
        this.quantAprovados = quantAprovados;
    }

    public int getQuantReprovados() {
        return quantReprovados;
    }

    public void setQuantReprovados(int quantReprovados) {
        this.quantReprovados = quantReprovados;
    }

    public double getMenorNota() {
        return menorNota;
    }

    public void setMenorNota(double menorNota) {
        this.menorNota = menorNota;
    }

    public double getMaiorNota() {
        return maiorNota;
    }

    public void setMaiorNota(double maiorNota) {
        this.maiorNota = maiorNota;
    }

    public double getMediaGeral() {
        return MediaGeral;
    }

    public void setMediaGeral(double mediaGeral) {
        MediaGeral = mediaGeral;
    }

    @Override
    public String toString() {
        return quantAlunos + ";" + quantAprovados + ";"
                + quantReprovados + ";" + menorNota + ";" + maiorNota + ";"
                + MediaGeral;
    }

}
