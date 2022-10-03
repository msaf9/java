package introduction1;

import java.util.Scanner;

public class ReadingInput11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number;
		String name;

		System.out.print("Enter your name:");
		name = sc.nextLine();

		System.out.print("Enter your number:");
		number = sc.nextInt();

		System.out.println("::Output::");
		System.out.println("Name: " + name);
		System.out.println("Number: " + number);

		sc.close();
	}

}
