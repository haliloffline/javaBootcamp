package ders1odev2;


public class miniProjeAsalSayi {

	public static void main(String[] args) {
		
		int number = 0;
//		int remainder = number%2; //number'�n 2 ye b�l�m�nden kalan
//		System.out.println(remainder);
		
		
		
		if(number==1) {
			System.out.println("Say� Asal De�ildir.");
			return;
		}
		if(number<1) {
			System.out.println("Ge�ersiz say�");
			return;
		}
		
		boolean isPrime = true;
		for (int i=2; i<number; i++) {
			if (number%i==0) {
				isPrime=false;
			}
			
		}
		
		if (isPrime) {
			System.out.println("say� asald�r");
		}
		else{
			System.out.println("say� asal de�ildir");
		}
		
		
		
		
		
	}

}
