package eventTicketingSystem;

class Attendee {
	private String name;
	private int age;
	private String email;

	public Attendee(String name, int age) {
		this.name = name;
		this.age = age;
		this.email = "N/A";
	}

	public Attendee(String name, int age, String email) {
		this.name = name;
		this.age = age;
		this.email = email;
	}

	public String getName() {
		return name;
	}
 
	public String getDetails() {
		return name + " (Age: " + age + ")" + (email.equals("N/A") ? "" : " Email: " + email);
	}
}