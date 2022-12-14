package classesWithAttibutes;

public class Main {

	public static void main(String[] args) {
		
		Product product = new Product(1,"Laptop","Asus Laptop",5000,2,"Siyah");
		
		Product product2 = new Product();
		product2.setName("Laptop");
		product2.setId(1);
		product2.setDescription("Asus Laptop");
		product2.setPrice(5000);
		product2.setStockAmount(3);
		
		
		ProductManager productManager = new ProductManager();
		productManager.Add(product);
		
		
		System.out.println(product.getKod());
		
		
		

	}

}
