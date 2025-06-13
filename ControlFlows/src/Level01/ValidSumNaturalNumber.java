package Level01;
import java.util.*;
public class ValidSumNaturalNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		int sumByFormula = number*(number+1)/2;
		int sumByLoop = 0;
		
		while(number>0) {
			sumByLoop += number;
			number--;
		}
		
		if(sumByLoop == sumByFormula) {
			System.out.println("Sum is correct that is "+sumByLoop);
		}
		sc.close();
	}

}
