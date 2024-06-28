import Class.Aluno;
import Class.FileManager;
import Class.InputModel;

public class App {
    public static void main(String[] args) throws Exception {

        var alunos = FileManager.LerAlunos();

        int quantAlunos = alunos.size();
        double mediaGeral = 0;
        int quantAprovados = 0;
        int quantReprovados = 0;
        double menorNota = 0;
        double maiorNota = 0;

        for (Aluno aluno : alunos) {

            System.out.println(aluno.toString());

        }

        for (Aluno aluno : alunos) {

            if (aluno.getNota() > maiorNota) {
                maiorNota = aluno.getNota();
            }

            if (aluno.getNota() < menorNota) {
                menorNota = aluno.getNota();
            }

            if (aluno.getNota() >= 6) {
                quantAprovados++;
            } else {
                quantReprovados++;
            }

            mediaGeral += aluno.getNota();

        }

        mediaGeral = mediaGeral / quantAlunos;

        var input = new InputModel(quantAlunos, quantAprovados, quantReprovados, menorNota, maiorNota, mediaGeral);

        FileManager.escreverAlunos(input);

    }
}
