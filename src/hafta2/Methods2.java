package hafta2;

public class Methods2 {

	public static void main(String[] args) {
		//String mesaj = "Bugün hava çok güzel.";
		String yeniMesaj = sehirVer();
		System.out.println(yeniMesaj);
		int sayi = topla(7, 5);
		System.out.println(sayi);

	}
	
	public static void ekle() {
		System.out.println("eklendi");
	}
	
	public static void sil() {
		System.out.println("silindi.");
	}
	
	public static void guncelle() {
		System.out.println("guncellendi");
	}
	
	public static int topla(int num1, int num2) {
		return num1 + num2;
	}
	
	public static String sehirVer() {
		return "Ankara";
	}

}
