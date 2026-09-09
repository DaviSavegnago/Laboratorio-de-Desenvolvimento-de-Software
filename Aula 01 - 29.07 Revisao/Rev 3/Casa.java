package com.mycompany.projetocasa;

public class Casa {
        
    public float calcularPreco (int tamanho){
        float precoPMetro = 2000;
        return tamanho * precoPMetro;
    }
    
    public float calcularPreco(int tamanho, int quartos) {
        float precoBase = calcularPreco(tamanho);
        float precoPorQuarto = 15000f;
        return precoBase + (quartos * precoPorQuarto);
    }

}
