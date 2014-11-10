/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.jc.elementos.controller;

/**
 *
 * @author Ricardo.huarte
 */
public class Cuadrado implements Superficie{
    
    int lado;

    public Cuadrado(int lado) {
        this.lado = lado;
    }

    public int getLado() {
        return lado;
    }

    public void setLado(int lado) {
        this.lado = lado;
    }

    public String calcularArea() {
        
         
       
       int area=lado*lado;
       return "El área es: " + area;
       
   
    
    }

  
    
    
    
}
