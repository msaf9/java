package flowControl2;

public class Break9_1 {

	public static void main(String[] args) {
		for (int i = 1; i <= 10; i++) {
			if (i == 5) {
				break;
			}
			System.out.println(i);
		}
	}

}
