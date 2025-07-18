package eventRegistrationPlatform;

class Ticket {
	private User user;
	private Event event;
	private String ticketId;

	public Ticket(User user, Event event, String ticketId) {
	    this.user = user;
	    this.event = event;
	    this.ticketId = ticketId;
	}

	public String getTicketDetails() {
	    return "Ticket ID: " + ticketId + " | User: " + user.getName() + " | Event: " + event.getName();
	}
}