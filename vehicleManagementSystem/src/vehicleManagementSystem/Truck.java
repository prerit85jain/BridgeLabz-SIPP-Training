package vehicleManagementSystem;

class Truck extends Vehicle {
	
	private int loadCapacity;
	
	Truck(String Brand, String Model, String fuelType, int loadCapacity){
		super(Brand, Model, fuelType);
		this.loadCapacity = loadCapacity;
	}

	@Override
	public double calculateServiceCost(double distance) {
		return 50*distance+(loadCapacity*50);
	}
	
	public void getVehicleDetails() {
		super.getVehicleDetails();
		System.out.println("Load Capacity: "+loadCapacity);
	}
	
}