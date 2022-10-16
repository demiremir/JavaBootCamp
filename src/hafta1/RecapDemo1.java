package hafta1;

public class RecapDemo1 {

	public static void main(String[] args) {

		int num1 = 266;
		int num2 = 25;
		int num3 = 26;
		int enBuyuk = num1;
		
		if (enBuyuk < num2) {
			enBuyuk = num2;
		}
		
		if (enBuyuk < num3) {
			enBuyuk = num3;
		}
		
		System.out.println("En büyük = " + enBuyuk);

	}

}
