package ejercicios;

public class Seis {

	public static void arbolNavidad(String secuencia, int numPisos) {
		int pisoActual=1;
		int tamaño=secuencia.length();
		int charIndex=0;
		while(pisoActual <= numPisos) {
			for(int i=numPisos-pisoActual+1; i >= 1; i--) {
				System.out.print(" ");
			}
			for(int i=pisoActual; i > 0; i--) {
				if(charIndex == tamaño) {
					charIndex=0;
				}
				System.out.print(secuencia.charAt(charIndex)+ " ");
				charIndex++;
			}
			System.out.println();
			pisoActual++;
			
			
			
		}
		for(int i=0; i<numPisos; i++)
			System.out.print(" ");
		System.out.println("|");
	}
	public static void main(String[] args) {

		String cadena = "123";
		int altura = 9;

		arbolNavidad(cadena,altura);

	}

}
