package methods3;

public class MethodOverloading {

	public static void main(String[] args) {
		MethodOverloading methodOverloading = new MethodOverloading();

		int twoNumberSum = methodOverloading.addMethod(24, 42);
		int threeNumberSum = methodOverloading.addMethod(24, 42, 20);

		System.out.println("Method Overloading");
		System.out.println("Sum of two numbers: " + twoNumberSum);
		System.out.println("Sum of three numbers: " + threeNumberSum);
	}

	public int addMethod(int a, int b) {
		return a + b;
	}

	public int addMethod(int a, int b, int c) {
		return a + b + c;
	}

}
