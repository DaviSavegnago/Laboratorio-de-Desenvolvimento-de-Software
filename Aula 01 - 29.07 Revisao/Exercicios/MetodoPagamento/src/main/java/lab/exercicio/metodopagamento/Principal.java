/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab.exercicio.metodopagamento;

/**
 *
 * @author vitor
 */
public class Principal {
    public static void main(String[] args) {
        CartaoCreditoPagamento cartao = new CartaoCreditoPagamento();
        PixPagamento pix = new PixPagamento();
        PayPalPagamento PayPal = new PayPalPagamento();
        
        cartao.processaPagamento(500);
        cartao.mostraDetalhesPagamento();
        
        System.out.println("====");
        pix.processaPagamento(458);
        pix.mostraDetalhesPagamento();
        System.out.println("====");
        
        PayPal.processaPagamento(4212);
        PayPal.mostraDetalhesPagamento();
    }
}
