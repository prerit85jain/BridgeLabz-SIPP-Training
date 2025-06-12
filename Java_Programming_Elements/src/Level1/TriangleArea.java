package Level1;
import java.util.*;
public class TriangleArea {
	
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
        double baseInches = scanner.nextDouble();
        double heightInches = scanner.nextDouble();
        double areaInches = 0.5 * baseInches * heightInches;
        
        double baseCm = baseInches * 2.54;
        double heightCm = heightInches * 2.54;
        double areaCm = 0.5 * baseCm * heightCm;
        System.out.println("Area of the triangle in square inches: " + areaInches);
        System.out.println("Area of the triangle in square centimeters: " + areaCm);
        scanner.close();
	}
}
