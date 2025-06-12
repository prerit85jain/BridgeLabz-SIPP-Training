package Level1;

import java.util.*;

public class FeetToYardsConvertor {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		double feet = sc.nextDouble();
		double yard = feet/3;
		double mile = yard/1760;
		
		System.out.println("Distance in feet is "+feet+" while in yards is "+yard+" and miles is "+mile);
		sc.close();
	}
}
