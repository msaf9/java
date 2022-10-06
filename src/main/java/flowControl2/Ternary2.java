package flowControl2;

import java.util.Scanner;

public class Ternary2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int inputNumber;
		String result = "";

		System.out.println("Know a number is positive or negative");
		System.out.print("Enter your number (Zero is either positive nor negative):");
		inputNumber = sc.nextInt();
		result = ternary(inputNumber);
		System.out.println(result);

		sc.close();
	}

	public static String ternary(int number) {
		return number > 0 ? "Positive Number" : number != 0 ? "Negative Number" : "You have provided Zero";
	}
}
