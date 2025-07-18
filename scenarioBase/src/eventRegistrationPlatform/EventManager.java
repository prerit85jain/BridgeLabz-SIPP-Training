package eventRegistrationPlatform;

interface EventManager {
	void modifyEvent(Event event, String newName, String newDescription);
	void removeEvent(Event event);
}