package ders1odev2;

public class switchDemo {

	public static void main(String[] args) {
		char grade = 'A';
		
		switch(grade) {
			case 'A':
				System.out.println("M�kemmel : Ge�tiniz");
				break;
			case 'B':
			case 'C':
				System.out.println("Fena De�il : Ge�tiniz");
				break;
			case 'D':
				System.out.println("Maalesef Kald�n�z : Ge�tiniz");
				break;
			case 'F':
				System.out.println("Maalesef Kald�n�z");
				break;

		}
		
	}

}
