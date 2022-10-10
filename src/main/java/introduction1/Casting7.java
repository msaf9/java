package introduction1;

public class Casting7 {

	public static void main(String[] args) {
		System.out.println("Widening Casting (automatic) - converting a smaller size type to a larger size type.\r\n"
				+ "byte -> short -> char -> int -> long -> float -> double\n");

		System.out.println("Narrowing Casting (manual) - converting a larger size type to a smaller size type.\r\n"
				+ "double -> float -> long -> int -> char -> short -> byte\n");

		System.out.println("::Widening Casting::");
		int integerNumber = 11;
		double doubleNumber = integerNumber;
		System.out.println("Integer Number: " + integerNumber);
		System.out.println("Double Number: " + doubleNumber);
		
		System.out.println("\n::Narrowing Casting::");
		double doubleNumber1 = 7.82;
		int integerNumber1 = (int) doubleNumber1;
		System.out.println("Double Number: " + doubleNumber1);
		System.out.println("Integer Number: " + integerNumber1);

	}

}
