package Level1;
import java.util.*;
public class DistanceConvertor {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double km = sc.nextInt();
		double mile = km*1.6;
		System.out.println("The total miles is "+mile+"1 mile for the given "+km+" km");
		sc.close();
	}

}
