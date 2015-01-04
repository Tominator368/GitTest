import java.util.Scanner;


public class Check {

	public static void main(String[] args) {
		Scanner userIn = new Scanner(System.in);
		
		System.out.println("Enter the first value to compare:");
		String firstValue = userIn.next();
		
		System.out.println("Enter the second value to compare:");
		String secondValue = userIn.next();
		
		if (firstValue.equals(secondValue)) {
			System.out.print("The values are the same!");
		}
		else {
			System.out.print("The values are different.");
		}

	}

}
