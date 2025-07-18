package eventRegistrationPlatform;

public class EventHivePlatform {
	public static void main(String[] args) {
	    Event techConference = new Event("Tech Conference 2025", "A conference on latest tech trends", "2025-09-15");
	     
	    User user1 = new User("Alice", "alice@example.com");
	     
	    Ticket ticket1 = user1.registerForEvent(techConference, "TICKET123");
	    System.out.println(ticket1.getTicketDetails());
	     
	    EventAdmin admin = new EventAdmin();
	    admin.modifyEvent(techConference, "Tech Conference 2025 - Updated", "Updated description for the tech conference");
	     
	    admin.removeEvent(techConference);
	}
}