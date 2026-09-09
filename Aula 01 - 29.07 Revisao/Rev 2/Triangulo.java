package com.mycompany.projetoforma;

public class Triangulo extends FormaGeometrica {
    
    float base;
    float altura;

    public float getBase() {
        return base;
    }

    public float getAltura() {
        return altura;
    }

    public void setBase(float base) {
        this.base = base;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }
    
    @Override
    public float calcularArea(){
        area = base * altura;
        return area;
    }
    
}
