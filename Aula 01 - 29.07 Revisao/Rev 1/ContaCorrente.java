/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projetoconta;

/**
 *
 * @author laboratorio
 */
public class ContaCorrente {
    
    private float saldo;
    
    public void definirSaldoInicial(float valor){
        saldo = valor;
    }
    
    public void depositar(float valor){
        saldo = saldo + valor;
    }
    
    public boolean sacar(float valor){
        if (saldo >= valor) {
            this.saldo -= valor;
            return true;
        } else
            return false;
    }
    
    public float getSaldo() {
            return this.saldo;
        }
    
}
