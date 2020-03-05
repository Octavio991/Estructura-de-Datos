import java.util.Scanner;

public class sumaconVectores {
	public static void main(String[] args) {
		
		int p = 0;
		
		int[] VectA= new int[10];
		int[] VectB= new int[10];
		int[] VectSuma = new int[11];
		
		Scanner entrada = new Scanner(System.in);
		String numA = entrada.nextLine();
		String numB = entrada.nextLine();
		
		for(int i=0; i<numA.length(); i++) {
			char a = numA.charAt(i); //caracter del string en la posición i.
			char b = numB.charAt(i);
			int x = Character.getNumericValue(a); //Obtiene el valor numérico de un caracter.
			int y = Character.getNumericValue(b);
			
			VectA[i] = x;
			VectB[i] = y;
		}	
		
		for(int i=0; i<10; i++) {
			int n = 9-i;
			int s = VectA[n] + VectB[n] + p;
			
			if(s >= 10 ) {
				VectSuma[n+1] = s-10;
				p = 1;
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
