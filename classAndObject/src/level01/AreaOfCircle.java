package level01;

import java.util.Scanner;

class Circle{
	double radius;
	
	Circle(double radius){
		this.radius = radius;
	}
	
	void displayResult(){
		System.out.printf("Radius is: %-5f",(Math.PI*Math.pow(radius, 2)));
	}
}
public class AreaOfCircle {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Radius: ");
		double radius = sc.nextDouble();
		Circle circle1 = new Circle(radius);
		circle1.displayResult();
		sc.close();
	}

}
