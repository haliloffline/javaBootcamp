package ders1odev2;


public class mukemmelSayi {

	public static void main(String[] args) {
		//6--> 1,2,3
		//28-->1,2,4,
		int number = 6;
		int total = 0;
		
		for (int i = 1; i <number; i++) {
			
			if (number%i==0) {
				total=total+i;
			}
		}
		if (total==number) {
			System.out.println("Say�n�z M�kemmel Say�d�r.");
		}
		else {
			System.out.println("Say�n�zM�kemmel Say� De�ildir.");
		}
		
	}

}
