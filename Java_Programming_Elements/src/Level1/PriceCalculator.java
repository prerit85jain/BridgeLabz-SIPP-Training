package Level1;

import java.util.*;

public class PriceCalculator {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		int price = sc.nextInt();
		int quantity = sc.nextInt();
		
		System.out.println("The total purchase price is INR "+(price*quantity)+" if the quantity "+quantity+" and unit price is INR "+price);
		sc.close();
	}
}
