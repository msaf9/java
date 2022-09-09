package methods3;

import java.util.Scanner;

public class MethodParameters {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int input1, input2;
		System.out.print("Enter input1:");
		input1 = sc.nextInt();
		System.out.print("Enter input2:");
		input2 = sc.nextInt();
		System.out.println("Sum of " + input1 + " and " + input2 + " = " + addMethod(input1, input2));
		sc.close();
	}

	public static int addMethod(int a, int b) {
		return a + b;
	}

}
