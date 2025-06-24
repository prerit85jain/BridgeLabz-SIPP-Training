package level01;

class Employee{
	String name;
	int id;
	double salary;
	
	Employee(String name, int id, double salary){
		this.name = name;
		this.id = id;
		this.salary = salary;
	}
	
	void displayDetails() {
		System.out.printf("%-5d %-10s %-10f",id, name, salary);
	}
}
public class DisplayEmployeeDetails {
	public static void main(String[] args) {
		Employee emp1 = new Employee("John", 101, 5500);
		
		emp1.displayDetails();
	}
}
