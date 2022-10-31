package hafta2;

public class Methods {

	public static void main(String[] args) {
		sayiBulmaca();

	}
	
	public static void sayiBulmaca() {
		int[] sayilar = new int[] {1,2,5,7,9,0};
		int target = 5;
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
