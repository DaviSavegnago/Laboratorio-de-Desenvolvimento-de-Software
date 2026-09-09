package com.mycompany.projetoforma;

public class Principal {
    
    public static void main(String[] args) {
        
        FormaGeometrica quadrado = new FormaGeometrica();
        quadrado.setLado (3.44f);
        float area;
        area = quadrado.calcularArea();
        System.out.println("Área do quadrado: "+area);
        
        Triangulo t = new Triangulo();
        t.setAltura(4f);
        t.setBase(3f);
        area = t.calcularArea();
        System.out.println("Área do retângulo: "+area);
        
    }
}
