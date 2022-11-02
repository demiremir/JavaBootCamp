package hafta2;

public class VariableArguments {

	public static void main(String[] args) {
		int toplam = sum(2,3,4,5,6,7);
		System.out.println(toplam);

	}
	
	public static int sum(int... sayilar) {
		int toplam = 0;
		for (int sayi : sayilar) {
			toplam = toplam + sayi;
		}
		return toplam;
	}

}
