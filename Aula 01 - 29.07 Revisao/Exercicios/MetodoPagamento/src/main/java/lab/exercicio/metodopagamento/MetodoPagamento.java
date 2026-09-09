/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package lab.exercicio.metodopagamento;

import java.util.Random;

/**
 *
 * @author vitor
 */
public abstract class MetodoPagamento {
   private String nomeMetodo;
   private int idPagamento;
   //int id = (int) (Math.random() * 900000) + 100000;
   
   public MetodoPagamento(String nomeMetodo){
    this.nomeMetodo = nomeMetodo;
    Random random = new Random();
    this.idPagamento = random.nextInt(900000) + 100000;
   }
   
   public abstract void processaPagamento(double valor);
     
   public abstract void mostraDetalhesPagamento();
   
   public String getNomeMetodo(){
       return nomeMetodo;
   }
   
   public int getIdPagamento(){
    return idPagamento;
   }
   
   
}
