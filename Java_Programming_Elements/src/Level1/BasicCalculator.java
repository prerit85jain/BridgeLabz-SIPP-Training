package Level1;
import java.util.*;
public class BasicCalculator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		float num1 = sc.nextFloat();
		float num2 = sc.nextFloat();
		
		float add = num1+num2;
		float sub = num1-num2;
		float multiply = num1*num2;
		float divide = num1/num2;
		
		System.out.println(String.format("The addition, subtraction, multiplication and division value of 2 numbers %.2f and %.2f is %.2f, %.2f, %.2f, and %.2f",num1, num2, add, sub, multiply, divide));
		sc.close();
	}

}
