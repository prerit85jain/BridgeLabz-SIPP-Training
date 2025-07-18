package eventRegistrationPlatform;

class EventAdmin implements EventManager {
	@Override
	public void modifyEvent(Event event, String newName, String newDescription) {
	    event.setName(newName);
	    event.setDescription(newDescription);
	    System.out.println("Event modified: " + event);
	}

	@Override
	public void removeEvent(Event event) {
		System.out.println("Event removed: " + event.getName());
	}
}