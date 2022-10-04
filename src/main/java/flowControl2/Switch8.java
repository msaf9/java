package flowControl2;

import java.util.Scanner;

public class Switch8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int option;
		System.out.print("Enter your option:");
		option = sc.nextInt();

		switch (option) {
		case 1:
			System.out.println("You have selected option " + option);
			break;
		case 2:
			System.out.println("You have selected option " + option);
			break;
		default:
			System.out.println("Select only 1 or 2.");
		}
		sc.close();
	}

}
