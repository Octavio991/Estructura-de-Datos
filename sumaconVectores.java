package sumavectores;

import java.util.Scanner;

public class SumaVectores {
	public static void main(String[] args) {
		
		int p = 0;
		
		int[] VectA= new int[10];
		int[] VectB= new int[10];
		int[] VectSuma = new int[11];
		
		Scanner entrada = new Scanner(System.in);
		String numA = entrada.nextLine();
		String numB = entrada.nextLine();
		
		for(int i=0; i<numA.length(); i++) {//para recorrer la cadena numA 
                        int n = 9-i;
                        int m = numA.length()-i-1; //empezara a tomar los valores desde la unidad.
			char a = numA.charAt(m); //caracter del string en la posición i.			
			int x = Character.getNumericValue(a); //Obtiene el valor numérico de un caracter.		
			
			VectA[n] = x;			
		}	
                
                for(int i=0; i<numB.length(); i++) {//para recorrer la cadena numB
                        int n = 9-i;
                        int m = numB.length()-i-1; //empezara a tomar los valores desde la unidad.
			char b = numB.charAt(m);
			int y = Character.getNumericValue(b);
			
			VectB[n] = y;
		}	
		
		for(int i=0; i<10; i++) {
			int n = 9-i;
			int s = VectA[n] + VectB[n] + p; //suma los dos numeros de la misma posición
			
			if(s >= 10 ) { //Si el resultado es mayor a 10 pone la unidad.
				VectSuma[n+1] = s-10;
				p = 1; //La decena qe sobra la sumará en la sig iteración.
				if(n == 0) { 
					VectSuma[0] = 1;
				}
			}
			
			if(s < 10) { 
				VectSuma[n+1] = s;
				p = 0;
			}
		}
		
		for(int num:VectSuma) {
			System.out.print(num);
		}
		
		
	}
}
