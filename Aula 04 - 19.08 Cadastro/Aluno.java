package cadastroalunos;

public class Aluno {

    private String nome;
    private String dataNascimento;
    private String sexo;
    private int matricula;
    private String curso;
    private String cpf;
    private String endereco;
    private String estado;
    private String telefone;

    public Aluno(String nome, String dataNascimento, String sexo,
                 int matricula, String curso, String cpf,
                 String endereco, String estado, String telefone) {

        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.sexo = sexo;
        this.matricula = matricula;
        this.curso = curso;
        this.cpf = cpf;
        this.endereco = endereco;
        this.estado = estado;
        this.telefone = telefone;
    }

    public int getMatricula() {
        return matricula;
    }

    @Override
    public String toString() {
        return nome + ";" +
               dataNascimento + ";" +
               sexo + ";" +
               matricula + ";" +
               curso + ";" +
               cpf + ";" +
               endereco + ";" +
               estado + ";" +
               telefone;
    }
}