package staticDemo;

public class ProductValidator {
	
	static {
		System.out.println("Static yap�c� blok �al��t�");

	}
	
	public ProductValidator() {
		System.out.println("Yap�c� blok �al��t�");
	}
	
	
	public static boolean isValid(Product product) {
		//static kulland���m�zda nesneyi ilk �a��ran kullan�c� bir nesne olu�turuyor ve daha sonra bu nesneyi �a��ran kullan�c�lar ayn� nesneyi kullan�yor demektir. Bir metod static yap�ld���nda direkt isim ile �a��r�labilir 
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
