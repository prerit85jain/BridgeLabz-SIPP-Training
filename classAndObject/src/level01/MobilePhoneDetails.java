package level01;

class MobilePhone{
	String brand;
	String model;
	double price;
	
	MobilePhone(String brand, String model, double price){
		this.brand = brand;
		this.model = model;
		this.price = price;
	}
	
	void displayDetails(){
		System.out.printf(brand);
		System.out.printf("%5s",model);
		System.out.printf("%15.2f",price);
	}
}

public class MobilePhoneDetails {
	public static void main(String args[]) {
		MobilePhone mp = new MobilePhone("Nothing", "2a", 22000);
		
		mp.displayDetails();
	}
}
