package ejercicios;

import java.util.HashSet;
import java.util.Set;

public class Cuatro {

	public static int primerRepetido(int[] ar) {
		Set<Integer> r = new HashSet<Integer>();

		for (int i : ar) {
			if (r.add(i) == false)
				return i;
		}
		return -1;
	}

	public static void main(String[] args) {

		int[] array ={2, 1, 3, 5, 3, 2};

		System.out.println(primerRepetido(array));
		
	}

}
