package ders1odev2;

public class sesliHarfler {

	public static void main(String[] args) {
		char harf='I';
		
		
		
		switch (harf) {
		case 'E':
		case 'Ý':
		case 'Ö':
		case 'Ü':
		System.out.println("Harf Ýnce Seslidir");
		break;
		
		case 'A':
		case 'I':
		case 'O':
		case 'U':
		System.out.println("Harf Kalýn Seslidir.");
		break;
		default:
			System.out.println("Sessiz Harf Girdiniz.");
		}
		
			
	}

}
