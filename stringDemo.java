package ders1odev2;

public class stringDemo {

	public static void main(String[] args) {
		
		String mesaj = "Bugün hava çok güzel.";
		System.out.println(mesaj);
//		
//		System.out.println("Eleman(karakter) sayýsý : "+ mesaj.length());
//		System.out.println("5. eleman : "+mesaj.charAt(4));
//		System.out.println(mesaj.concat(" Yaþasýn!"));
//		System.out.println(mesaj.startsWith("B"));
//		System.out.println(mesaj.endsWith("."));
//		char[] karakterler = new char[5];
//		mesaj.getChars(0,5,karakterler,0);
//		System.out.println(karakterler);
//		System.out.println(mesaj.indexOf("a"));
//		System.out.println(mesaj.lastIndexOf(0));
		
		String yeniMesaj = mesaj.replace(' ', '-');
		System.out.println(yeniMesaj);
		System.out.println(mesaj.substring(2,4)); //2. indexten baþlar 4'e kadar al 4'ü almaz.
		
		for(String kelime: mesaj.split(" ")) {
			System.out.println(kelime);
		}
		
		System.out.println(mesaj.toLowerCase());
		System.out.println(mesaj.toUpperCase());
		
		
		
	}

}
