/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab.exercicio.formageometrica;

/**
 *
 * @author vitor
 */
public class TrianguloForma extends FormaGeometrica {
    private float base;
    private float altura;
    
    
    public TrianguloForma(float base, float altura){
    this.altura = altura;
    this.base = base;
    }
    
    @Override
    public void calcularArea(){
        float area = (base * altura)/2;
        
        System.out.println("Area do triangulo: " + area);
    }
    
}
