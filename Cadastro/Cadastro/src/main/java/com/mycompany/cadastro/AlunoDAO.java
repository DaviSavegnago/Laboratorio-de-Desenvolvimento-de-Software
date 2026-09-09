import java.io.*;
import java.util.ArrayList;

public class AlunoDAO {

    private static final String ARQUIVO = "alunos.txt";

    public static void salvar(ArrayList<Aluno> alunos) {

        try {
            FileWriter fw = new FileWriter(ARQUIVO);
            BufferedWriter bw = new BufferedWriter(fw);

            for (Aluno aluno : alunos) {

                bw.write(
                    aluno.getNome() + ";" +
                    aluno.getDataNascimento() + ";" +
                    aluno.getSexo() + ";" +
                    aluno.getMatricula() + ";" +
                    aluno.getCurso() + ";" +
                    aluno.getCpf() + ";" +
                    aluno.getRua() + ";" +
                    aluno.getNumero() + ";" +
                    aluno.getBairro() + ";" +
                    aluno.getCidade() + ";" +
                    aluno.getCep() + ";" +
                    aluno.getEstado() + ";" +
                    aluno.getTelefone()
                );

                bw.newLine();
            }

            bw.close();

        } catch (IOException e) {
            System.out.println("Erro ao salvar arquivo: " + e.getMessage());
        }
    }

    public static ArrayList<Aluno> carregar() {

        ArrayList<Aluno> alunos = new ArrayList<>();

        File arquivo = new File(ARQUIVO);

        if (!arquivo.exists()) {
            return alunos;
        }

        try {

            FileReader fr = new FileReader(ARQUIVO);
            BufferedReader br = new BufferedReader(fr);

            String linha;

            while ((linha = br.readLine()) != null) {

                String[] dados = linha.split(";");

                if (dados.length == 13) {

                    Aluno aluno = new Aluno(
                        dados[0],
                        dados[1],
                        dados[2],
                        dados[3],
                        dados[4],
                        dados[5],
                        dados[6],
                        dados[7],
                        dados[8],
                        dados[9],
                        dados[10],
                        dados[11],
                        dados[12]
                    );

                    alunos.add(aluno);
                }
            }

            br.close();

        } catch (IOException e) {
            System.out.println("Erro ao carregar arquivo: " + e.getMessage());
        }

        return alunos;
    }
}