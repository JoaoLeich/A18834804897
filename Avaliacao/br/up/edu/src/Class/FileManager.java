package Class;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FileManager {

    private static String arquivo = "C:\\Users\\autologon\\Desktop\\ProvaJavaFinal\\A1A18834804897\\Avaliacao\\alunos.csv";
    private static String arquivoResumo = "C:\\Users\\autologon\\Desktop\\ProvaJavaFinal\\A1A18834804897\\Avaliacao\\resumo.csv";

    public static List<Aluno> LerAlunos() {

        List<Aluno> ListaDeAlunos = new ArrayList<>();

        try {

            FileReader arquivoLeitura = new FileReader(arquivo);

            Scanner leitor = new Scanner(arquivoLeitura);

            leitor.nextLine();

            if (leitor.hasNextLine()) {
                leitor.nextLine();
            }

            while (leitor.hasNextLine()) {
                String[] linha = leitor.nextLine().split(";");

                var id = linha[0];
                var nome = linha[1];
                var nota = Float.parseFloat(linha[2].replace(",", "."));

                var AlunoInsert = new Aluno(id, nome, nota);

                ListaDeAlunos.add(AlunoInsert);
            }

            leitor.close();
        } catch (FileNotFoundException e) {

            System.out.println("Arquivo de alunos não encontrado: " + e.getMessage());
        }

        return ListaDeAlunos;
    }

    public static void escreverAlunos(InputModel model) {
        try {

            FileWriter arquivoGravar = new FileWriter(arquivoResumo);
            PrintWriter gravador = new PrintWriter(arquivoGravar);

            gravador.println("quantAlunos;TotalAprovados;TotalReprovados;menorNota;maiorNota;MediaGeral");
            gravador.println(model.toString());

            gravador.close();
            arquivoGravar.close();

        } catch (IOException e) {
            System.out.println("Erro ao escrever arquivo de pessoas: " + e.getMessage());
        }
    }

}
