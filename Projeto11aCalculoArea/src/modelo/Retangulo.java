/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author yuril
 */
public class Retangulo {
    //ATRIBUTOS
    private float base;    
    private float altura;
    
    //CONSTRUTORES
    //VAZIO
    public Retangulo() {
    }
    
    //CHEIO
    public Retangulo(float base, float altura) {
        this.base = base;
        this.altura = altura;
    }
    
    //GETTERS E SETTERS
    public float getBase() {
        return base;
    }

    public void setBase(float base) {
        this.base = base;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }
    
    //MÉTODOS DA CLASSE
    float calcularArea(float b, float h){
        float result;
        result = b * h;
        return result;
    }
    
    float calcularPerimetro(float b, float h){
        float result;
        result = (2*b) + (2*h);
        return result;
    }
}
