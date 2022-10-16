package arrays4;

import java.util.Scanner;

public class ArrayPassingInFunction6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arraySize;
		System.out.print("Enter array size:");
		arraySize = sc.nextInt();
		int integerArray[] = new int[arraySize];
		System.out.print("Enter array elements:");
		for (int i = 0; i < arraySize; i++) {
			integerArray[i] = sc.nextInt();
		}
		System.out.println("Highest element:" + findHighestElement(integerArray));
		sc.close();
	}

	public static int findHighestElement(int[] integerArray) {
		int highest = integerArray[0];
		for (int i = 0; i < integerArray.length; i++) {
			if (highest < integerArray[i]) {
				highest = integerArray[i];
			}
		}
		return highest;
	}

}
