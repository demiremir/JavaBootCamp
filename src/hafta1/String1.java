package hafta1;

public class String1 {

	public static void main(String[] args) {
		String mesaj = "The weather is so nice today.";
		System.out.println(mesaj);
		
		System.out.println("Eleman Sayısı: " + mesaj.length());
		System.out.println(mesaj.concat(" YAY!!"));
		System.out.println(mesaj.startsWith("T"));
		System.out.println(mesaj.endsWith("."));
		System.out.println(mesaj.indexOf("i"));
		System.out.println(mesaj.lastIndexOf("i"));

	}

}
