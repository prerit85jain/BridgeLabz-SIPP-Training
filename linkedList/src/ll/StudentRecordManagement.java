package ll;

public class StudentRecordManagement {
	private Node head = null;

	static class Node{
		String name;
		int roll;
		int age;
		char grade;
		Node next;
		
		public Node(String name, int roll, int age, char grade) {
			this.name = name;
			this.roll = roll;
			this.age = age;
			this.grade = grade;
			this.next = null;
		}
	}
	
	public void addAtBeginning(String name, int roll, int age, char grade) {
		Node newStudent = new Node(name, roll, age, grade);
		newStudent.next = head;
		head = newStudent;
	}
	
	public void addAtEnd(String name, int roll, int age, char grade) {
		Node temp = head;
		Node newStudent = new Node(name, roll, age, grade);
		if(head==null) {
			newStudent.next = head;
			head = newStudent;
		}else {
			while(temp.next!=null) {
				temp = temp.next;
			}
			temp.next = newStudent;
		}
	}
	
	public void addAtPosition(String name, int roll, int age, char grade, int position) {
		Node newStudent = new Node(name, roll, age, grade);
		Node temp = head;
		if(position <1) {
			System.out.println("Invalid position!");
			return;
		}
		if(position == 1) {
			addAtBeginning(name, roll, age, grade);
			return;
		}
		while(position-1>1 && temp!=null) {
			temp = temp.next;
			position--;
		}
		newStudent.next = temp.next;
		temp.next = newStudent;
		
	}
	public void displayAll() {
		if(head==null) {
			System.out.println("List is Empty");
			return;
		}
		System.out.println("Student Records:");
		Node temp = head;
		while(temp!=null) {
			System.out.println("+--------------------------------------------+");
			System.out.println("Name: "+temp.name);
			System.out.println("Roll no.: "+temp.roll);
			System.out.println("Age: "+temp.age);
			System.out.println("Grade: "+temp.grade);
			temp = temp.next;
		}
	}
	public static void main(String[] args) {
		StudentRecordManagement record = new StudentRecordManagement();
		record.addAtBeginning("Alice", 1, 20, 'B');
		record.addAtEnd("Carlei", 3, 22, 'B');
		record.addAtEnd("Durgesh", 4, 21, 'A');
		record.addAtPosition("Bob", 2, 21, 'A', 2);
		record.displayAll();
		System.out.println("Done");
	}
}
