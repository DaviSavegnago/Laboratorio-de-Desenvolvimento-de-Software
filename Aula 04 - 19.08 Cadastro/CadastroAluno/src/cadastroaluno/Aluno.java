/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cadastroaluno;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
/**
 *
 * @author vitor
 */
public class Aluno {
    private String nome; // deve ser nome completo
    private String dataNascimento; // terei de fazer um split depois
    private String sexo;
    private final int idMatricula;
    private static int proximaMatricula = 1;
    private String curso;
    private String cpf;
    //farei uma classe endereço
    private Endereco endereco;
    private String telefone;
    
    public Aluno(String nome, String dataNascimento, String sexo,
            String curso, String cpf, 
            Endereco endereco, String telefone) {
        //validações
        validarNome(nome);
        validarData(dataNascimento);
        validarSexo(sexo);
        validarCurso(curso);
        validarTelefone(telefone);
        //validarMatricula(idMatricula);
        validarCpf(cpf);
        validarEndereco(endereco);
        this.nome = nome;
        this.sexo = sexo;
        this.dataNascimento = dataNascimento;
        this.curso = curso;
        //this.idMatricula = idMatricula;
        this.idMatricula = proximaMatricula++; // na implementação cada aluno novo receberá um valor novo automaticamente
        this.cpf = cpf;
        this.endereco = endereco;
        this.telefone = telefone;
    }
    
    @Override
    public String toString() {
        return idMatricula + ";" + nome + ";" + dataNascimento + ";" + sexo + ";" +
                curso + ";" + cpf + ";" + telefone + ";" + endereco;
    }

    private void validarNome(String nome) {
        if (nome == null || nome.trim().isEmpty()) {
            throw new IllegalArgumentException("Nome vazio");
        }
        if (!nome.trim().contains(" ")) { // verificamos se o nome contém espaço
            throw new IllegalArgumentException("Informe o nome completo");
        }
    }
    
    private void validarData(String dataNascimento) {
        try {
            LocalDate.parse(dataNascimento, DateTimeFormatter.ofPattern("dd/MM/yyyy")); // localdate parse interpreta a string como o formato escolhido
        } catch (DateTimeException e) {
            throw new IllegalArgumentException("Data de nascimento inválida");
        }
    }

    private void validarSexo(String sexo) {
        if (sexo == null || sexo.trim().isEmpty()) {
            throw new IllegalArgumentException("Sexo não informado");
        }
    }

    private void validarCurso(String curso) {
        if (curso == null || curso.trim().isEmpty()) {
            throw new IllegalArgumentException("Curso não informado");
        }
    }

    private void validarTelefone(String telefone) {
        if (telefone == null || telefone.trim().isEmpty()) {
            throw new IllegalArgumentException("telefone não informado");
        }
    }

    // private void validarMatricula(int idMatricula) {
    //     if (idMatricula <= 0) {
    //         throw new IllegalArgumentException("Matrícula deve ser um número positivo.");
    //     }
    // }
    
    private void validarCpf(String cpf) {
        if (cpf == null || cpf.length() != 11) {
            throw new IllegalArgumentException("CPF deve conter exatamente 11 dígitos numéricos.");
        }
    }

    private void validarEndereco(Endereco endereco) {
        if (endereco == null) {
            throw new IllegalArgumentException("Endereço não informado");
        }        
    }
    
    public String getNome() {
        return nome;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public String getSexo() {
        return sexo;
    }

    public int getIdMatricula() {
        return idMatricula;
    }

    public String getCurso() {
        return curso;
    }

    public String getCpf() {
        return cpf;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public String getTelefone() {
        return telefone;
    }
    
    
}
