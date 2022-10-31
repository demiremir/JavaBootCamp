package hafta1;

public class ArrayDemo {

	public static void main(String[] args) {
		
		String[] ogrenciler = new String[3];
		
		ogrenciler[0] = "Emir";
		ogrenciler[1] = "Demir";
		ogrenciler[2] = "Çelik";
		
		for (int i = 0; i < ogrenciler.length; i++) {
			System.out.println(ogrenciler[i]);
		}
		
		System.out.println("------------------------------");
		
		for (String ogrenci : ogrenciler) {
			System.out.println(ogrenci);
		}
		
		System.out.println("------------------------------");
		
		String[] cars = new String[4];
		
		cars[0] = "Mercedes";
		cars[1] = "Volvo";
		cars[2] = "Audi";
		cars[3] = "Bmw";
		
		for (String car : cars) {
			System.out.println(car);
		}
	}

}
