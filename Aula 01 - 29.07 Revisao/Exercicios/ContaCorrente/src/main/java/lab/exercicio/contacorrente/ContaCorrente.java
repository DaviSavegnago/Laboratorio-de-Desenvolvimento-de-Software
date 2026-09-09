/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package lab.exercicio.contacorrente;

/**
 *
 * @author vitor
 */
public class ContaCorrente {
    
    private float saldo;
    
    public void definirSaldoInicial(float valor){
    this.saldo+=valor;
    }
    
    public void depositar(float valor){
    this.saldo += valor;
    }
    
    public boolean sacar(float valor){
        if (valor<=this.saldo) {
            this.saldo = saldo - valor;
            System.out.println("Saque feito com sucesso.");
            return true;
        }
        System.out.println("Não possui tal valor para saque");
        return false;
}

    public float getSaldo() {
        return saldo;
    }
 
}
