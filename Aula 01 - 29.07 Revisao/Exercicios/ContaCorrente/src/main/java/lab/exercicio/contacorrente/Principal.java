/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab.exercicio.contacorrente;

/**
 *
 * @author vitor
 */
public class Principal {
    
    public static void main(String[] args) {
        ContaCorrente novaConta = new ContaCorrente();
        
        novaConta.definirSaldoInicial(1000);
        novaConta.sacar(500);
        novaConta.depositar(50);
        System.out.println("Seu saldo atual: " + novaConta.getSaldo());
        novaConta.sacar(600);
        System.out.println("Seu saldo atual: " + novaConta.getSaldo());
    }
    
}
