package flowControl2;

import java.util.Scanner;

/**
 * @author Sahil Afrid Farookhi A Java program to understand the If and Else
 *         Flow control
 */
public class IfElse {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		IfElse ifElse = new IfElse();
		int inputNumber1, inputNumber2;
		System.out.print("Enter your first number:");
		inputNumber1 = sc.nextInt();
		System.out.print("Enter your second number:");
		inputNumber2 = sc.nextInt();
		if (!(inputNumber1 == inputNumber2)) {
			if (inputNumber1 > 0 && inputNumber2 > 0) {
				if (ifElse.compareTwoIntegers(inputNumber1, inputNumber2)) {
					System.out.println(inputNumber1 + " is bigger than " + inputNumber2 + ".");
				} else {
					System.out.println(inputNumber2 + " is bigger than " + inputNumber1 + ".");
				}
			} else if (inputNumber1 < 0 || inputNumber2 < 0) {
				if (inputNumber1 < 0 && inputNumber2 < 0) {
					System.out.println(
							"Both the numbers " + inputNumber1 + " and " + inputNumber2 + " are less than zero.");
				} else if (inputNumber1 < 0) {
					System.out.println(inputNumber1 + " is less than zero.");
				} else {
					System.out.println(inputNumber2 + " is less than zero.");
				}
			} else if (inputNumber1 == 0 || inputNumber2 == 0) {
				if (inputNumber1 == 0 && inputNumber2 == 0) {
					System.out.println(
							"Both the numbers " + inputNumber1 + " and " + inputNumber2 + " are less than zero.");
				} else if (inputNumber1 == 0) {
					System.out.println(inputNumber1 + " is less than zero.");
				} else {
					System.out.println(inputNumber2 + " is less than zero.");
				}
			}
		} else {
			System.out.println("Both the numbers " + inputNumber1 + " and " + inputNumber2 + " are equal.");
		}
		sc.close();

	}

	public boolean compareTwoIntegers(int number1, int number2) {
		boolean resultFlag = false;
		if (number1 > number2) {
			resultFlag = true;
		} else {
			resultFlag = false;
		}
		return resultFlag;
	}

}
