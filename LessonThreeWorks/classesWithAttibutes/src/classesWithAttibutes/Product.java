package classesWithAttibutes;

public class Product {
	
	public Product(int id, String name, String description, int stockAmount, double price, String color) {
		System.out.println("Yapýcý blok çalýþtý.");
		_id=id;
		_name=name;
		_description=description;
		_stockAmount=stockAmount;
		_price=price;
		_color=color;
	}
	
	public Product() {
		
	}
	
	private int _id;
	private String _name;
	private String _description;
	private double _price;
	private int _stockAmount;
	private String _color;
	private String _kod;
	
	public String getName() {
		return _name;
	}

	public void setName(String name) {
		_name = name;
	}

	public String getDescription() {
		return _description;
	}

	public void setDescription(String description) {
		_description = description;
	}

	public double getPrice() {
		return _price;
	}

	public void setPrice(double price) {
		_price = price;
	}

	public int getStockAmount() {
		return _stockAmount;
	}

	public void setStockAmount(int stockAmount) {
		_stockAmount = stockAmount;
	}

	public int getId() {
		return _id;
	}
	
	public void setId(int id) {
		_id=id;
	}

	public String get_color() {
		return _color;
	}

	public void set_color(String _color) {
		this._color = _color;
	}

	public String getKod() {
		return this._name.substring(0,1)+_id;
	}
	
	
}
