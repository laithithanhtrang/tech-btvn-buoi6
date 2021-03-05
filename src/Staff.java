public class Staff {
	private String id;
	private String name;
	private String email;
	private float salary;

	public Staff (String id, String name, String email, float salary) {
		this.id = id;
		this.name = name;
		this.email = email;
		this.salary = salary;
	}
	public Staff() {

	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	
	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}
	public void display(){
        System.out.println("Ma: "+id);
        System.out.println("Ten: "+ name);
        System.out.println("Email: "+email);
        System.out.println("Luong co ban: "+ salary);
    }
}
