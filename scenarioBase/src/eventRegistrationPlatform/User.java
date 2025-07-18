package eventRegistrationPlatform;

class User {
	private String name;
	private String email;

	public User(String name, String email) {
	    this.name = name;
	    this.email = email;
	}

	public String getName() { return name; }
	public String getEmail() { return email; }

	 // Method to register for an event
	public Ticket registerForEvent(Event event, String ticketId) {
	    System.out.println(name + " is registering for event: " + event.getName());
	    return new Ticket(this, event, ticketId);
	}
}