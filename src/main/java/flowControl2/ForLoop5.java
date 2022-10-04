package flowControl2;

public class ForLoop5 {

	public static void main(String[] args) {
		String[] stringArray = { "Java", "Ruby", "C", "JavaScript" };

		System.out.println("Printing stringArray elements in reverse order:");
		for (int i = stringArray.length - 1; i >= 0; i--) {
			System.out.println(i+1 + ". " + stringArray[i]);
		}

	}

}
