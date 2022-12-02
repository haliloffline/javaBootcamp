package ders1odev2;

public class switchDemo {

	public static void main(String[] args) {
		char grade = 'A';
		
		switch(grade) {
			case 'A':
				System.out.println("Mükemmel : Geçtiniz");
				break;
			case 'B':
			case 'C':
				System.out.println("Fena Deðil : Geçtiniz");
				break;
			case 'D':
				System.out.println("Maalesef Kaldýnýz : Geçtiniz");
				break;
			case 'F':
				System.out.println("Maalesef Kaldýnýz");
				break;

		}
		
	}

}
