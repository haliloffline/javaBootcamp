package staticDemo;

public class ProductManager {
	
	public void add(Product product) {
		//bu tip manager sýnýflarýnda asla static kullanýlmaz
		
		if (ProductValidator.isValid(product)) {
			System.out.println("Eklendi");
		}
		else {
			System.out.println("Ürün bilgileri geçersiz");
		}
	
	//static olan bir methodu ProductValidator.isValid() þeklinde çalýþtýrabiliyorken static olmayan metodlarý newlememiz gerekir
	
	ProductValidator productValidator = new ProductValidator();
	productValidator.bisey();
	
	
	
	}
	
	
	
	
}
