package methods3;

public class OuterShadowing4_1 {
	String name = "Outer class";

	public class InnerShadowing {
		String name = "Inner class";

		public void printMethod() {
			System.out.println(name);
			System.out.println(OuterShadowing4_1.this.name);
		}
	}

}
