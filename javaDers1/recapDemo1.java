package ders1odev2;

public class recapDemo1 {

	public static void main(String[] args) {
		
		int sayi1=20;
		int sayi2=25;
		int sayi3=2;
		
		//kendi denemem.
		/*
		if (sayi1>sayi2&sayi1>sayi3) {
			System.out.println("En büyük sayý : "+sayi1);
		}
		else if (sayi2>sayi1&sayi2>sayi3) {
			System.out.println("En büyük sayý : "+sayi2);
		}
		else if (sayi3>sayi1&sayi3>sayi2) {
			System.out.println("En büyük sayý : "+sayi3);
		}
		*/
		
		int enBuyuk=sayi1;
		
		if (enBuyuk<sayi2) {
			enBuyuk=sayi2;
		}
		if (enBuyuk<sayi3) {
			enBuyuk=sayi3;
		}
		
		System.out.println("En büyük sayý: "+enBuyuk);
		
		
	}

}
