package ejercicios;

import java.util.Stack;

public class Dos {

	static int isPrime(int a) {
		if (a <= 1)
			return 0;

		if (a == 2 || a == 3) {
			return a;
		}
		if(a%2==0 ||a%3==0)
			return 0;

		for (int i = 5; i * i <= a; i = i + 6) {
			if (a % i == 0 || a % (i + 2) == 0)
				return 0;
		}
		return a;
	}

	
	public static void main(String[] args) {
		int n = 7;
		
		while (n>0) {
			System.out.println(isPrime(n));
			n--;
		}

	}

}
