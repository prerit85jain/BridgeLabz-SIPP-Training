package vehicleManagementSystem;

abstract class Vehicle {
    private String brand;
    private String model;
    private String fuelType;

    public Vehicle(String brand, String model, String fuelType) {
        this.brand = brand;
        this.model = model;
        this.fuelType = fuelType;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    public abstract double calculateServiceCost(double distance);

    public void getVehicleDetails() {
    	System.out.println("Vehicle Details:");
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Fuel Type: " + fuelType);
    }
}