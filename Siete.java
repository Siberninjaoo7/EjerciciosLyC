package ejercicios;

import java.util.ArrayList;
import java.util.Arrays;

public class Siete {

	public static void main(String[] args) {
		int limit = 1000000;
		boolean[] isPrime = PrimoS(limit);
		ArrayList<Integer> primes = new ArrayList<>();
		for (int i = 0; i < limit; i++) {
			if (isPrime[i]) {
				primes.add(i);
			}
		}
		int maxLen = 0;
		int maxPrime = 0;
		int start = 0;
		int[] primeSum = new int[primes.size() + 1];
		primeSum[0] = 0;
		for (int i = 0; i < primes.size(); i++) {
			primeSum[i + 1] = primeSum[i] + primes.get(i);
		}
		for (int i = maxLen; i < primeSum.length; i++) {
			for (int j = i - (maxLen + 1); j >= 0; j--) {
				if (primeSum[i] - primeSum[j] > limit) {
					break;
				}
				if (Arrays.binarySearch(primes.toArray(), primeSum[i] - primeSum[j]) >= 0) {
					maxLen = i - j;
					maxPrime = primeSum[i] - primeSum[j];
					start = j;
				}
			}
		}
		System.out.println("El primo que puede expresarse como la suma  de primos consecutivos es: " + maxPrime);
		System.out.println("La secuencia de primos que suman a este número es:");
		for (int i = start; i < start + maxLen; i++) {
			System.out.print(" + " + primes.get(i));
		}
	}

	public static boolean[] PrimoS(int n) { // Devuelve los numeros primos hasta el limitor
		boolean[] isPrime = new boolean[n + 1];
		Arrays.fill(isPrime, 2, n + 1, true);
		for (int i = 2; i * i <= n; i++) {
			if (isPrime[i]) {
				for (int j = i * i; j <= n; j += i) {
					isPrime[j] = false;
				}
			}
		}
		return isPrime;
	}

}
