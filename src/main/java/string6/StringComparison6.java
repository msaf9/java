package string6;

import java.util.Scanner;

public class StringComparison6 {

	public static void main(String[] args) {
		String string1, string2, result = "", string3 = "string3", string4 = "string3", result1 = "";
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter string1: ");
		string1 = sc.nextLine();
		System.out.print("Enter string2: ");
		string2 = sc.nextLine();

		if (string1.equals(string2)) {
			result = "string1 and strong2 have same value.";

		} else {
			result = "string1 and string2 doesn't have same value.";
		}

		if (string3 == string4) {
			result1 = "string3 and strong4 have same address.";
		} else {
			result1 = "string3 and strong4 doesn't have same address.";
		}

		System.out.println(result + "\n");
		System.out.println(result1);
		sc.close();
	}

}
