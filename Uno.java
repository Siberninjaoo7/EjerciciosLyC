package ejercicios;

import java.util.Scanner;

/*hacer metodo para Dado un vector de números enteros,
 *  se debe encontrar el elemento que no se encuentra
repetido*/
public class Uno {
	
	public int repetido(int[] vect, int act, int sec) {
		
		
		if(vect[act] == vect[sec] && act !=sec) {
			act++;
		sec++;
		}
		else
			sec++;
		 if(sec == vect.length-1) {
			 act++;
			 sec =0;
		 }
		 
		 repetido(vect, act, sec);
		 
		return vect[act];
		
	}
	
	
	public int repetido2(int ve[]) {
		int pos =0;
		int i =0;
		int act = ve.length-1;
		while(i<ve.length && act>0 && i != act) {
			act--;
			i++;
		}
		pos = i;
		return ve[pos];
	}

	public static void main(String[] args) {
		int vec[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 8, 7, 6, 5, 4, 3, 2, 1 };
		Uno un = new Uno();
		System.out.println(un.repetido2(vec));

	}
}
