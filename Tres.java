package ejercicios;

public class Tres {

	static int lim = 1000;
	static long top = Integer.MAX_VALUE;

	long reverse(long n) {
		long revNum = 0;
		while (n > 0) {
			revNum = revNum * 10 + n % 10;
			n = n / 10;
		}
		return revNum;
	}

	public boolean isPalindrome(long n) {
		return (reverse(n) == n);
	}

	public void sumavoltea(long n) {
		int counter = 0;
		long r = 0;
		boolean flag =false;
		while(n<=Integer.MAX_VALUE && counter <= lim && !flag) {
			r = reverse(n);
			n = n+r;
			if(isPalindrome(n) && n>100) {
				flag = true;
			}
			counter++;
		}
		if(n> Integer.MAX_VALUE) {
			System.out.println("No se encontro palindromo");
		}else {
			System.out.println("El palindromo es: " +n +"\n"+"Logrado con "+counter+" iteraciones");
		}

	}

	public static void main(String[] args) {
		Tres tre = new Tres();
		tre.sumavoltea(3);
	}
}
