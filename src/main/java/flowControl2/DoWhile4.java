package flowControl2;

import java.util.Scanner;

public class DoWhile4 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int number, result = 1;

		System.out.print("Enter number to find factorial:");
		number = sc.nextInt();
		if (number == 1 || number == 0) {
			result = 1;
		} else {
			do {
				result *= number;
				number--;
			} while (number != 0);
		}

		System.out.println("Factorial:" + result);
		sc.close();
	}
}
