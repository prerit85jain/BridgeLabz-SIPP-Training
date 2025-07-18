package eventTicketingSystem;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

public class EventTicketingSystem {
	 private static HashMap<String, Queue<Attendee>> eventMap = new HashMap<>();

	 public static void main(String[] args) {
	     eventMap.put("Rock Concert", new LinkedList<>());
	     eventMap.put("Shakespeare Play", new LinkedList<>());

	     enqueueAttendee("Rock Concert", new Attendee("Alice", 25));
	     enqueueAttendee("Rock Concert", new Attendee("Bob", 30, "bob@example.com"));
	     enqueueAttendee("Rock Concert", new Attendee("Charlie", 22));

	     enqueueAttendee("Shakespeare Play", new Attendee("David", 40));
	     enqueueAttendee("Shakespeare Play", new Attendee("Eve", 35, "eve@example.com"));

	     System.out.println("Position of 'Bob' in 'Rock Concert': " +
	             getAttendeePosition("Rock Concert", "Bob"));

	     System.out.println("Position of 'Eve' in 'Shakespeare Play': " +
	             getAttendeePosition("Shakespeare Play", "Eve"));

	     System.out.println("Position of 'Alice' in 'Rock Concert': " +
	             getAttendeePosition("Rock Concert", "Alice"));

	     System.out.println("Position of 'Frank' in 'Rock Concert': " +
	             getAttendeePosition("Rock Concert", "Frank"));
	 }

	 public static void enqueueAttendee(String eventName, Attendee attendee) {
	     Queue<Attendee> queue = eventMap.get(eventName);
	     if (queue != null) {
	         queue.add(attendee);
	         System.out.println(attendee.getName() + " added to " + eventName);
	     } else {
	         System.out.println("Event not found: " + eventName);
	     }
	 }
	 
	 public static int getAttendeePosition(String eventName, String attendeeName) {
	     Queue<Attendee> queue = eventMap.get(eventName);
	     if (queue == null) {
	         System.out.println("Event not found: " + eventName);
	         return -1;
	     }
	     int position = 1;
	     for (Attendee attendee : queue) {
	         if (attendee.getName().equalsIgnoreCase(attendeeName)) {
	             return position;
	         }
	         position++;
	     }
	     return -1;
	 }
}