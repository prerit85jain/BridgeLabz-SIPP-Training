package vehicleManagementSystem;

class Car extends Vehicle {
	
	private int seatCapacity;
	
	Car(String Brand, String Model, String fuelType, int seatCapacity){
		super(Brand, Model, fuelType);
		this.seatCapacity = seatCapacity;
	}

	@Override
	public double calculateServiceCost(double distance) {
		return 50*distance*seatCapacity;
	}
	
	public void getVehicleDetails() {
		super.getVehicleDetails();
		System.out.println("Seat Capacity: "+seatCapacity);
	}
	
}
