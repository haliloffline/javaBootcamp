package staticDemo;

public class ProductManager {
	
	public void add(Product product) {
		//bu tip manager s�n�flar�nda asla static kullan�lmaz
		
		if (ProductValidator.isValid(product)) {
			System.out.println("Eklendi");
		}
		else {
			System.out.println("�r�n bilgileri ge�ersiz");
		}
	
	//static olan bir methodu ProductValidator.isValid() �eklinde �al��t�rabiliyorken static olmayan metodlar� newlememiz gerekir
	
	ProductValidator productValidator = new ProductValidator();
	productValidator.bisey();
	
	
	
	}
	
	
	
	
}
