package introduction1;

public class Operators8 {

	public static void main(String[] args) {
		int a = 10, b = 5, c = 3, d = 11, e = 12, f = 11;
		System.out.println("Arithmetic Operators");
		System.out.println(a + " + " + b + " = " + (a + b));
		System.out.println(a + " - " + b + " = " + (a - b));
		System.out.println(a + " * " + b + " = " + (a * b));
		System.out.println(a + " / " + b + " = " + (a / b));
		System.out.println(a + " % " + b + " = " + (a % b));
		System.out.println("++" + a + " = " + (++a));
		System.out.println("--" + a + " = " + (--a));
		System.out.println("c = " + c);
		System.out.println("a += 3 (Output):" + (a += 3));
		System.out.println("a -= 3 (Output):" + (a -= 3));
		System.out.println("a *= 3 (Output):" + (a *= 3));
		System.out.println("a /= 3 (Output):" + (a /= 3));
		System.out.println("a %= 3 (Output):" + (a %= 3));
		System.out.println("c &= 3 (Output):" + (c &= 3));
		System.out.println("b |= 3 (Output):" + (b |= 3));
		System.out.println("c ^= 3 (Output):" + (c ^= 3));
		System.out.println("a >>= 3 (Output):" + (a >>= 3));
		System.out.println("a <<= 3 (Output):" + (a <<= 3));
		System.out.println("d == f (Output):" + (d == f));
		System.out.println("d != f (Output):" + (d != f));
		System.out.println("e > d (Output):" + (e > d));
		System.out.println("d < e (Output):" + (d < e));
		System.out.println("d >= f (Output):" + (d >= f));
		System.out.println("d <= e (Output):" + (d <= e));

		System.out.println("\nLogical Operators");
		System.out.println("(3 > 2) && (3 > 4) (Output):" + ((3 > 2) && (3 > 4)));
		System.out.println("(3 > 2) && (3 < 4) (Output):" + ((3 > 2) && (3 < 4)));
		System.out.println("(3 > 2) || (3 > 4) (Output):" + ((3 < 2) || (3 > 4)));
		System.out.println("!true (Output):" + (!true));
	}

}
