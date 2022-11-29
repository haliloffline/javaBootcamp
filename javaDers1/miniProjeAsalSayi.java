package ders1odev2;


public class miniProjeAsalSayi {

	public static void main(String[] args) {
		
		int number = 0;
//		int remainder = number%2; //number'ın 2 ye bölümünden kalan
//		System.out.println(remainder);
		
		
		
		if(number==1) {
			System.out.println("Sayı Asal Değildir.");
			return;
		}
		if(number<1) {
			System.out.println("Geçersiz sayı");
			return;
		}
		
		boolean isPrime = true;
		for (int i=2; i<number; i++) {
			if (number%i==0) {
				isPrime=false;
			}
			
		}
		
		if (isPrime) {
			System.out.println("sayı asaldır");
		}
		else{
			System.out.println("sayı asal değildir");
		}
		
		
		
		
		
	}

}
