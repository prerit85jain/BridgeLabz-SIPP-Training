package vehicleManagementSystem;

public class Main {
	public static void main(String[] args) {
		Vehicle[] list = {
				new Car("Mahindra", "XUV700", "Petrol", 8),
				new Bike("Harley", "Street 700", "Petrol", "False"),
				new Truck("Tata", "Pickup", "Diseal", 15)
		};
		
		for(Vehicle v : list) {
			v.getVehicleDetails();
			System.out.println("Service Cost: "+v.calculateServiceCost(5));
			System.out.println("+--------------------------------------------+");
		}
	}
}
