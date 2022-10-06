package methods3;

public class MethodOverridingChildClass6_1 extends MethodOverridingParentClass6 {
	public void message() {
		System.out.println("This is from Child Class.");
	}

	public static void main(String[] args) {
		MethodOverridingChildClass6_1 methodOverridingChildClass = new MethodOverridingChildClass6_1();
		methodOverridingChildClass.message();
	}

}
