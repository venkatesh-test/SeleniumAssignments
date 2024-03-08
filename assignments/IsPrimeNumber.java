package week1.assignments;

public class IsPrimeNumber {
	public static void main(String[] args) {
		
		int range = 15;
		for (int i = 0; i <= range; i++) {
			if(isPrime(i)) {
				System.out.println("Prime Numer"+" "+ i );
			}
		}
	}
	
	private static boolean isPrime(int n) {
		if(n<=1) {
			return false;
		}
		for (int i = 2; i <= Math.sqrt(n); i++) {  
	           if (n % i == 0) {  
	               return false;  
	           }  
		}
		return true;
	}

}
