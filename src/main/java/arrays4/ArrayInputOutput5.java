package arrays4;

import java.util.Scanner;

public class ArrayInputOutput5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int numberOfElements;
		System.out.print("Enter number of elements:");
		numberOfElements = sc.nextInt();
		
		int integerArray[] = new int[numberOfElements];
		
		System.out.println("\n::Input Array::");
		for(int i = 0; i < numberOfElements; i++) {
			integerArray[i] = sc.nextInt();
		}
		
		System.out.println("\n::Output Array::");
		for(int i = 0; i < numberOfElements; i++) {
			System.out.print(integerArray[i] + " ");
		}
		sc.close();
	}

}
