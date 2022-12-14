package staticDemo;

public class ProductValidator {
	
	static {
		System.out.println("Static yapýcý blok çalýþtý");

	}
	
	public ProductValidator() {
		System.out.println("Yapýcý blok çalýþtý");
	}
	
	
	public static boolean isValid(Product product) {
		//static kullandýðýmýzda nesneyi ilk çaðýran kullanýcý bir nesne oluþturuyor ve daha sonra bu nesneyi çaðýran kullanýcýlar ayný nesneyi kullanýyor demektir. Bir metod static yapýldýðýnda direkt isim ile çaðýrýlabilir 
		if (product.price>0 && !product.name.isEmpty()) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public void bisey() {
		
	}
	
	
	
}
