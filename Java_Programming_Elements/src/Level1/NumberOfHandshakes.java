package Level1;

import java.util.*;

public class NumberOfHandshakes {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int students = sc.nextInt();
		
		int handshake = (students * (students - 1)) / 2;
		
		System.out.println("The number of possible handshakes are "+handshake);
		sc.close();
	}
}
