/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author labsycapc13
 */
public class complejo {
    
    private double real;
    private double imaginario;
    
    complejo(double r, double i){
        real = r;
        imaginario = i;
    }
    
    public String toString(){
        String aux = "";
        
        if(imaginario<0) aux += real + "-j" + (-imaginario);
        
        if(imaginario==0) aux += real;
        
        if(imaginario>0) aux += real + "+j" + imaginario;
        
        return aux;
    }
    
    public static complejo conjugado(complejo a){
        complejo nuevo = new complejo(a.real,-a.imaginario);
       
        return nuevo;
    }
    
    public double angulo(){
        return Math.atan2(imaginario,real);
    }
    
    public static complejo suma(complejo a, complejo b){
        double r;
        double i;
            
        r = a.real + b.real;
        i = a.imaginario + b.imaginario;
        complejo suma = new complejo(r,i);
        return suma;
        
    }
    
     public static complejo resta(complejo a, complejo b){
        double r;
        double i;
            
        r = a.real - b.real;
        i = a.imaginario - b.imaginario;
        complejo suma = new complejo(r,i);
        return suma;
        
    }
     
    public static complejo producto(complejo a, complejo b){
        double r;
        double i;
        
        r = a.real*b.real - a.imaginario*b.imaginario;
        i = a.imaginario*b.real + a.real*b.imaginario;
        complejo producto = new complejo(r,i);
        
        return producto;
              
                
    }
    
}
