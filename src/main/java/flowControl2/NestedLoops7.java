package flowControl2;

public class NestedLoops7 {

	public static void main(String[] args) {
		int week = 2, day = 3;

		for (int i = 1; i <= week; i++) {
			System.out.println("Week " + i);
			for (int j = 1; j <= day; j++) {
				System.out.println("  Day " + j);
			}
			System.out.println();
		}
	}

}
