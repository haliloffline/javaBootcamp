package ders1odev2;

public class loopDemo {

	public static void main(String[] args) {
		
		
		for (int i = 0; i <=10; i++) {
			System.out.println(i);
		}
		System.out.println("Döngü  Tamamlandý");
		
		
		for (int i = 0; i <=10; i+=2) {
			System.out.println(i);
		}
		System.out.println("Döngü 2 þey artýrýlarak Tamamlandý");
		System.out.println("For Döngüsü Bitti");
		System.out.println("-----------------------------------");
		
		int i = 1;
		
		while(i<10) {
			System.out.println(i);
			i++;
		}
		System.out.println("While Döngüsü Bitti");
		System.out.println("-----------------------------------");
		
		
		int j = 1;
		
		do{
			System.out.println(j);
			j+=2;
		} while(j<10);
		System.out.println("Do-While Döngüsü Bitti");
		
		
		
		
		
	}

}
