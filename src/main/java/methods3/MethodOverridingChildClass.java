package methods3;

public class MethodOverridingChildClass extends MethodOverridingParentClass {
	public void message() {
		System.out.println("This is from Child Class.");
	}

	public static void main(String[] args) {
		MethodOverridingChildClass methodOverridingChildClass = new MethodOverridingChildClass();
		methodOverridingChildClass.message();
	}

}
