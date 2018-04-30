
/*
	ISYS 320
	Name(s):
	Date: 
*/

import java.util.Scanner;

public class P3_Consecutive {

	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		System.out.println("This program calculates if three input values are consecutive.");

		String doItAgainResponse = "";

		do {
			System.out.print("Enter value 1: ");
			int num1 = console.nextInt();
			System.out.print("Enter value 2: ");
			int num2 = console.nextInt();
			System.out.print("Enter value 3: ");
			int num3 = console.nextInt();

			System.out.printf("a: %d, b: %d, c: %d -> ", num1, num2, num3);
			if (isConsecuitive(num1, num2, num3)) {
				System.out.println("is consecuitvie");
			} else {

				System.out.println("is not consecuitvie");
			}

			System.out.print("Would you like to do it again (enter 'n' to quit)? ");
			doItAgainResponse = console.next();
		} while (!doItAgainResponse.equalsIgnoreCase("n"));

		System.out.println("Thanks!");
	}

	private static boolean isConsecuitive(int num1, int num2, int num3) {
		// TODO Auto-generated method stub
		int d1 = Math.abs(num1 - num2);
		int d2 = Math.abs(num2 - num3);
		int d3 = Math.abs(num1 - num3);
		
		if ((d1 == 1) && (d2 == 1))			
		return true;
		if ((d2 == 1) && (d3 == 1))			
			return true;
		if ((d1 == 1) && (d3 == 1))			
			return true;
		
		return false;
		
	}

}
