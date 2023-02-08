/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Circunferencia;

/**
 *
 * @author lucho
 */
public class Circunferencia {
    
    private double radio;

    public Circunferencia() {
    }

    public Circunferencia(double radio) {
        this.radio = radio;
        
    
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
    
    public String crearCircunferencia(double radio){
        
        double circun;
        
        circun = Math.PI * radio;
                
        return "Con radio: "+ radio + " La circunferencia es:" + circun;       
        
        
        
    }
    

    @Override
    public String toString() {
        return "Circunferencia{" + "radio=" + radio + '}';
    }
    
    
    
}
