/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab.exercicio.metodopagamento;

/**
 *
 * @author vitor
 */
public class PayPalPagamento extends MetodoPagamento {
    
    public PayPalPagamento(){
        super("PayPal");
    }
    
    @Override
    public void processaPagamento(double valor) {
        System.out.println("Pagamento de: " + valor + " efetuado com sucesso" );
    }
    
    @Override
    public void mostraDetalhesPagamento(){
        System.out.println("Método de pagamento: " + getNomeMetodo());
        System.out.println("Id do pagamento: " + getIdPagamento());
    }
}
