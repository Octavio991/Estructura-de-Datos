/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author labsycapc13
 */
public class prueba {
    
    public static void main(String args[]){
        
        complejo a = new complejo(3,4);
        complejo b = new complejo(1,2);
        complejo c = new complejo(1,-1);
        
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(complejo.conjugado(c));
        System.out.println(a.angulo());
        System.out.println(complejo.suma(a,b));
        System.out.println(complejo.resta(a,b));
        System.out.println(complejo.producto(a,b));
    }
}
