
public class complejo {
    
    private double real;
    private double imaginario;
    
    complejo(double r, double i){
        real = r;
        imaginario = i;
    }
    
    public String toString(){
        String aux = "";
        
        if(imaginario<0){
            aux += real + "-j" + (-imaginario);
            return aux;
        }
        
        else if(imaginario==0) {
        	aux += real;
        	return aux;
        }
        
        else {
        	aux += real + "+j" + imaginario;
        	return aux;
        }
           
    }
    
    public double real() {
    	return real;
    }
    
    public double imaginaria() {
    	return imaginario;
    }
    
    
    public double magnitud() {
    	double magnitud = Math.sqrt(Math.pow(real,2) + Math.pow(imaginario,2));
    	return magnitud;
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
    
    public static complejo division(complejo a, complejo b) {
    	complejo conjugado = complejo.conjugado(b);
    	complejo producto = complejo.producto(a, conjugado);
    	double divisor = Math.pow(b.magnitud(),2);
    	complejo resultado = new complejo(producto.real/divisor, producto.imaginario/divisor);
    	return resultado;
    }
    /*
    public static boolean comparar(complejo a, complejo b){
        boolean aux = true;
        
        if(a.real==b.real && a.imaginario==b.imaginario){
            return aux;
        }
        else
            aux = false;
               
        return aux;
    }
    */
    
    public boolean equals(Object resives){
        complejo valor = (complejo) resives;
        return(valor.real ==this.real && valor.imaginario==this.imaginario);
    }
    
}
