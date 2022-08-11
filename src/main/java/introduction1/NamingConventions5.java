package introduction1;

public class NamingConventions5 {

	public static void main(String[] args) {
		NamingConventions5 namingConventions = new NamingConventions5();

		System.out.println(namingConventions.camelCasingMethodName());

		System.out.println(PascalCasingInterfaceName.camelCasingVariable);
		System.out.print("Macro casing is followed for CONSTANT values in Java: ");
		System.out.println(PascalCasingInterfaceName.CONSTANT_VALUE);
	}

	public String camelCasingMethodName() {
		return "Camel Casing is followed for method names in Java.";
	}

	interface PascalCasingInterfaceName {
		public String camelCasingVariable = "Camel Casing is followed for variable names and Pascal casing for interface names in Java.";
		public final int CONSTANT_VALUE = 11;
	}

}
