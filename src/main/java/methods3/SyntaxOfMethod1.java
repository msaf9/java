package methods3;

import java.util.Scanner;

public class SyntaxOfMethod1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number;
		System.out.print("Enter you number to check wheather it is Even or Odd:");
		number = sc.nextInt();
		if (checkOddEven(number)) {
			System.out.println(number + " is an Even number.");
		} else {
			System.out.println(number + " is an Odd number.");
		}
		sc.close();
	}

	public static boolean checkOddEven(int number) {
		boolean evenBool = false;
		if (number % 2 == 0) {
			evenBool = true;
		}
		return evenBool;
	}

}
