package vehicleManagementSystem;

class Bike extends Vehicle {
	
	private String hasSideCar;
	
	Bike(String Brand, String Model, String fuelType, String hasSideCar){
		super(Brand, Model, fuelType);
		this.hasSideCar = hasSideCar;
	}

	@Override
	public double calculateServiceCost(double distance) {
		if(hasSideCar.equals("True")){
			return 50*distance*2;
		}else {
			return 50*distance;
		}
	}
	
	public void getVehicleDetails() {
		super.getVehicleDetails();
		System.out.println("Has Side Car: "+hasSideCar);
	}
	
}