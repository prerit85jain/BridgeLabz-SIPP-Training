package Level1;
import java.util.*;
public class UniversityFeeDiscount {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int fee = sc.nextInt();
		int discountPercent = sc.nextInt();
		int discount = discountPercent*125000 / 100;
		
		System.out.println("The discount amount is INR "+discount+" and final discounted fee is INR "+(fee-discount));
		sc.close();
	}

}
