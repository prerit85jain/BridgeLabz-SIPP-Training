package Level01;
import java.util.*;
public class SumTillZeroOrNegative {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double total = 0;
		while(true) {
			double input = sc.nextDouble();
			if(input<=0)	break;
			total += input;
		}
		System.out.println("Total is "+total);
		sc.close();
	}

}
