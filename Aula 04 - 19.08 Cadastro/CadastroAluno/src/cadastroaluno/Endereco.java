/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cadastroaluno;

/**
 *
 * @author vitor
 */
public class Endereco {
    private String rua;
    private int numero;
    private String bairro;
    private String cidade;
    private String cep;
    private String estado; //combo box aqui, não entendi o que seja
    
    
    
    public Endereco(String rua, Integer numero,
                    String bairro, String cidade,
            String cep, String estado) {
        validarRua(rua);
        validarBairro(bairro);
        validarCidade(cidade);
        validarNumero(numero);
        validarCep(cep);
        validarEstado(estado);
        this.rua = rua;
        this.bairro = bairro;
        this.numero = numero;
        this.cidade = cidade;
        this.cep = cep;
        this.estado = estado;

    }
    
    @Override
    public String toString() {
        return rua + ";" + numero + ";" + bairro + ";" + cidade + ";" + cep + ";" + estado;
    }
    
    private void validarRua(String rua) {
        if (rua == null || rua.trim().isEmpty()) {
            throw new IllegalArgumentException("Nome de Rua vazio");
        }
    }

    private void validarBairro(String bairro) {
        if (bairro == null || bairro.trim().isEmpty()) {
            throw new IllegalArgumentException("Nome de Bairro vazio");
        }
    }

    private void validarCidade(String cidade) {
        if (cidade == null || cidade.trim().isEmpty()) {
            throw new IllegalArgumentException("Nome de cidade vazio");
        }
    }

    private void validarNumero(Integer numero) {
        if (numero == null || numero < 0) {
            throw new IllegalArgumentException("Número inválido");
        }
    }

    private void validarCep(String cep) {
        if (cep == null || cep.length() != 8) {
            throw new IllegalArgumentException("CEP inválido");
            // falta validar se são só numeros, mas é mais complexo
        }
    }

    private void validarEstado(String estado) {
        if (estado == null || estado.trim().isEmpty()) {
            throw new IllegalArgumentException("Estado vazio.");
        }
    }

    public String getRua() {
        return rua;
    }



    public int getNumero() {
        return numero;
    }



    public String getBairro() {
        return bairro;
    }



    public String getCidade() {
        return cidade;
    }



    public String getCep() {
        return cep;
    }



    public String getEstado() {
        return estado;
    }

}
