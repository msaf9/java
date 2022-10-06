package methods3;

public class MethodScopePublicPrivate3_2 {

	public static void main(String[] args) {
		MethodScopePublicPrivate3_2 methodScopePublicPrivate = new MethodScopePublicPrivate3_2();
		System.out.println("To understand global and class scope:");
		methodScopePublicPrivate.thisIsPublicMethod();
		methodScopePublicPrivate.thisIsPrivateMethod();
	}

	/*
	 * Scope is Global.
	 */
	public void thisIsPublicMethod() {
		System.out.println("This is a Public Method.");
	}

	/*
	 * Scope is class.
	 */
	private void thisIsPrivateMethod() {
		System.out.println("This is a Private Method.");
	}

}
