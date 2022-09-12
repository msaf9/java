package methods3;

public class OuterShadowing {
	String name = "Outer class";

	public class InnerShadowing {
		String name = "Inner class";

		public void printMethod() {
			System.out.println(name);
			System.out.println(OuterShadowing.this.name);
		}
	}

}
