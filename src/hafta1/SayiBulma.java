package hafta1;

public class SayiBulma {

	public static void main(String[] args) {
		int[] sayilar = new int[] {1,2,5,7,9,0};
		int target = 99;
		boolean exists = false;
		
		
		for (int sayi : sayilar) {
			if (sayi == target) {
				exists = true;
				break;
			}else {
				exists = false;
			}
		}
		
		if (exists) {
			System.out.println("Sayı mevcut");
		} else {
			System.out.println("Sayı mevcut degil");
		}
	}

}
