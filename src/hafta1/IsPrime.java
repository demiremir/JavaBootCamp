package hafta1;

public class IsPrime {

	public static void main(String[] args) {
		int number = 1;
		int remainder = number % 2;
		//System.out.println(remainder);
		boolean isPrime = true;
		
		if (number == 1) {
			System.out.println("The number is NOT Prime");
			return;
		}
		
		if (number < 1) {
			System.out.println("Invalid input");
			return;
		}
		
		for (int i = 2; i < number; i++) {
			if (number % i == 0) {
				isPrime = false;
			}
		}
		
		if (isPrime) {
			System.out.println("The number is Prime");
		} else {
			System.out.println("The number is NOT Prime");
		}

	}

}
