package Level1;

public class DiscountCalculator {

	public static void main(String[] args) {
		int fee = 125000;
		int discountPercent = 10;
		int discount = discountPercent*125000 / 100;
		
		System.out.println("The discount amount is INR "+discount+" and final discounted fee is INR "+(fee-discount));
	}

}
