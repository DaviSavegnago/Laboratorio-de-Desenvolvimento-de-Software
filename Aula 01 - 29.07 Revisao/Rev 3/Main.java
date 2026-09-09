
package com.mycompany.projetocasa;

public class Main {
    
    public static void main(String[] args) {
        
        Casa c = new Casa();

        int tamanho = 100;
        double precoApenasTamanho = c.calcularPreco(tamanho);
        System.out.println("Preço para " + tamanho + "m²: R$ " + precoApenasTamanho);

        int quartos = 3;
        double precoComQuartos = c.calcularPreco(tamanho, quartos);
        System.out.println("Preço para " + tamanho + "m² com " + quartos + " quartos: R$" + precoComQuartos);
}
    
}
