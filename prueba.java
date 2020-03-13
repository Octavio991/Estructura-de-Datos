public class prueba {
    
    public static void main(String args[]){
        
        complejo a = new complejo(3,4);
        complejo b = new complejo(1,3);
        
        System.out.println(a);
        System.out.println(b);    
        System.out.println(a.real());
        System.out.println(a.imaginaria());
        System.out.println(complejo.conjugado(a));        
        System.out.println(a.angulo());
        System.out.println(complejo.division(a,b));
        System.out.println(complejo.suma(a,b));
        System.out.println(complejo.resta(a,b));
        System.out.println(complejo.producto(a,b));
        System.out.println(a.magnitud());
        System.out.println(a.equals(b));
         
       // Tratar de comparar con"==" solo funciona con típos básicos, no con objetos.

        
    }
}
