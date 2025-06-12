package Level1;
import java.util.*;
public class HeightConvertor {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cm = sc.nextInt();
		double inch = cm/2.54;
		double feet = inch/12;
		
		System.out.println("Your Height in cm is "+cm+" while in feet is "+feet+" and inches is "+inch);
		sc.close();
	}

}
