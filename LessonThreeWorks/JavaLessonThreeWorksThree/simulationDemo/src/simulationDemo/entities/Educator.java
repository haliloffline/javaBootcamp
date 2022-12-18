package simulationDemo.entities;

public class Educator {
	
	private String id;
	private String firstName;
	private String lastName;
	private String profession;
	private String description;
	private String photo;
	
	
	
	public Educator() {
		super();
		
	}
	
	public Educator(String id, String firstName, String lastName, String profession, String description, String photo) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.profession = profession;
		this.description = description;
		this.photo=photo;
		
		
	}

	
	public String getId() {
		return id+"E";
	}

	public void setId(String id) {
		this.id = id;
	}

	

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getProfession() {
		return profession;
	}

	public void setProfession(String profession) {
		this.profession = profession;
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
