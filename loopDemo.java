package ders1odev2;

public class loopDemo {

	public static void main(String[] args) {
		
		
		for (int i = 0; i <=10; i++) {
			System.out.println(i);
		}
		System.out.println("D�ng�  Tamamland�");
		
		
		for (int i = 0; i <=10; i+=2) {
			System.out.println(i);
		}
		System.out.println("D�ng� 2 �ey art�r�larak Tamamland�");
		System.out.println("For D�ng�s� Bitti");
		System.out.println("-----------------------------------");
		
		int i = 1;
		
		while(i<10) {
			System.out.println(i);
			i++;
		}
		System.out.println("While D�ng�s� Bitti");
		System.out.println("-----------------------------------");
		
		
		int j = 1;
		
		do{
			System.out.println(j);
			j+=2;
		} while(j<10);
		System.out.println("Do-While D�ng�s� Bitti");
		
		
		
		
		
	}

}
