package simulationDemo.entities;

public class Courses {
	
	private String id;
	private double price;
	private String name;
	private String description;
	private String photo;
	

	
	public Courses() {
		super();
	}

	public Courses(String id, double price, String name, String description, String photo) {
		super();
		this.id = id;
		this.price = price;
		this.name = name;
		this.description = description;
		this.photo = photo;
	}
	
	
	public String getId() {
		return id+"CO";
	}

	public void setId(String id) {
		this.id = id;
	}

	
	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getPhoto() {
		return photo;
	}

	public void setPhoto(String photo) {
		this.photo = photo;
	}

	
	
	
	
	
}
