package flowControl2;

import java.util.Scanner;

public class WhileLoop {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your count:");
		int count = sc.nextInt();
		int i = 1;

		while (i < count + 1) {
			System.out.print(i + " ");
			i++;
		}

		sc.close();
	}

}
